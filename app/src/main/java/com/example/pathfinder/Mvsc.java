package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mvsc extends AppCompatActivity {

    private PDFView mvsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvsc);


        mvsc=(PDFView)findViewById(R.id.mvsc);
        mvsc.fromAsset("MVSC.pdf").load();
    }
}
