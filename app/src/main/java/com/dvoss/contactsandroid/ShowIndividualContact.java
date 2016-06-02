package com.dvoss.contactsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowIndividualContact extends AppCompatActivity {

    TextView text;

    //  connect to xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_individual_contact);

        //text = findViewById(R.id. // textview id?? )

        Intent intent = getIntent();
        String display = intent.getStringExtra("display");

        // ?? Bundle extras = getIntent().getExtras();
    }
}
