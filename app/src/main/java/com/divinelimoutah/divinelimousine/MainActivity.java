/*
what to do next:
access data from the database.
-----------------create a login page.
-----------------check the username and password and see if they are correct.
create a main activity that shows that they are logged in, and one if they are not.
create the fleet page.
make the fleet button do something.
check if there is some way to do a calendar easily.
create the calendar page.
make the calendar button do something.
 */

package com.divinelimoutah.divinelimousine;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

/**
 *
 */
public class MainActivity extends ActionBarActivity {

//    public Customer customer = new Customer("Bob", "Joe", "8015461234", "8014567894", null, null, null, 0, null, "someone@gmail.com", "password");// created a fake customer to try it
    // eventually we need to pull from the database to get the customers.


    private boolean loggedIn = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(loggedIn )
            setContentView(R.layout.activity_main);
        else
            setContentView(R.layout.activity_reservation);

//        TextView tx = (TextView)findViewById(R.id.textView);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "LSANS.TTF");

//        tx.setTypeface(custom_font);

//        AssetManager am = context.getApplicationContext().getAssets();
//
//        typeface = Typeface.createFromAsset(am,
//                String.format(Locale.US, "fonts/%s", "abc.ttf"));
//
//        setTypeface(typeface);
        getActionBar().hide(); // this hides the action bar in the main activity
        //caveat: this will not work if the api is higher than 19
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    public void reservation(View view){
//        Intent intent = new Intent(this, ReservationActivity.class);
//        intent.putExtra("carReservations", customer.getReservations());
//        startActivity(intent);
//    }

    public void reserve(View view){
        Intent intent = new Intent(this, ReserveCarActivity.class);
        startActivity(intent);
    }

    public void login(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
