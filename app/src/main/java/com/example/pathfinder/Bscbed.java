package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bscbed extends AppCompatActivity {
    private PDFView bscbed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bscbed);

        bscbed=(PDFView)findViewById(R.id.bscbed);
        bscbed.fromAsset("").load();
    }
}
