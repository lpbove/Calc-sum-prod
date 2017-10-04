package com.example.iam47992649.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String LOG = "MainActivity";
    Button button;
    CheckBox suma;
    CheckBox producte;
    EditText a;
    EditText b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG, "onCreate()");

        button = (Button) findViewById(R.id.button2);
        suma = (CheckBox) findViewById(R.id.checkBox4);
        producte = (CheckBox) findViewById(R.id.checkBox5);
        a = (EditText) findViewById(R.id.editText4);
        b = (EditText) findViewById(R.id.editText5);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sumResult = Double.parseDouble(a.getText().toString()) + Double.parseDouble(b.getText().toString());
                double prodResult = Double.parseDouble(a.getText().toString()) * Double.parseDouble(b.getText().toString());
                if(suma.isChecked()){
                    showResult(sumResult);
                }
                if(producte.isChecked()){
                    showResult(prodResult);
                }
            }
        };
        button.setOnClickListener(listener);
    }

    public void showResult(double result){
        Toast.makeText(this, result+"" , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG, "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy()");
    }


}
