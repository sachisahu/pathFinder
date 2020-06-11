package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PaintFlagsDrawFilter;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Btech extends AppCompatActivity {
    private PDFView btech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech);

        btech=(PDFView)findViewById(R.id.btech);
        btech.fromAsset("").load();
    }
}
