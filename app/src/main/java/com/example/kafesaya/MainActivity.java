package com.example.kafesaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    RadioButton kopirobusta, expresso, kopiluwak, cream, sugar, bubukkopi, nasigoreng, miegoreng, mierebus ;
    TextView  bayaran;
    Button btnBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kopirobusta = findViewById(R.id.kopirobusta);
        expresso = findViewById(R.id.expresso);
        kopiluwak = findViewById(R.id.kopiluwak);
        cream = findViewById(R.id.cream);
        sugar = findViewById(R.id.sugar);
        bubukkopi = findViewById(R.id.bubukkopi);
        nasigoreng = findViewById(R.id.nasigoreng);
        miegoreng = findViewById(R.id.miegoreng);
        mierebus = findViewById(R.id.mierebus);
        bayaran = findViewById(R.id.bayaran);
        btnBayar = findViewById(R.id.btnBayar);

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bayaran.setText("Rp  " + String.valueOf(totalBayar()));
            }
        });
    }

    private int totalBayar() {
        int Total = 0;

        if(kopiluwak.isChecked()){
            Total += 20000;
        }else if (kopirobusta.isChecked()){
            Total += 30000;
        }else if (expresso.isChecked()) {
            Total  += 9000;
        }

        if(sugar.isChecked()){
            Total  += 5000;
        }else if (cream.isChecked()){
            Total  += 8000;
        }else if (bubukkopi.isChecked()) {
            Total  += 4000;
        }

        if(nasigoreng.isChecked()){
            Total  += 15000;
        }else if (miegoreng.isChecked()){
            Total  += 25000;
        }else if (mierebus.isChecked()) {
            Total  += 10000;
        }
        return Total;
    }}