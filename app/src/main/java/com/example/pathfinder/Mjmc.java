package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mjmc extends AppCompatActivity {
    private PDFView mjmc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mjmc);
        mjmc=(PDFView)findViewById(R.id.mjmc);
        mjmc.fromAsset("").load();
    }
}
