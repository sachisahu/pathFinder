package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText uName;
    private EditText uPass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uName=(EditText)findViewById(R.id.uName);
        uPass=(EditText)findViewById(R.id.uPass);
        login=(Button)findViewById(R.id.login);
        //cgp_btn=(Button)findViewById(R.id.cgpa_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(uName.getText().toString(), uPass.getText().toString());
            }
        });





    }
    private void validate(String uname,String uPass)
    {
        if((uname.equals("Sachi")&&uPass.equals("1234"))
                ||uname.equals("Mano")&&uPass.equals("1234")
                ||uname.equals("Aman")&&uPass.equals("1234")
                ||uname.equals("Jay")&&uPass.equals("1234")
                ||uname.equals("")&&uPass.equals(""))
        {
            Intent intent = new Intent(MainActivity.this, Qualification.class);
            startActivity(intent);
        }
    }
}
