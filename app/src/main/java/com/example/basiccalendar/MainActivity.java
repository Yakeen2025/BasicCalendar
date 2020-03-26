package com.example.basiccalendar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView textView;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView=findViewById(R.id.cv);
        textView=findViewById(R.id.dv);
        view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.red);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int y, int m, int d) {
                String date=d+"-"+(m+1)+"-"+y;
                textView.setText(date);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.mymenu){
            Intent intent;
            startActivity(new Intent(MainActivity.this,Screen.class));

        }
        if(item.getItemId()==R.id.set){
            Intent intent;
            startActivity(new Intent(MainActivity.this,Screen1.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
