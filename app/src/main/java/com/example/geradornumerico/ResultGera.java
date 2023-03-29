package com.example.geradornumerico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class ResultGera extends AppCompatActivity {
    Random nmr;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_gera);
        nmr = new Random();
        TextView trs=(TextView) findViewById(R.id.txt);
        String result = getIntent().getStringExtra("aleatorio");
         //x = (int) Double.parseDouble(aleatorio.getText().toString());
        x = Integer.parseInt(result);
        int valor = nmr.nextInt(x);
        trs.setText(valor);

    }
}