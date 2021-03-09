package com.example.comparativo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText alcoolText, gasText;
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alcoolText = findViewById(R.id.alcoolText);
        gasText = findViewById(R.id.gasText);

    }

    public void Calcular(View view)
    {
        String precoAlcool = alcoolText.getText().toString();
        String precoGasolina = gasText.getText().toString();

        if (validarCampos(precoAlcool, precoGasolina))
        {
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            Double resultado = valorAlcool / valorGasolina;



            if (resultado >= 0.7)
            {
                resultText.setText("Melhor utilizar Gasolina.");
            }

            else
            {
                resultText.setText("Melhor utilizar Álcool.");
            }
        }

        else
        {

            resultText.setText("Insira os valores corretamente!");
        }
    }


    public Boolean validarCampos(String pAlcool, String pGasolina)
    {
        if (pAlcool == null || pAlcool.equals(""))
        {
            return false;
        }

        else if (pGasolina == null || pGasolina.equals(""))
        {
            return false;
        }

        else
        {
            return true;
        }

    }

}