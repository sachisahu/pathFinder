package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mphil extends AppCompatActivity {

    private PDFView mphil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mphil);

        mphil=(PDFView)findViewById(R.id.mphil);
        mphil.fromAsset("MPHIL.pdf").load();
    }
}
