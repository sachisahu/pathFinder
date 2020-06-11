package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bfa extends AppCompatActivity {
    private PDFView bfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfa);

        bfa=(PDFView)findViewById(R.id.bfa);
        bfa.fromAsset("").load();
    }
}
