package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class PG extends AppCompatActivity {

    private Button ma,marc,mba,mca,mcom,md,mpharma,mphil,msc,mtech,mvsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg);

        ma=(Button)findViewById(R.id.ma);
        marc=(Button)findViewById(R.id.marc);
        mba=(Button)findViewById(R.id.mba);
        mca=(Button)findViewById(R.id.mca);
        mcom=(Button)findViewById(R.id.mcom);
        md=(Button)findViewById(R.id.md);
        mpharma=(Button)findViewById(R.id.mpharma);
        mphil=(Button)findViewById(R.id.mphil);
        msc=(Button)findViewById(R.id.msc);
        mtech=(Button)findViewById(R.id.mtech);
        mvsc=(Button)findViewById(R.id.mvsc);

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Ma.class);
                startActivity(i);

            }
        });

        marc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Marc.class);
                startActivity(i);

            }
        });

        mba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Mba.class);
                startActivity(i);

            }
        });


        mca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Mca.class);
                startActivity(i);

            }
        });

        mcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Mcom.class);
                startActivity(i);

            }
        });

        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Md.class);
                startActivity(i);

            }
        });

        mpharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Mpharma.class);
                startActivity(i);

            }
        });

        mphil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Mphil.class);
                startActivity(i);

            }
        });

        msc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Msc.class);
                startActivity(i);

            }
        });

        mtech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Mtech.class);
                startActivity(i);

            }
        });

        mvsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(PG.this,Mvsc.class);
                startActivity(i);

            }
        });
    }
}
