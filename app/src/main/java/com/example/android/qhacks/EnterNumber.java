package com.example.android.qhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class EnterNumber extends AppCompatActivity {

    EditText phoneNumber;

    private ImageButton enterNumberStored;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_number);

        phoneNumber = (EditText)findViewById(R.id.enter_number_edittext);
         //String finalNumber = phoneNumber.getText().toString();


        enterNumberStored =  findViewById(R.id.enterButtonSmallXML);


        enterNumberStored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity

                Log.v("MYINT",  phoneNumber.getText().toString());
                Intent intent = new Intent(EnterNumber.this, Reminders.class);

                //Log.d("MYINT", "Final Number:" + finalNumber);
                   //Toast.makeText(EnterNumber.this, finalNumber, Toast.LENGTH_LONG).show();




                startActivity(intent);
            }
        });



    }
}
