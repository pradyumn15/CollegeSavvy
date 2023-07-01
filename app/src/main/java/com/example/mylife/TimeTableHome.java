package com.example.mylife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class TimeTableHome extends AppCompatActivity {

 DrawerLayout drawerLayout;
 NavigationView navigationView;
 ActionBarDrawerToggle drawerToggle;
    public boolean onOptionsItemSelected(@NonNull MenuItem Item){
        if(drawerToggle.onOptionsItemSelected(Item))
        {
            return true;
        }
            return super.onOptionsItemSelected(Item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table_home);
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page1:
                    {
                        Toast.makeText(TimeTableHome.this,"FAQ",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.page2:
                    {
                        Toast.makeText(TimeTableHome.this,"Course Material",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.page3:
                    {
                        Toast.makeText(TimeTableHome.this,"Time Table",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.page4:
                    {
                        Toast.makeText(TimeTableHome.this,"Alarm",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.page6:
                    {
                        Toast.makeText(TimeTableHome.this,"Circular",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.page5:
                    {
                        Toast.makeText(TimeTableHome.this,"Logout",Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                return false;
            }
        });
    }
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }
    public void b1(View view){
        Intent intent=new Intent(TimeTableHome.this,TTInfo.class);
        Bundle b=new Bundle();
        b.putString("stuff","Monday");
        intent.putExtras(b);
        startActivity(intent);
    }
    public void b2(View view){
        Intent intent=new Intent(TimeTableHome.this,TTInfo.class);
        Bundle b=new Bundle();
        b.putString("stuff","Teusday");
        intent.putExtras(b);
        startActivity(intent);
    }
    public void b3(View view){
        Intent intent=new Intent(TimeTableHome.this,TTInfo.class);
        Bundle b=new Bundle();
        b.putString("stuff","Wednesday");
        intent.putExtras(b);
        startActivity(intent);
    }
    public void b4(View view){
        Intent intent=new Intent(TimeTableHome.this,TTInfo.class);
        Bundle b=new Bundle();
        b.putString("stuff","Thursday");
        intent.putExtras(b);
        startActivity(intent);
    }
    public void b5(View view){
        Intent intent=new Intent(TimeTableHome.this,TTInfo.class);
        Bundle b=new Bundle();
        b.putString("stuff","Friday");
        intent.putExtras(b);
        startActivity(intent);
    }
    public void b6(View view){
        Intent intent=new Intent(TimeTableHome.this,TTInfo.class);
        Bundle b=new Bundle();
        b.putString("stuff","Saturday");
        intent.putExtras(b);
        startActivity(intent);
    }
}