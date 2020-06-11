package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bds extends AppCompatActivity {
    private PDFView bds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bds);
        bds=(PDFView)findViewById(R.id.bds);
        bds.fromAsset("BDS.pdf").load();
    }
}
