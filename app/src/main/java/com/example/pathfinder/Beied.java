package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Beied extends AppCompatActivity {
    private PDFView beied;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beied);

        beied=(PDFView)findViewById(R.id.beied);
        beied.fromAsset("BEIED.pdf").load();
    }
}
