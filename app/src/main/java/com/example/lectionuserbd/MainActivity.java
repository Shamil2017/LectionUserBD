package com.example.lectionuserbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRegistration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRegistration = findViewById(R.id.btnRegistration);

    }

    public void onClick(View view) {

       Intent go = new Intent(this, RegistationActivity.class  );
       startActivity(go);



    }
}