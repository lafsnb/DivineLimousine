package com.divinelimoutah.divinelimousine;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    private int btn;
    private String time;
//    private TextView txtView;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        view.setCurrentHour(hourOfDay);
        view.setCurrentMinute(minute);

        if(btn == 1) {
            time = "Start Of Reservation: " + getTime(hourOfDay, minute);
//            txtView = getActivity().findViewById(R.id.pickUpText);
//            txtView.setText(getTime(hourOfDay, minute));
        }
        else if(btn == 2) {
            time = "End Of Reservation: " + getTime(hourOfDay, minute);
        }
        else {
            time = "Time Of First Pick Up: " + getTime(hourOfDay, minute);
        }


    }

    private String getTime(int hr,int min) {
        Time tme = new Time(hr,min,0);//seconds by default set to zero
        Format formatter;
        formatter = new SimpleDateFormat("h:mm a");
        return formatter.format(tme);
    }

    public void setButton(int b) {
        this.btn = b;
    }

    public String getTime() { return this.time; }
}