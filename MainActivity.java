package com.cit135.retryfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //declare objects
    private Button btnSubmit;
    private TextView txtView1;
    private EditText aEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//this is one of the confusing things for me, the xml and java can both alter the appearance and
// contradict each other.  the button text and color is set one way here, but set differently in the xml file
// looks like the java wins the argument

        //locate the property and assign the value
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        txtView1 = (TextView) findViewById(R.id.txtView1);
        aEditText = (EditText) findViewById(R.id.aEditText);

        btnSubmit.setText(R.string.button_name);
        btnSubmit.setTextColor(Color.RED);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){

                        String InputText;
                        InputText = aEditText.getText().toString();

                        txtView1.setVisibility(View.VISIBLE);
                        txtView1.setText(InputText);

        }

    });

    }


/*
    public void ShowMeText(View view){
        //first action on button click
        txtView1.setVisibility(View.VISIBLE);

        //text is shown
        txtView1.setText(R.string.show_text);
    }
*/

}
