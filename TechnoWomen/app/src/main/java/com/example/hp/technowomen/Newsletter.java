package com.example.hp.technowomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newsletter extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newsletter);

        button=(Button)findViewById(R.id.button9);


        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),MainActivityNews.class);
                startActivityForResult(intent,2);

            }
        });
    }
}
