package com.example.geradornumerico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnfax = findViewById(R.id.acao);
        EditText e1 = (EditText) findViewById(R.id.numero);

        btnfax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //x = (int) Double.parseDouble(e1.getText().toString()); //variavel x terá o valor do que será
                //colocado no texto
                Intent in = new Intent(MainActivity.this, ResultGera.class);
                in.putExtra("aleatorio", e1.getText());
                startActivity(in);
            }
        });



}
}
