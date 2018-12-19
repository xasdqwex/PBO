package com.example.autodone.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menu1 (View view){
        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent);


    }
    public void menu2 (View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
