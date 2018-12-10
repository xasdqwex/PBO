package com.example.autodone.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText jari2,atas;
    private TextView volum;
    private Button hitung;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Persegi Panjang Luas");
        jari2 = (EditText) findViewById(R.id.jari);
        atas = (EditText) findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.hitung);
        volum = (TextView) findViewById(R.id.volume);

        hitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String jari = jari2.getText().toString().trim();
                String tinggi = atas.getText().toString().trim();

                double j = Double.parseDouble(jari);
                double t = Double.parseDouble(tinggi);

                double volume = 0.3*3.14*(j*j)* t;
                volum.setText("Volume = "+volume);
            }
        });
    }
}
