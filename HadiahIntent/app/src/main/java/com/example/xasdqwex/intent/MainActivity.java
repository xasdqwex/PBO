package com.example.xasdqwex.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etData1 = (EditText) findViewById(R.id.imp_data);
        final EditText etData2 = (EditText) findViewById(R.id.imp_data2);
        Button btJumlah = (Button) findViewById(R.id.bt_jumlah);
        Button btKurang = (Button) findViewById(R.id.bt_kurang);

        btJumlah.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v){

                    String data1 = etData1.getText().toString().trim();
                    String data2 = etData2.getText().toString().trim();

                    double d1 = Double.parseDouble(data1);
                    double d2 = Double.parseDouble(data2);

                    double hasil = d1+d2;

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("hasil",Double.toString(hasil));
                    startActivity(intent);
                }
        });

        btKurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String data1 =etData1.getText().toString().trim();
                String data2 =etData2.getText().toString().trim();

                double d1 = Double.parseDouble(data1);
                double d2 = Double.parseDouble(data2);

                double hasil = d1-d2;

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("hasil",Double.toString(hasil));
                startActivity(intent);
            }
        });
    }
}
