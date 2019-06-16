package com.example.miwoklanguage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

    }

    public void listOfNumbers(View view){
        Intent i = new Intent(this,NumbersActivity.class);
        startActivity(i);
    }



    public void listOfFamily(View view){
        Intent i = new Intent(this,FamilyActivity.class);
        startActivity(i);
    }

    public void listOfPhrases(View view){
        Intent i = new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }

    public void listOfColors(View view){
        Intent i = new Intent(this,ColorsActivity.class);
        startActivity(i);
    }

}
