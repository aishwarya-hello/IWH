package com.example.hp.technowomen;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReadData extends AppCompatActivity {
    DatabaseHelper mydb;
    TextView txtResult;
    Button btnClick,btnClick1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_data);
        mydb = new DatabaseHelper(this);
        txtResult = (TextView) findViewById(R.id.textView);
        btnClick=(Button)findViewById(R.id.buttonR);
        btnClick.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                ClickMe();
            }
        });

    }
    private void ClickMe(){


        Cursor res=mydb.getAllData();

        StringBuffer stringBuffer=new StringBuffer();
        if(res!=null && res.getCount()>0){
           // Log.i(" u r in if"," ");
            while (res.moveToNext()){
                stringBuffer.append("id"+res.getString(0)+"\n");
                stringBuffer.append("name"+res.getString(1)+"\n");
                stringBuffer.append("mobileno"+res.getString(2)+"\n");
                stringBuffer.append("state"+res.getString(3)+"\n");
                stringBuffer.append("district"+res.getString(4)+"\n");
                stringBuffer.append("village"+res.getString(5)+"\n");
                stringBuffer.append("email"+res.getString(6)+"\n");
                stringBuffer.append("pass"+res.getString(7)+"\n");
               // stringBuffer.append("id"+res.getString(0)+"\n");

            }
            txtResult.setText(stringBuffer.toString());
            Toast.makeText(this,"Data Retrieved Successfully",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"No Data to Retrieve",Toast.LENGTH_SHORT).show();
        }
    }



}
