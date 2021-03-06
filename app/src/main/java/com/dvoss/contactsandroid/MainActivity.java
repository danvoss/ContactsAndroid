package com.dvoss.contactsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    ArrayAdapter<Contact> contacts;

    ListView list;
    EditText name;
    EditText phone;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        name = (EditText) findViewById(R.id.editText);
        phone = (EditText) findViewById(R.id.editText2);
        addButton = (Button) findViewById(R.id.button);

        contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(contacts);

        addButton.setOnClickListener(this);
        list.setOnItemLongClickListener(this);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Contact newContact = new Contact(name.getText().toString(), phone.getText().toString());
        contacts.add(newContact);
        name.setText("");
        phone.setText("");
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contact oldContact = contacts.getItem(position);
        contacts.remove(oldContact);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ShowIndividualContact.class);
        Contact showContact = contacts.getItem(position);
        String display = showContact.toString();
        intent.putExtra("displayContact", display);
        startActivity(intent);
    }
}
