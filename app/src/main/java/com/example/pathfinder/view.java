package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class view extends AppCompatActivity {
    private PDFView btech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        btech=(PDFView)findViewById(R.id.pdfv);

        btech.fromAsset("B.pdf").load();
    }
}
