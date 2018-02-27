package com.example.hp.technowomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.provider.MediaStore;



public class MainActivity extends AppCompatActivity {
    Button button,button4,button5,button3,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button4=(Button)findViewById(R.id.Button4);
        button5=(Button)findViewById(R.id.button5);
        button3=(Button)findViewById(R.id.button3);
        button2=(Button)findViewById(R.id.button2);


       /* button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                startActivityForResult(intent,2);

            }
        });*/

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),Newsletter.class);
                startActivityForResult(intent,2);

            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),Meetup.class);
                startActivityForResult(intent,2);

            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent("hp.example.com.androidchatapp.SecondAppHomActivity");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(),SearchMentor.class);
                startActivity(intent);
            }
        });

    }

}
