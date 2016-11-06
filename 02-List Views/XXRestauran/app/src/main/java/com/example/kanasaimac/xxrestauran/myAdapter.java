package com.example.kanasaimac.xxrestauran;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by kanasaimac on 04/11/2016.
 */

public class myAdapter extends ArrayAdapter {

    ArrayList<Dish> myItems;
    LayoutInflater inflater;

    public myAdapter(Context context, int resource, ArrayList<Dish> myItems) {
        super(context, resource);
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        this.myItems = myItems;

    }

    @Override
    public int getCount() {
        return myItems.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.listcell,null);
        TextView tv = (TextView) convertView.findViewById(R.id.name);
        tv.setText(myItems.get(position).getName());
        return convertView;
    }
}
