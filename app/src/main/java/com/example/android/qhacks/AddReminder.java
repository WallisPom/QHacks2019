package com.example.android.qhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class AddReminder extends AppCompatActivity {

    private String cronString;

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;

    private int spinner1Int;
    private int spinner2Int;
    private int spinner3Int;
    private int spinner4Int;

    private ImageButton EnterInformation;

    // SPINNER 1 IS FOR START HOUR, SPINNER 5 IS END DATE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addreminder);


        Spinner dropdown = findViewById(R.id.spinner1);     // spinner1 is either position 0 or 1, text or navigation
        //create a list of items for the spinner.

        String[] items = new String[]{"Text", "Navigation"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);




        Spinner dropdown2 = findViewById(R.id.spinner2);    // spinner2 is hour
        //create a list of items for the spinner.
        String[] items2 = new String[]{"00", "01","02","03","04","05","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);


        Spinner dropdown3 = findViewById(R.id.spinner3);    // spinner3 is minute
        //create a list of items for the spinner.
        String[] items3 = new String[]{"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
//set the spinners adapter to the previously created one.
        dropdown3.setAdapter(adapter3);


        Spinner dropdown4 = findViewById(R.id.spinner4);    //spinner4 is start day
        //create a list of items for the spinner.
        String[] items4 = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
//set the spinners adapter to the previously created one.
        dropdown4.setAdapter(adapter4);




        Spinner dropdown5 = findViewById(R.id.spinner5);    //spinner5 is end day
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


        dropdown2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                if (position <= 23)
                    spinner1Int = position;
                else
                    spinner1Int = 0;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });


        dropdown3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){

                if(position <= 59)
                    spinner2Int = position;
                else
                    spinner2Int = 0;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

        dropdown4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){

                if(position <= 6)
                    spinner3Int = position;
                else
                    spinner3Int = 0;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

        dropdown5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){

                if(position <= 6)
                    spinner4Int = position;
                else
                    spinner4Int = 0;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

        EditText StartAddress = findViewById(R.id.enterStartAddress);
        EditText EndAddress = findViewById(R.id.enterEndAddress);



        EnterInformation =  findViewById(R.id.enterButtonReminder);

        EnterInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String spin1; // hour
                String spin2; // minute
                String spin3; // start day
                String spin4; // end day

                if (spinner4Int == 0){ // if the end date is Sunday, set cron to 7
                    spinner4Int = 7;
                }

                if (spinner3Int == spinner4Int){    // if the start and end dates are the same day, last value of cron is either the start or end date
                    spin1 = Integer.toString(spinner1Int);
                    spin2 = Integer.toString(spinner2Int);
                    spin3 = Integer.toString(spinner3Int);

                    cronString = spin2 + " " + spin1 + " * " + "* " + spin3;
                }

                if(spinner3Int != spinner4Int){
                    spin1 = Integer.toString(spinner1Int);
                    spin2 = Integer.toString(spinner2Int);
                    spin3 = Integer.toString(spinner3Int);
                    spin4 = Integer.toString(spinner4Int);

                    cronString = spin2 + " " + spin1 + " * " + "* " + spin3 + "-" + spin4;
                }
                Log.e("Cron String:",  cronString);


            }
        });




    }


}
