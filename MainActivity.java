package com.cit135.retryfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//this is one of the confusing things for me, the xml and java can both alter the appearance and
// contradict each other.  the button text and color is set one way here, but set differently in the xml file
// looks like the java wins the argument
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setText(R.string.button_name);
        btnSubmit.setTextColor(Color.RED);
    }
}
