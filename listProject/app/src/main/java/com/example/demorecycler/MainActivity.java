package com.example.demorecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<contact> contacts;
    private ListView list;
    private contactAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList<contact>();
        list = findViewById(R.id.items); //list is linked

        //contacts.add(new contact(R.drawable.ic_launcher_background, tianna,  ))
        myAdapter = new contactAdapter(this, contact);
        list.setAdapter(myAdapter);


    }
}
