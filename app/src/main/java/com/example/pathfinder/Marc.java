package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Marc extends AppCompatActivity {

    private PDFView marc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marc);



        marc=(PDFView) findViewById(R.id.marc);
        marc.fromAsset("MARC.pdf").load();
    }
}
