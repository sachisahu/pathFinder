package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bfs extends AppCompatActivity {
    private PDFView bfs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfs);
        bfs=(PDFView)findViewById(R.id.bfs);
        bfs.fromAsset("BFS.pdf").load();
    }
}
