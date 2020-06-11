package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bvsc extends AppCompatActivity {
    private PDFView bvsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bvsc);

        bvsc=(PDFView)findViewById(R.id.bvsc);
        bvsc.fromAsset("").load();
    }
}
