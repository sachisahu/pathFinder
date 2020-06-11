package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mpharma extends AppCompatActivity {

    private PDFView mpharma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpharma);

        mpharma=(PDFView)findViewById(R.id.mpharma);
        mpharma.fromAsset("MPHARMA.pdf").load();
    }
}
