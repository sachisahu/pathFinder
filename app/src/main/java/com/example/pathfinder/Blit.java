package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Blit extends AppCompatActivity {
    private PDFView blit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blit);
        blit=(PDFView)findViewById(R.id.blit);
        blit.fromAsset("").load();
    }
}
