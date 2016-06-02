package com.dvoss.contactsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShowIndividualContact extends AppCompatActivity {

    Intent intent = getIntent();
    String display = intent.getStringExtra("display");

    //Bundle extras = getIntent().getExtras();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_individual_contact);
    }
}
