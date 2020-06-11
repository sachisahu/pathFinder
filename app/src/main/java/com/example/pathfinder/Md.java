package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Md extends AppCompatActivity {

    private PDFView md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md);

        md=(PDFView)findViewById(R.id.md);
        md.fromAsset("MD.pdf").load();
    }
}
