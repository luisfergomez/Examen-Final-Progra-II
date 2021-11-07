package com.example.calculadorafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.function.BiFunction;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;

    float numeroUno = 0.0f;
    float numeroDos = 0.0f;
    float numerotres = 0.0f;
    float resultado = 0.0f;

    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResutado);
    }

    public void Info(View view) {
        Intent i = new Intent(this, Info.class);
        startActivity(i);

        tvResultado = findViewById(R.id.tvResutado);
    }

    public void Limpiar(View view) {
        tvResultado.setText("0");
        numeroUno = 0.0f;
        numeroDos = 0.0f;
        operacion = "";
    }

    public void cero(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("0");
        } else {
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }

    public void uno(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("1");
        } else {
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void dos(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("2");
        } else {
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void tres(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("3");
        } else {
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void cuatro(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("4");
        } else {
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void cinco(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("5");
        } else {
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void seis(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("6");
        } else {
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void siete(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("7");
        } else {
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void ocho(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("8");
        } else {
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void nueve(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        if(numeroUno == 0.0f){
            tvResultado.setText("9");
        } else {
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void punto(View view) {
        numeroUno = Float.parseFloat(tvResultado.getText().toString());

        if(numeroUno == 0.0f){
            tvResultado.setText("0");
        } else {
            String punto = tvResultado.getText().toString();
            tvResultado.setText(punto + ".");
        }
    }

    public void OperacionSuma(View view) {
        numerotres = Float.parseFloat(tvResultado.getText().toString());
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        operacion = "+";
        tvResultado.setText("0");

    }

    public void OperacionResta(View view) {
        numerotres = Float.parseFloat(tvResultado.getText().toString());
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        operacion = "-";
        tvResultado.setText("0");

    }

    public void OperacionMulti(View view) {
        numerotres = Float.parseFloat(tvResultado.getText().toString());
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        operacion = "*";
        tvResultado.setText("0");

    }

    public void OperacionDivi(View view) {
        numerotres = Float.parseFloat(tvResultado.getText().toString());
        numeroUno = Float.parseFloat(tvResultado.getText().toString());
        operacion = "/";
        tvResultado.setText("0");

    }


    public void Resultado(View view) {
        numeroDos = Float.parseFloat(tvResultado.getText().toString());

        if(operacion.equals("+")){

            resultado = numerotres + numeroDos;
            tvResultado.setText(resultado + "");


        } else if (operacion.equals("-")){

            resultado = numerotres - numeroDos;
            tvResultado.setText(resultado + "");


        } else if(operacion.equals("*")){

            resultado = numerotres * numeroDos;
            tvResultado.setText(resultado + "");

        } else if(operacion.equals("/")){

            resultado = numerotres / numeroDos;
            tvResultado.setText(resultado + "");

        }

    }
}