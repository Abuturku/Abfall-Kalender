package com.andreasschick.abfallkalender;


import java.util.Calendar;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;
import android.app.Activity;
import android.graphics.Color;
 
public class CalendarMainActivity extends Activity {
	CalendarView calendar;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendar_main);
		
		calendar = (CalendarView)findViewById(R.id.calendar);
		calendar.setSelectedWeekBackgroundColor(Color.TRANSPARENT);
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.setOnDateChangeListener(new OnDateChangeListener(){
		@Override
		public void onSelectedDayChange(CalendarView view,int year, int month, int dayOfMonth) {
			
			Toast.makeText(getApplicationContext(),dayOfMonth +"/"+month+"/"+ year,Toast.LENGTH_LONG).show();
			}
		});
		
	}
}