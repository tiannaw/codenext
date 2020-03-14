package com.example.demorecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class contactAdapter extends ArrayAdapter<contact> {

    private Context myContext;
    private ArrayList<contact> myContacts= new ArrayList<contact>();

    public contactAdapter(Context myContext, ArrayList<contact> myContacts);

        super(myContext, 0, myContacts);
        this.myContext = myContext;
        this.myContacts = myContacts;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(myContacts == null){

            convertView = LayoutInflater.from(myContext).inflate(R.layout.contact_items, parent, false);

        }

        contact currentContact = myContacts.get(position);

        //beginning to link
        ImageView profilePic = convertView.findViewById(R.id.profilePic);
        profilePic.setImageResource(currentContact.getProfilePic());

        TextView name = convertView.findViewById(R.id.name);
        name.setText(currentContact.getName());

        TextView number = convertView.findViewById(R.id.number);
        number.setText(currentContact.getNumber());

        return convertView;












        return super.getView(position, convertView, parent);
    }
}
