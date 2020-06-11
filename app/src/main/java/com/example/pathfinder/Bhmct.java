package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bhmct extends AppCompatActivity {
    private PDFView bhmct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhmct);

        bhmct=(PDFView)findViewById(R.id.bhmct);
        bhmct.fromAsset("BHMCT.pdf").load();
    }
}
