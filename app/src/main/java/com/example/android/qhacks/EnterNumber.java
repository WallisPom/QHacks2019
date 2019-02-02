package com.example.android.qhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EnterNumber extends AppCompatActivity {

    private EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_number);

        number =  findViewById(R.id.enter_number_edittext);
    }
}
