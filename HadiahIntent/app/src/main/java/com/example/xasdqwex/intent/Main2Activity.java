package com.example.xasdqwex.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    TextView tvHasil = (TextView) findViewById(R.id.hasil);
    tvHasil.setText("Hasilnya adalah = " + getIntent().getStringExtra("hasil"));
    }
}
