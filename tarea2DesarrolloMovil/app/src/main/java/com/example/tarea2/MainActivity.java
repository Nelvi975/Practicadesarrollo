package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText valor1, val2;
    TextView res;
    Button Sumar, Resta, Multi, Divi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.valor1);
        val2 = (EditText)findViewById(R.id.valor2);
        res = (TextView) findViewById(R.id.valorResul);
        Sumar = (Button) findViewById(R.id.suma);
        Resta = (Button) findViewById(R.id.resta);
        Multi = (Button) findViewById(R.id.multiplicar);
        Divi = (Button) findViewById(R.id.dividir);

        Sumar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                suma1();
            }
        });

        Resta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                resta1();
            }
        });

        Multi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                multi();
            }
        });

        Divi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                divi();
            }
        });


    }

    private void suma1()
    {
        double  z,n;
        double r;
        z = Integer.parseInt(valor1.getText().toString());
        n = Integer.parseInt(val2.getText().toString());
        r = z+n;
        res.setText(String.valueOf(r));
    }

    private void resta1()
    {
        double  z,n;
        double r;
        z = Integer.parseInt(valor1.getText().toString());
        n = Integer.parseInt(val2.getText().toString());
        r = z-n;
        res.setText(String.valueOf(r));
    }

    private void multi()
    {
        double  z,n;
        double r;
        z = Integer.parseInt(valor1.getText().toString());
        n = Integer.parseInt(val2.getText().toString());
        r = z*n;
        res.setText(String.valueOf(r));
    }

    private void divi()
    {
        double  z,n;
        double r;
        z = Integer.parseInt(valor1.getText().toString());
        n = Integer.parseInt(val2.getText().toString());
        r = z/n;
        res.setText(String.valueOf(r));
    }
}