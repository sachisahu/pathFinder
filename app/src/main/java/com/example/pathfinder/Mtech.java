package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mtech extends AppCompatActivity {

    private PDFView mtech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtech);


        mtech=(PDFView)findViewById(R.id.mtech);
        mtech.fromAsset("MTECH.pdf").load();
    }
}
