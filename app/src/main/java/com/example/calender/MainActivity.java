package com.example.calender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendarView = findViewById(R.id.calendarView);
        TextView yearTextView = findViewById(R.id.yearTextView);
        TextView monthTextView = findViewById(R.id.monthTextView);
        TextView dayTextView = findViewById(R.id.dayTextView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                yearTextView.setText(String.valueOf(i));
                monthTextView.setText(String.valueOf(i1+1));
                dayTextView.setText(String.valueOf(i2));
            }
        });
    }
}