package com.example.mylife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewholder> {
    Context context;
    ArrayList<user> list;

    public Myadapter(Context context,ArrayList<user> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        user user=list.get(position);
        holder.Subject.setText(user.getSubject());
        holder.EndTime.setText(user.getEndTime());
        holder.Stime.setText(user.getStartTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static  class MyViewholder extends RecyclerView.ViewHolder{
        TextView Stime,EndTime,Subject;
        public MyViewholder(@NonNull View itemView){
            super(itemView);
            Subject=itemView.findViewById(R.id.subjectvalue);
            EndTime=itemView.findViewById(R.id.Etimevalue);
            Stime=itemView.findViewById(R.id.Stimevalue);

        }
    }
}
