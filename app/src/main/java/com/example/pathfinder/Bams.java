package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bams extends AppCompatActivity {
    private PDFView bams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bams);

        bams=(PDFView)findViewById(R.id.bams);

        bams.fromAsset("BAMS.pdf").load();
    }
}
