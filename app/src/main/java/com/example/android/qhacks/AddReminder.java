package com.example.android.qhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class AddReminder extends AppCompatActivity {
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;

    private int spinner1Int;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addreminder);
        Spinner dropdown = findViewById(R.id.spinner1);
        //create a list of items for the spinner.
        String[] items = new String[]{"Text", "Navigation"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);


       // System.out.println(adapter);


        Spinner dropdown2 = findViewById(R.id.spinner2);
        //create a list of items for the spinner.
        String[] items2 = new String[]{"00", "01","02","03","04","05","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
//set the spinners adapter to the previously created one.
        dropdown2.setAdapter(adapter2);


        Spinner dropdown3 = findViewById(R.id.spinner3);
        //create a list of items for the spinner.
        String[] items3 = new String[]{"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
//set the spinners adapter to the previously created one.
        dropdown3.setAdapter(adapter3);


        Spinner dropdown4 = findViewById(R.id.spinner4);
        //create a list of items for the spinner.
        String[] items4 = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
//set the spinners adapter to the previously created one.
        dropdown4.setAdapter(adapter4);


        Spinner dropdown5 = findViewById(R.id.spinner5);
        //create a list of items for the spinner.
        String[] items5 = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);
//set the spinners adapter to the previously created one.
        dropdown5.setAdapter(adapter5);


        imageButton1 =  findViewById(R.id.imageButton1);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(AddReminder.this, AddReminder.class);
                startActivity(intent);
            }
        });

        imageButton2 =  findViewById(R.id.imageButton2);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(AddReminder.this, Reminders.class);
                startActivity(intent);
            }
        });

        imageButton3 =  findViewById(R.id.imageButton3);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(AddReminder.this, Navigation.class);
                startActivity(intent);
            }
        });

        imageButton4 =  findViewById(R.id.imageButton4);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(AddReminder.this, Settings.class);
                startActivity(intent);
            }


        });


        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                switch (position){
                    case 0:
                        spinner1Int = 0;
                        Log.d("MYINT", "Selected" + spinner1Int);
                        break;
                    case 1:
                        spinner1Int = 1;
                        Log.d("MYINT", "Selected" + spinner1Int);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }


}
