package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bcom extends AppCompatActivity {
    private PDFView bcom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcom);
        bcom=(PDFView)findViewById(R.id.bcom);
        bcom.fromAsset("").load();
    }
}
