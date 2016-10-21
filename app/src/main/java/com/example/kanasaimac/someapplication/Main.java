package com.example.kanasaimac.someapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    public static String intkey = "intX";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView) findViewById(R.id.text1);
        tv.setText("Hello World!");

        Button buttonA = (Button) findViewById(R.id.btnA);
        Button buttonB = (Button) findViewById(R.id.btnB);

        View.OnClickListener mylistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,Main2.class);
                intent.putExtra(intkey,30);
                startActivity(intent);
            }
        };

        buttonA.setOnClickListener(mylistener);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,Main2.class);
                intent.putExtra(intkey,5);
                startActivity(intent);
            }
        });

    }
}
