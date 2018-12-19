package com.example.autodone.hitungluas;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungLuas extends AppCompatActivity {

    private EditText edtPanjang, edtLebar, edtTinggi;
    private TextView txtLuas;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang=(EditText) findViewById(R.id.panjang);
        edtLebar=(EditText) findViewById(R.id.lebar);
        btnHitung=(Button) findViewById(R.id.hitung);
        txtLuas=(TextView) findViewById(R.id.luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p* l;
                txtLuas.setText (" Luas = "+ luas );


            }
        });


    }
}
