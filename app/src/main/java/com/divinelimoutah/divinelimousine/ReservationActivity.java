package com.divinelimoutah.divinelimousine;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReservationActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        String[] reservations = {
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time",
                "Car Date Time"
        };

        List<String> carReservations = new ArrayList<String>(Arrays.asList(reservations));

        ArrayAdapter reservationAdapter = new ArrayAdapter(
                this, R.layout.list_item_reservation, R.id.list_item_reservation_textview, carReservations);

        ListView listView = (ListView) this.findViewById(R.id.listViewReservations);
        listView.setAdapter(reservationAdapter);
    }

}
