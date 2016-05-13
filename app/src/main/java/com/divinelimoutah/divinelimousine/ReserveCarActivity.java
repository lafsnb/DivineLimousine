package com.divinelimoutah.divinelimousine;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TimePicker;

public class ReserveCarActivity extends ActionBarActivity {

    public static TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_car);

        timePicker = (TimePicker) findViewById(R.id.timePicker);

    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showPickUpTimePickerDialog(View v) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.setButton(1);
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void showDropOffTimePickerDialog(View v) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.setButton(2);
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }


}
