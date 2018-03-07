package com.omarmurcia.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ePantalla;
    String Valor;
    int  Punto=0, cont=0, cont2=0, cont3=0, igual=0;
    double Resultado=0, Res=0;
    Button bPunto, bIgual, bDivision, bMultiplicacion, bResta, bSuma;
    Button bCero, bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePantalla = findViewById(R.id.ePantalla);
        bPunto = findViewById(R.id.bPunto);
        bIgual = findViewById(R.id.bIgual);
        bDivision = findViewById(R.id.bDivision);
        bMultiplicacion = findViewById(R.id.bMultiplicacion);
        bResta = findViewById(R.id.bResta);
        bSuma = findViewById(R.id.bSuma);
        bCero = findViewById(R.id.bCero);
        bUno = findViewById(R.id.bUno);
        bDos = findViewById(R.id.bDos);
        bTres = findViewById(R.id.bTres);
        bCuatro = findViewById(R.id.bCuatro);
        bCinco = findViewById(R.id.bCinco);
        bSeis = findViewById(R.id.bSeis);
        bSiete = findViewById(R.id.bSiete);
        bOcho = findViewById(R.id.bOcho);
        bNueve = findViewById(R.id.bNueve);

        ePantalla.setText("0");
    }

    public void Click(View view) {
        int id = view.getId();

        if (igual == 1){
            if ((id == R.id.bCero) || (id == R.id.bUno) || (id == R.id.bDos) || (id == R.id.bTres) || (id == R.id.bCuatro) || (id == R.id.bCinco) || (id == R.id.bSeis) || (id == R.id.bSiete) || (id == R.id.bOcho) || (id == R.id.bNueve)){
                ePantalla.setText("");
                igual=0;
                Resultado = 0;
                Punto = 0;
                cont = 0;
                cont2 = 0;
                cont3 = 0;
            }
        }

        Valor = ePantalla.getText().toString();

        if (Punto == 0) {
            switch (id) {
                case R.id.bPunto:
                    ePantalla.setText(Valor + ".");
                    Punto=1;
                    break;
                case R.id.bCero:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "0");
                        Resultado = (Resultado * 10);
                    }else {
                        ePantalla.setText("0");
                        Resultado = 0;
                    }
                    break;
                case R.id.bUno:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "1");
                        Resultado = (Resultado * 10) + 1;
                    } else {
                        ePantalla.setText("1");
                        Resultado = 1;
                    }
                    break;
                case R.id.bDos:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "2");
                        Resultado = (Resultado * 10) + 2;
                    } else {
                        ePantalla.setText("2");
                        Resultado = 2;
                    }
                    break;
                case R.id.bTres:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "3");
                        Resultado = (Resultado * 10) + 3;
                    } else {
                        ePantalla.setText("3");
                        Resultado = 3;
                    }
                    break;
                case R.id.bCuatro:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "4");
                        Resultado = (Resultado * 10) + 4;
                    } else {
                        ePantalla.setText("4");
                        Resultado = 4;
                    }
                    break;
                case R.id.bCinco:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "5");
                        Resultado = (Resultado * 10) + 5;
                    } else {
                        ePantalla.setText("5");
                        Resultado = 5;
                    }
                    break;
                case R.id.bSeis:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "6");
                        Resultado = (Resultado * 10) + 6;
                    } else {
                        ePantalla.setText("6");
                        Resultado = 6;
                    }
                    break;
                case R.id.bSiete:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "7");
                        Resultado = (Resultado * 10) + 7;
                    } else {
                        ePantalla.setText("7");
                        Resultado = 7;
                    }
                    break;
                case R.id.bOcho:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "8");
                        Resultado = (Resultado * 10) + 8;
                    } else {
                        ePantalla.setText("8");
                        Resultado = 8;
                    }
                    break;
                case R.id.bNueve:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "9");
                        Resultado = (Resultado * 10) + 9;
                    } else {
                        ePantalla.setText("9");
                        Resultado = 9;
                    }
                    break;

            }
            cont = 1; // ingresa el primer valor limpiando el anterior
        }
        else{
            cont2 = cont2 + 10; // hace la operacion cuando son decimales
            switch (id) {
                case R.id.bCero:
                    ePantalla.setText(Valor + "0");
                    break;
                case R.id.bUno:
                    ePantalla.setText(Valor + "1");
                    Resultado = Resultado + (double)(1.0/cont2);
                    break;
                case R.id.bDos:
                    ePantalla.setText(Valor + "2");
                    Resultado = Resultado + (double)(2.0/cont2);
                   break;
                case R.id.bTres:
                    ePantalla.setText(Valor + "3");
                    Resultado = Resultado + (double)(3.0/cont2);
                    break;
                case R.id.bCuatro:
                    ePantalla.setText(Valor + "4");
                    Resultado = Resultado + (double)(4.0/cont2);
                    break;
                case R.id.bCinco:
                    ePantalla.setText(Valor + "5");
                    Resultado = Resultado + (double)(5.0/cont2);
                    break;
                case R.id.bSeis:
                    ePantalla.setText(Valor + "6");
                    Resultado = Resultado + (double)(6.0/cont2);
                    break;
                case R.id.bSiete:
                    ePantalla.setText(Valor + "7");
                    Resultado = Resultado + (double)(7.0/cont2);
                    break;
                case R.id.bOcho:
                    ePantalla.setText(Valor + "8");
                    Resultado = Resultado + (double)(8.0/cont2);
                    break;
                case R.id.bNueve:
                    ePantalla.setText(Valor + "9");
                    Resultado = Resultado + (double)(9.0/cont2);
                    break;
            }
        }
        switch (id){
            case R.id.bSuma:
                if (cont3 == 0) {
                    ePantalla.setText(Valor + "+");
                    Res = Resultado;
                    Resultado = 0;
                    Punto = 0;
                    cont2 = 0;
                    cont3 = 1;
                    igual = 0;
                }
                break;
            case R.id.bResta:
                if (cont3 == 0) {
                    ePantalla.setText(Valor + "-");
                    Res = Resultado;
                    Resultado = 0;
                    Punto = 0;
                    cont3 = 2;
                    igual = 0;
                }
                break;
            case R.id.bMultiplicacion:
                if (cont3 == 0) {
                    ePantalla.setText(Valor + "*");
                    Res = Resultado;
                    Resultado = 0;
                    Punto = 0;
                    cont3 = 3;
                    igual = 0;
                }
                break;
            case R.id.bDivision:
                if (cont3 == 0) {
                    ePantalla.setText(Valor + "/");
                    Res = Resultado;
                    Resultado = 0;
                    Punto = 0;
                    cont3 = 4;
                    igual = 0;
                }
                break;
            case R.id.bIgual:
                igual=1;
                if (cont3 == 1) {
                    Resultado = Resultado + Res;
                    if (Resultado % 1 ==0){
                        ePantalla.setText(String.format("%.0f",Resultado));
                    }else {
                        ePantalla.setText(String.format("%.1f", Resultado));
                    }
                    Res = 0;
                    Punto = 0;
                    cont2 = 0;
                    cont3 = 0;
                }else if (cont3 == 2){
                    Resultado = Res - Resultado;
                    if (Resultado % 1 ==0){
                        ePantalla.setText(String.format("%.0f",Resultado));
                    }else {
                        ePantalla.setText(String.format("%.1f", Resultado));
                    }
                    Res = 0;
                    Punto = 0;
                    cont2 = 0;
                    cont3 = 0;
                }else if (cont3 == 3){
                    Resultado = Res * Resultado;
                    if (Resultado % 1 ==0){
                        ePantalla.setText(String.format("%.0f",Resultado));
                    }else {
                        ePantalla.setText(String.format("%.1f", Resultado));
                    }
                    Res = 0;
                    Punto = 0;
                    cont2 = 0;
                    cont3 = 0;
                }else if (cont3 == 4){
                    Resultado = Res / Resultado;
                    if (Resultado % 1 ==0){
                        ePantalla.setText(String.format("%.0f",Resultado));
                    }else {
                        ePantalla.setText(String.format("%.1f", Resultado));
                    }
                    Res = 0;
                    Punto = 0;
                    cont2 = 0;
                    cont3 = 0;
                }
                break;
            case R.id.bAc:
                ePantalla.setText("0");
                Resultado = 0;
                Punto = 0;
                cont = 0;
                cont2 = 0;
                cont3 = 0;
                igual = 0;
                break;
        }
    }
}
