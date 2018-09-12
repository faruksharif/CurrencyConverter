package com.example.faruksharif.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void Onclick(View view){

        EditText txt1=(EditText) findViewById(R.id.txt1);
        Log.i("Currency!!!","Please Click!!!");
        Log.i("Values1",txt1.getText().toString());
        Double DollarValueInInt = Double.parseDouble(txt1.getText().toString());
        Double DollarValueInBDT = DollarValueInInt*64;
        String Total= Double.toString(DollarValueInBDT);
        Toast.makeText(this, "Cad amount "+txt1.getText().toString()+" $ to BDT is "+ Total, Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
