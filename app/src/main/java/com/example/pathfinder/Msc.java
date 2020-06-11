package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Msc extends AppCompatActivity {

    private PDFView msc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msc);

        msc=(PDFView)findViewById(R.id.msc);
        msc.fromAsset("MSC.pdf").load();
    }
}
