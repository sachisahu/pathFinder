package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bftech extends AppCompatActivity {
    private PDFView bftech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bftech);

        bftech=(PDFView)findViewById(R.id.bftech);
        bftech.fromAsset("").load();

    }
}
