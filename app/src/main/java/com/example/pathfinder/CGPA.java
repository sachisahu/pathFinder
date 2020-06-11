package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CGPA extends AppCompatActivity {

    private EditText mark1,mark2,mark3,mark4,mark5,c1,c2,c3,c4,c5;
    private TextView output;
    private Button cgpa_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgp);
        mark1=(EditText)findViewById(R.id.mark1);
        mark2=(EditText)findViewById(R.id.mark2);
        mark3=(EditText)findViewById(R.id.mark3);
        mark4=(EditText)findViewById(R.id.mark4);
        mark5=(EditText)findViewById(R.id.mark5);
        c1=(EditText)findViewById(R.id.c1);
        c2=(EditText)findViewById(R.id.c2);
        c3=(EditText)findViewById(R.id.c3);
        c4=(EditText)findViewById(R.id.c4);
        c5=(EditText)findViewById(R.id.c5);
        output=(TextView)findViewById(R.id.cgpa);
        cgpa_btn=(Button)findViewById(R.id.cgpa_btn);


        cgpa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int m1,m2,m3,m4,m5,cg1,cg2,cg3,cg4,cg5;
                float result=0,temp=0;
                m1=Integer.parseInt(mark1.getText().toString());
                m2=Integer.parseInt(mark2.getText().toString());
                m3=Integer.parseInt(mark3.getText().toString());
                m4=Integer.parseInt(mark4.getText().toString());
                m5=Integer.parseInt(mark5.getText().toString());
                cg1=Integer.parseInt(c1.getText().toString());
                cg2=Integer.parseInt(c2.getText().toString());
                cg3=Integer.parseInt(c3.getText().toString());
                cg4=Integer.parseInt(c4.getText().toString());
                cg5=Integer.parseInt(c5.getText().toString());

                temp=((m1*cg1)+(m2*cg2)+(m3*cg3)+(m4*cg4)+(m5*cg5))/(cg1+cg2+cg3+cg4+cg5);
                result= (float) (temp*0.1);
                output.setText("CGPA:-"+String.valueOf(result));
            }
        });

    }
}
