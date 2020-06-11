package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mbbs extends AppCompatActivity {
    private PDFView mbbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbbs);

        mbbs=(PDFView)findViewById(R.id.mbbs);
        mbbs.fromAsset("MBBS.pdf").load();
    }
}
