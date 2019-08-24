package com.example.primerandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_toast;
    TextView txt_01;
    Button btn_contar;
    int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toast=findViewById(R.id.btn_toast);
        btn_contar=findViewById(R.id.btn_contar);
        txt_01=findViewById(R.id.txt_01);
        btn_contar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aumentar();
            }
        });
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Borrar();
            }
        });
    }
    void Aumentar(){
        contador++;
        txt_01.setText(String.valueOf(contador));
    }
    void Borrar(){
        contador=0;
        txt_01.setText(String.valueOf(contador));
        Toast.makeText(MainActivity.this,"Hola Marcia",Toast.LENGTH_SHORT).show();
    }
}

