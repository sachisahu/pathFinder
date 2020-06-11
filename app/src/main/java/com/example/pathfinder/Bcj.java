package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bcj extends AppCompatActivity {
    private PDFView bcj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcj);
        bcj=(PDFView)findViewById(R.id.bcj);
        bcj.fromAsset("").load();
    }
}
