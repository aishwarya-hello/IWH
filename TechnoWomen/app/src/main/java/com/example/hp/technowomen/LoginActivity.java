package com.example.hp.technowomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class LoginActivity extends AppCompatActivity {


    Button button,button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DBHandler db=new DBHandler(this, null, null, 1);
        int d = Log.d("Insert:", "Inserting...");
        db.addMentor(new Mentor(1," Mentor1"," Science"," Pune"));

        Log.d("Reading:"," Reading all mentor...");
        List<Mentor> m1=db.getAllShops();
        for(Mentor m : m1){
            String log="Id:"+m.getId()+",Name:"+m.getName()+",Field:"+m.getField()+",Address:"+m.getDistrict();
            Log.d("Mentor::",log);
        }

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),RegisterHome.class);
                startActivityForResult(intent,2);
            }
        });

        button1=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(intent,2);
            }
        });
    }
}
