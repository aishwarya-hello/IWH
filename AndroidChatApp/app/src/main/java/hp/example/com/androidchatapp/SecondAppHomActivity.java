package hp.example.com.androidchatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondAppHomActivity extends AppCompatActivity {
Button btnact1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_app_hom);
        btnact1 = (Button) findViewById(R.id.button2);
    }
    public void btnClick(View v){
        Intent i = new Intent(this,MainActivity_CA.class);
        startActivity(i);
    }
}
