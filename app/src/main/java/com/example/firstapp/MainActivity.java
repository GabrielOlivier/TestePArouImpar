package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void parOuImpar(View v) {
        EditText n1 = findViewById(R.id.n1);

        Integer numero = Integer.parseInt(n1.getText().toString());

        Integer res = numero;

        TextView resultado = findViewById(R.id.resultado);

        if(res % 2 == 0) {
            resultado.setText("O número Par");
        } else {
            resultado.setText("O número é Impar");
        }


    }

}