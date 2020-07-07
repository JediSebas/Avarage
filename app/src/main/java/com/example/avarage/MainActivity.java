package com.example.avarage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText number;
    EditText avarage;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (EditText) findViewById(R.id.number);
        avarage = (EditText) findViewById(R.id.avarage);
    }

    public void click(View view) {
        int i = 0, x, j = 0;
        double sr, suma = 0;
        List<Character> tab = new ArrayList<>();
        str = number.getText().toString().trim();
        do {
            tab.add(str.charAt(i));
            i++;
        } while (tab.get(i - 1) != '0');
        for (; j < i; j++) {
            String a = Character.toString(tab.get(j));
            x = Integer.parseInt(a);
            suma += x;
        }
        sr = suma / (j - 1);
        sr *= 100;
        sr = Math.round(sr);
        sr /= 100;
        String ss = Double.toString(sr);
        avarage.setText(ss);
    }
}
