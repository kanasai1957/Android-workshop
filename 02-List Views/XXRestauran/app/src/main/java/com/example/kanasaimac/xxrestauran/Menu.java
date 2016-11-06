package com.example.kanasaimac.xxrestauran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView listView = (ListView) findViewById(R.id.menulist);
        Dish dish1 = new Dish();
        Dish dish2 = new Dish();
        Dish dish3 = new Dish();
        Dish dish4 = new Dish();

        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(dish1);
        dish1.setName("hotdog");
        dishes.add(dish2);
        dish2.setName("roti canai");
        dishes.add(dish3);
        dish3.setName("coke");
        dishes.add(dish4);
        dish4.setName("sprite");

        myAdapter listAdapter = new myAdapter(this, R.layout.listcell, dishes);
//        ArrayAdapter myAdapter = ArrayAdapter.createFromResource(this, R.array.dish,android.R.layout.simple_list_item_1);
        listView.setAdapter(listAdapter);

    }
}
