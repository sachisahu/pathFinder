package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bcs extends AppCompatActivity {
    private PDFView bcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcs);
        bcs=(PDFView)findViewById(R.id.bcs);
        bcs.fromAsset("BCS.pdf").load();

    }
}
