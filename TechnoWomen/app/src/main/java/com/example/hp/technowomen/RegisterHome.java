package com.example.hp.technowomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterHome extends AppCompatActivity {
    Button button,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_home);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),PersonalDetails.class);
                startActivityForResult(intent,2);
            }
        });
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),SkillSet.class);
                startActivityForResult(intent,2);
            }
        });
        //3rd button
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),Qualification.class);
                startActivityForResult(intent,2);
            }
        });

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),ReadData.class);
                startActivityForResult(intent,2);
            }
        });
    }
}
