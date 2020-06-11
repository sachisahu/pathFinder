package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Barc extends AppCompatActivity {
    private PDFView barc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barc);
        barc=(PDFView)findViewById(R.id.barc);
        barc.fromAsset("").load();
    }
}
