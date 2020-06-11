package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bbs extends AppCompatActivity {
    PDFView bbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);

        bbs=(PDFView)findViewById(R.id.bbs);

        bbs.fromAsset("BBS.pdf").load();
    }
}
