package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asigno una variable a cada boton y al TextView del resultado
        TextView resultado = findViewById(R.id.resultado);
        Button mas = findViewById(R.id.mas);
        Button menos = findViewById(R.id.menos);
        Button por = findViewById(R.id.por);
        Button entre = findViewById(R.id.entre);
        Button igual = findViewById(R.id.igual);
        Button c = findViewById(R.id.c);

        //Listener para el boton mas
        mas.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "+");
        });

        //Listener para el boton menos
        menos.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "-");
        });

        //Listener para el boton por
        por.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "*");
        });

        //Listener para el boton que me dividirá
        entre.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "/");
        });

        //Listener para el boton igual que mostrara el resultado de la operacion
        igual.setOnClickListener(v -> {
            String[] operacion = resultado.getText().toString().split("[+\\-*/]");
            int resultadoOperacion = 0;
            if (resultado.getText().toString().contains("+")) {
                resultadoOperacion = Integer.parseInt(operacion[0]) + Integer.parseInt(operacion[1]);
            } else if (resultado.getText().toString().contains("-")) {
                resultadoOperacion = Integer.parseInt(operacion[0]) - Integer.parseInt(operacion[1]);
            } else if (resultado.getText().toString().contains("*")) {
                resultadoOperacion = Integer.parseInt(operacion[0]) * Integer.parseInt(operacion[1]);
            } else if (resultado.getText().toString().contains("/")) {
                resultadoOperacion = Integer.parseInt(operacion[0]) / Integer.parseInt(operacion[1]);
            }
            resultado.setText(String.valueOf(resultadoOperacion));
        });

        //Listener para el boton c que me limpiará el resultado
        c.setOnClickListener(v -> {
            resultado.setText("");
        });


        //Listener para el boton uno
        Button uno = findViewById(R.id.uno);
        uno.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "1");
        });

        //Listener para el boton dos
        Button dos = findViewById(R.id.dos);
        dos.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "2");
        });

        //Listener para el boton tres
        Button tres = findViewById(R.id.tres);
        tres.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "3");
        });

        //Listener para el boton cuatro
        Button cuatro = findViewById(R.id.cuatro);
        cuatro.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "4");
        });

        //Listener para el boton cinco
        Button cinco = findViewById(R.id.cinco);
        cinco.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "5");
        });

        //Listener para el boton seis
        Button seis = findViewById(R.id.seis);
        seis.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "6");
        });

        //Listener para el boton siete
        Button siete = findViewById(R.id.siete);
        siete.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "7");
        });

        //Listener para el boton ocho
        Button ocho = findViewById(R.id.ocho);
        ocho.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "8");
        });

        //Listener para el boton nueve
        Button nueve = findViewById(R.id.nueve);
        nueve.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "9");
        });

        //Listener para el boton cero
        Button cero = findViewById(R.id.cero);
        cero.setOnClickListener(v -> {
            resultado.setText(resultado.getText() + "0");
        });


    }
}