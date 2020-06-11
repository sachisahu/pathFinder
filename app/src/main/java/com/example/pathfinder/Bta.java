package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bta extends AppCompatActivity {

    private PDFView bta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bta);

        bta=(PDFView)findViewById(R.id.bta);
        bta.fromAsset("BTA.pdf").load();
    }
}
