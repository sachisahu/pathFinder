package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bscbmr extends AppCompatActivity {
    private PDFView bscbmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bscbmr);

        bscbmr=(PDFView)findViewById(R.id.bscbmr);
        bscbmr.fromAsset("").load();
    }
}
