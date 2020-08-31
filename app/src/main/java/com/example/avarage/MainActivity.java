package com.example.avarage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText number;
    TextView avarage;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (EditText) findViewById(R.id.number);
        avarage = (TextView) findViewById(R.id.avarage);
    }

    public void click(View view) {
        int i = 0, x, j = 0;
        double sr, suma = 0;
        List<Character> tab = new ArrayList<>();
        str = number.getText().toString().trim();
        try {
            for (; i > -1; ) {
                tab.add(str.charAt(i));
                i++;
            }
        } catch (Exception e) { }
        finally {
            for (; j < i; j++) {
                String a = Character.toString(tab.get(j));
                x = Integer.parseInt(a);
                suma += x;
            }
            sr = suma / j;
            sr *= 100;
            sr = Math.round(sr);
            sr /= 100;
            String ss = Double.toString(sr);
            avarage.setText(ss);
        }
    }
}
