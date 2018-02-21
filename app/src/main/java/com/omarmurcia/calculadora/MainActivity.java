package com.omarmurcia.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ePantalla;
    String Valor;
    int  Punto=0, cont=0, cont2=0;
    float Resultado=0;
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
        //ePantalla.setInputType(InputType.TYPE_NULL);
    }

    public void Click(View view) {
        int id = view.getId();

        Valor = ePantalla.getText().toString();

        if (Punto == 0) {
            switch (id) {
                case R.id.bPunto:
                    ePantalla.setText(Valor + ".");
                    Punto++;
                    break;
                case R.id.bCero:
                    if (cont != 0) {
                        ePantalla.setText(Valor + "0");
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
            cont++;
        }
        else{
            cont2 = cont2 + 10;
            switch (id) {
                case R.id.bCero:
                    ePantalla.setText(Valor + "0");
                    break;
                case R.id.bUno:
                    ePantalla.setText(Valor + "1");
                    Resultado = Resultado + (1/cont2);
                    break;
                case R.id.bDos:
                    ePantalla.setText(Valor + "2");
                    Resultado = Resultado + (2/cont2);
                    break;
                case R.id.bTres:
                    ePantalla.setText(Valor + "3");
                    Resultado = Resultado + (3/cont2);
                    break;
                case R.id.bCuatro:
                    ePantalla.setText(Valor + "4");
                    Resultado = Resultado + (4/cont2);
                    break;
                case R.id.bCinco:
                    ePantalla.setText(Valor + "5");
                    Resultado = Resultado + (5/cont2);
                    break;
                case R.id.bSeis:
                    ePantalla.setText(Valor + "6");
                    Resultado = Resultado + (6/cont2);
                    break;
                case R.id.bSiete:
                    ePantalla.setText(Valor + "7");
                    Resultado = Resultado + (7/cont2);
                    break;
                case R.id.bOcho:
                    ePantalla.setText(Valor + "8");
                    Resultado = Resultado + (8/cont2);
                    break;
                case R.id.bNueve:
                    ePantalla.setText(Valor + "9");
                    Resultado = Resultado + (9/cont2);
                    break;
            }
        }
    }
}
