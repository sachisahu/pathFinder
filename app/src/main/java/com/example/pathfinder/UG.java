package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class UG extends AppCompatActivity {

    private Button ba,bsc,bcom,ballb,barc,bba,bpe,be,btech,bed,mbbs,bscbed,bds,bbs,bams,bca,bcs,bcj,bfa,bftech,bbm,mjmc,llb,bvsc,bsla,bta,bht,bscbmr,blit,bhmct,bfs,beied;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug);


        ba=(Button)findViewById(R.id.ba);
        bsc=(Button)findViewById(R.id.bsc);
        bcom=(Button)findViewById(R.id.bcom);
        ballb=(Button)findViewById(R.id.ballb);
        barc=(Button)findViewById(R.id.barc);
        bba=(Button)findViewById(R.id.bba);
        bpe=(Button)findViewById(R.id.bpe);
        be=(Button)findViewById(R.id.be);
        btech=(Button)findViewById(R.id.btech);
        bed=(Button)findViewById(R.id.bed);
        mbbs=(Button)findViewById(R.id.mbbs);
        bscbed=(Button)findViewById(R.id.bscbed);
        bds=(Button)findViewById(R.id.bds);
        bbs=(Button)findViewById(R.id.bbs);
        bams=(Button)findViewById(R.id.bams);
        bca=(Button)findViewById(R.id.bca);
        bcs=(Button)findViewById(R.id.bcs);
        bcj=(Button)findViewById(R.id.bcj);
        bfa=(Button)findViewById(R.id.bfa);
        bftech=(Button)findViewById(R.id.bftech);
        bbm=(Button)findViewById(R.id.bbm);
        mjmc=(Button)findViewById(R.id.mjmc);
        llb=(Button)findViewById(R.id.llb);
        bvsc=(Button)findViewById(R.id.bvsc);
        bsla=(Button)findViewById(R.id.bsla);
        bta=(Button)findViewById(R.id.bta);
        bht=(Button)findViewById(R.id.bht);
        bscbmr=(Button)findViewById(R.id.bscbmr);
        blit=(Button)findViewById(R.id.blit);
        bhmct=(Button)findViewById(R.id.bhmct);
        bfs=(Button)findViewById(R.id.bfs);
        beied=(Button)findViewById(R.id.beied);





        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Ba.class);
                startActivity(i);

            }
        });

        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bsc.class);
                startActivity(i);

            }
        });

        bcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bcom.class);
                startActivity(i);

            }
        });

        ballb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,BaLlb.class);
                startActivity(i);

            }
        });

        barc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Barc.class);
                startActivity(i);

            }
        });

        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bba.class);
                startActivity(i);

            }
        });

        bpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bpe.class);
                startActivity(i);

            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Be.class);
                startActivity(i);

            }
        });

        btech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Btech.class);
                startActivity(i);

            }
        });
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bed.class);
                startActivity(i);

            }
        });

        mbbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Mbbs.class);
                startActivity(i);

            }
        });

        bscbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bscbed.class);
                startActivity(i);

            }
        });

        bds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,bds.class);
                startActivity(i);

            }
        });

        bbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bbs.class);
                startActivity(i);

            }
        });

        bams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bams.class);
                startActivity(i);

            }
        });

        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bca.class);
                startActivity(i);

            }
        });

        bcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bcs.class);
                startActivity(i);

            }
        });

        bcj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bcj.class);
                startActivity(i);

            }
        });
        bfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bfa.class);
                startActivity(i);

            }
        });

        bftech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bftech.class);
                startActivity(i);

            }
        });

        bbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bbm.class);
                startActivity(i);

            }
        });
        mjmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Mjmc.class);
                startActivity(i);

            }
        });
        llb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Llb.class);
                startActivity(i);

            }
        });

        bvsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bvsc.class);
                startActivity(i);

            }
        });

        bsla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bsla.class);
                startActivity(i);

            }
        });

        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bta.class);
                startActivity(i);

            }
        });

        bht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bht.class);
                startActivity(i);

            }
        });

        /*bscbmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UG.this,Bscbmr.class);
                startActivity(i);
            }
        });*/

        blit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Blit.class);
                startActivity(i);

            }
        });

        bhmct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bhmct.class);
                startActivity(i);

            }
        });

        bfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Bfs.class);
                startActivity(i);

            }
        });

        beied.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UG.this,Beied.class);
                startActivity(i);

            }
        });
    }
}
