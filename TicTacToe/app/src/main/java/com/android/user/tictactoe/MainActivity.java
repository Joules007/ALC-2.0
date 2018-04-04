package com.android.user.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_main
        //.xml layout file
        setContentView(R.layout.activity_main);

        TextView grid3 = (TextView)findViewById(R.id.gridthree);

        //Set a clickListener on that view
        grid3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link NumbersActivity}
                Intent grid3Intent = new Intent(MainActivity.this, Grid3Activity.class);

                //Start the new activity
                startActivity(grid3Intent);

            }
        });

        TextView grid4 = (TextView)findViewById(R.id.gridfour);

        //Set a clickListener on that view
        grid4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link NumbersActivity}
                Intent grid4Intent = new Intent(MainActivity.this, Grid4Activity.class);

                //Start the new activity
                startActivity(grid4Intent);

            }
        });

        TextView grid5 = (TextView)findViewById(R.id.gridfive);

        //Set a clickListener on that view
        grid5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link NumbersActivity}
                Intent grid5Intent = new Intent(MainActivity.this, Grid5Activity.class);

                //Start the new activity
                startActivity(grid5Intent);

            }
        });

    }
}
