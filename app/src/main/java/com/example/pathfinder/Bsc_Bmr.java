package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc_Bmr extends AppCompatActivity {
    private PDFView bsc_bmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc__bmr);

        bsc_bmr=(PDFView)findViewById(R.id.bsc_bmr);
        bsc_bmr.fromAsset("").load();
    }
}
