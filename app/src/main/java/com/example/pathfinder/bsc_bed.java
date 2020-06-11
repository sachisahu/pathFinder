package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bsc_bed extends AppCompatActivity {
    private PDFView bsc_bed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_bed);
        bsc_bed=(PDFView)findViewById(R.id.bsc_bed);
        bsc_bed.fromAsset("").load();
    }
}
