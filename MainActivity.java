package com.example.felipe.quiz_radio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton a1;
    RadioButton b1;
    RadioButton c1;
    RadioButton d1;

    RadioButton a2;
    RadioButton b2;
    RadioButton c2;
    RadioButton d2;

    RadioButton a3;
    RadioButton b3;
    RadioButton c3;
    RadioButton d3;


    TextView tv1;
    TextView tv2;
    TextView tv3;

    Integer qtd_acertos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (RadioButton)findViewById(R.id.a1);
        b1 = (RadioButton)findViewById(R.id.b1);
        c1 = (RadioButton)findViewById(R.id.c1);
        d1 = (RadioButton)findViewById(R.id.d1);

        a2 = (RadioButton)findViewById(R.id.a2);
        b2 = (RadioButton)findViewById(R.id.b2);
        c2 = (RadioButton)findViewById(R.id.c2);
        d2 = (RadioButton)findViewById(R.id.d2);

        a3 = (RadioButton)findViewById(R.id.a3);
        b3 = (RadioButton)findViewById(R.id.b3);
        c3 = (RadioButton)findViewById(R.id.c3);
        d3 = (RadioButton)findViewById(R.id.d3);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
    }

    public void Validar(View v){
        if(a1.isChecked()){
            tv1.setTextColor(Color.RED);
        }else if(b1.isChecked()){
            tv1.setTextColor(Color.RED);
        }else if(c1.isChecked()){
            qtd_acertos++;
            tv1.setTextColor(Color.GREEN);
        }else if(d1.isChecked()){
            tv1.setTextColor(Color.RED);
        }

        if(a2.isChecked()){
            tv2.setTextColor(Color.RED);
        }else if(b2.isChecked()){
            qtd_acertos++;
            tv2.setTextColor(Color.GREEN);
        }else if(c2.isChecked()){
            tv2.setTextColor(Color.RED);
        }else if(d2.isChecked()){
            tv2.setTextColor(Color.RED);
        }

        if(a3.isChecked()){
            tv3.setTextColor(Color.RED);
        }else if(b3.isChecked()){
            tv3.setTextColor(Color.RED);
        }else if(c3.isChecked()){
            tv2.setTextColor(Color.RED);
        }else if(d3.isChecked()){
            qtd_acertos++;
            tv3.setTextColor(Color.GREEN);
        }
        Toast.makeText(this,"Você acertou " + qtd_acertos + " Perguntas",Toast.LENGTH_LONG).show();
    }













}
