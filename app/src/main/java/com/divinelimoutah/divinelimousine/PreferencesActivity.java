package com.divinelimoutah.divinelimousine;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;

public class PreferencesActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        EditText editText = (EditText)findViewById(R.id.editText1);
        editText.setCompoundDrawables(null, null, getResources().getDrawable(R.drawable.white_spacer), null);

    }

}
