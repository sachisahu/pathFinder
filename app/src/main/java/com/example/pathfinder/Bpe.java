package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bpe extends AppCompatActivity {
    private PDFView bpe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpe);
        bpe=(PDFView)findViewById(R.id.bpe);
        bpe.fromAsset("").load();
    }
}
