package com.example.TestApp;

import android.app.Activity;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.example.MyFirstApp.MESSAGE";


    private TextView latituteField;
    private TextView longitudeField;
    private LocationManager locationManager;
    private String provider;

    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void showPicture(View view){
        Intent intent = new Intent(this, DisplayPicture.class);
        startActivity(intent);
    }


}
