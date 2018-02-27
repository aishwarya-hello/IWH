package com.example.hp.technowomen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Qualification extends AppCompatActivity {

    Spinner spinner,spinner2,spinner3,spinner4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);
        spinner = (Spinner) findViewById(R.id.spinner);
        String [] decision={"Yes","No"};
        String [] decision1={"Arts","Commerce","Science","Non"};
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,decision);
        spinner.setAdapter(adapter);

        //2nd spinner
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter);

        //3rd spinner
        ArrayAdapter<String> adapter1 =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,decision1);

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setAdapter(adapter1);
        //$th spinner
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner4.setAdapter(adapter);


    }
}
