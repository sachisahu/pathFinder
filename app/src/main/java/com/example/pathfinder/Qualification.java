package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qualification extends AppCompatActivity {


    private Button high,UG,PG,cgpa_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);

        high=(Button)findViewById(R.id.HighSchool);
        UG=(Button)findViewById(R.id.UG);
        PG=(Button)findViewById(R.id.PG);
        cgpa_btn=(Button)findViewById(R.id.cgpa_btn);


        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Qualification.this,HighSchool.class);
                startActivity(i);

            }
        });

        UG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Qualification.this,UG.class);
                startActivity(i);

            }
        });

        PG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Qualification.this,PG.class);
                startActivity(i);

            }
        });
        cgpa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Qualification.this, CGPA.class);
                startActivity(i);
            }
        });
    }
}
