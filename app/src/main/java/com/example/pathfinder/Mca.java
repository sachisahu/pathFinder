package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mca extends AppCompatActivity {

    private PDFView mca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca);

        mca=(PDFView)findViewById(R.id.mca);
        mca.fromAsset("MCA.pdf").load();
    }
}
