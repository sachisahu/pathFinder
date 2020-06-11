package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bf_Tech extends AppCompatActivity {
    private PDFView bf_tech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bf__tech);
        bf_tech=(PDFView)findViewById(R.id.bf_tech);
        bf_tech.fromAsset("").load();    }
}
