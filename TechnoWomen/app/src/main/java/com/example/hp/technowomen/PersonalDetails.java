package com.example.hp.technowomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.hp.technowomen.R.id.editText;

public class PersonalDetails extends AppCompatActivity {

     DatabaseHelper mydb;
    EditText name,mobileno,state,district,village,email,pass;
    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);
        mydb = new DatabaseHelper(this);
        name = (EditText) findViewById(R.id.editText);
        mobileno = (EditText) findViewById(R.id.editText4);
        state = (EditText) findViewById(R.id.editText5);
        district = (EditText) findViewById(R.id.editText6);
        village = (EditText) findViewById(R.id.editText7);
        email = (EditText) findViewById(R.id.editText8);
        pass = (EditText) findViewById(R.id.editText9);

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ClickMe();
                Intent intent = new Intent(getApplicationContext(), RegisterHome.class);
                startActivityForResult(intent, 2);
            }
        });
    }
        private void ClickMe(){
        String name1,mobileno1,state1,district1,village1,email1,pass1;
            name1=name.getText().toString();
            mobileno1=mobileno.getText().toString();
            state1=state.getText().toString();
            district1=district.getText().toString();
            village1=village.getText().toString();
            email1=email.getText().toString();
            pass1=pass.getText().toString();
            Boolean result=mydb.insertdata(name1,mobileno1,state1,district1,village1,email1,pass1);

            if(result==true){
                Toast.makeText(this,"Data Inserted Successfully",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Data Insertion Failed", Toast.LENGTH_SHORT).show();
            }

    }


}
