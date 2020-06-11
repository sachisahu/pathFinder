package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bca extends AppCompatActivity {
    private PDFView bca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca);

        bca=(PDFView)findViewById(R.id.bca);
        bca.fromAsset("BCA.pdf").load();
    }
}
