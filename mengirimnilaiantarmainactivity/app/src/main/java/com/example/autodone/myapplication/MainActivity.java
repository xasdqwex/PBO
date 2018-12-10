package com.example.autodone.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etData1 = (EditText) findViewById(R.id.et_data1);
        final EditText etData2 = (EditText) findViewById((R.id.et_data2));
        final EditText etData3 = (EditText) findViewById((R.id.et_data3));
        Button btnsubmit =(Button) findViewById(R.id.bt_submit);
        Button btnSubmitIntent = (Button) findViewById(R.id.bt_submitintent);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("data1", etData1.getText().toString());
                bundle.putString("data2", etData2.getText().toString());
                bundle.putString("data3", etData3.getText().toString());
                Intent intent = new Intent (MainActivity.this,Main2Activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btnSubmitIntent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("data1", etData1.getText().toString());
                intent.putExtra("data2", etData2.getText().toString());
                intent.putExtra("data3", etData3.getText().toString());
                startActivity(intent);
            }
        });

    }
}
