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

        ArrayList<Reservation> carReservations = (ArrayList<Reservation>) savedInstanceState.get("carReservations");
//        Reservation[] reservations = {
//
//        };
//
//        List<Reservation> carReservations = new ArrayList<Reservation>(Arrays.asList(reservations));

        if(carReservations.size() <= 0) {
            // set a label to say they have no reservations and they can reserve a car by going back to the main page.
        }
        if(carReservations.size() <= 3) {
            // set the layout to be bigger and show a bigger car size.
        }
        else {
            // set the layout of the list to be small so that they can still c their cars, but not as big.
        }

//        ArrayAdapter reservationAdapter = new ArrayAdapter(
//                this, R.layout.list_item_reservation, R.id.list_item_reservation_textview, carReservations);
//
//        ListView listView = (ListView) this.findViewById(R.id.listViewReservations);
//        listView.setAdapter(reservationAdapter);
    }

}
