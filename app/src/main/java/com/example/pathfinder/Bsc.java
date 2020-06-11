package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bsc extends AppCompatActivity {
    private PDFView bsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc);
        bsc=(PDFView)findViewById(R.id.bsc);
        bsc.fromAsset("BSC.pdf").load();
    }
}
