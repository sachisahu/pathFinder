package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bba extends AppCompatActivity {
    private PDFView bba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba);
        bba=(PDFView)findViewById(R.id.bba);
        bba.fromAsset("").load();
    }
}
