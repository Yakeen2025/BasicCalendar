package com.example.Calendar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView textView;
    View view;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView=findViewById(R.id.cv);
        textView=findViewById(R.id.dv);
        view=findViewById(R.id.rel);

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
        switch (item.getItemId()) {
            case R.id.b1:
                view.setBackgroundResource(R.drawable.back1);

                return true;
            case R.id.b2:
                view.setBackgroundResource(R.drawable.back2);
                return true;
            case R.id.b3:
                view.setBackgroundResource(R.drawable.cal);
                return true;
            case R.id.b4:
                view.setBackgroundResource(R.drawable.call);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
