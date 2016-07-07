package com.divinelimoutah.divinelimousine;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TimePicker;

public class ReserveCarActivity extends ActionBarActivity {

    public static TimePicker timePicker;
    private TextView reservationStartTextView;
    private TextView reservationEndTextView;
    private TextView pickUpTimeTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_car);
//        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "LSANS.TTF");
//        TextView dateTextView = (TextView) findViewById(R.id.dateLbl);
//        reservationStartTextView = (TextView) findViewById(R.id.reservationStart);
//        reservationEndTextView = (TextView) findViewById(R.id.reservationEnd);
//        pickUpTimeTextView = (TextView) findViewById(R.id.firstPickUpTime);
//
//        dateTextView.setTypeface(myTypeface);
//
//        timePicker = (TimePicker) findViewById(R.id.timePicker);

    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showStartTimePickerDialog(View v) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.setButton(1);
        newFragment.show(getSupportFragmentManager(), "timePicker");
        // error: this is setting it to null before the user picks the time!!!
        reservationStartTextView.setText("Start Of Reservation: " + newFragment.getTime());
    }

    public void showEndTimePickerDialog(View v) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.setButton(2);
        newFragment.show(getSupportFragmentManager(), "timePicker");
        reservationEndTextView.setText("End Of Reservation: " + newFragment.getTime());
    }

    public void showPickUpTimePickerDialog(View v) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.setButton(3);
        newFragment.show(getSupportFragmentManager(), "timePicker");
        pickUpTimeTextView.setText("Time Of First Pick Up: " + newFragment.getTime());
    }

    public void openKeyboard(View v) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }


}
