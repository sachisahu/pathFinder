package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ma extends AppCompatActivity {

    private PDFView ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma);


        ma=(PDFView)findViewById(R.id.ma);
        ma.fromAsset("MA.pdf").load();
    }
}
