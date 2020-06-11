package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Llb extends AppCompatActivity {
    private PDFView llb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llb);
        llb=(PDFView)findViewById(R.id.llb);
        llb.fromAsset("LLB.pdf").load();
    }
}
