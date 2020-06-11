package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BaLlb extends AppCompatActivity {
    private PDFView ballb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_llb);
        ballb=(PDFView)findViewById(R.id.ballb);
        ballb.fromAsset("").load();
    }
}
