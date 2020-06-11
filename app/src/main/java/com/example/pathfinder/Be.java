package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Be extends AppCompatActivity {
    private PDFView be;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be);
        be=(PDFView)findViewById(R.id.be);
        be.fromAsset("").load();
    }
}
