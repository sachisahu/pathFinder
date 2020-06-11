package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bed extends AppCompatActivity {
    private PDFView bed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed);


        bed=(PDFView)findViewById(R.id.bed);
        bed.fromAsset("BED.pdf").load();
    }
}
