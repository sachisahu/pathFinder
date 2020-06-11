package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bbm extends AppCompatActivity {
    private PDFView bbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbm);

        bbm=(PDFView)findViewById(R.id.bbm);
        bbm.fromAsset("").load();
    }
}
