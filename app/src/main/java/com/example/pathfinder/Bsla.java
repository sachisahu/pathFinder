package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsla extends AppCompatActivity {
    private PDFView bsla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsla);

        bsla=(PDFView)findViewById(R.id.bsla);
        bsla.fromAsset("BSLA.pdf").load();

    }
}
