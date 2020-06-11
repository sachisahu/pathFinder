package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ba extends AppCompatActivity {

    private PDFView ba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba);
        ba=(PDFView)findViewById(R.id.ba);

        ba.fromAsset("BA.pdf").load();
    }
}
