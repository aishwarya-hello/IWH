package com.example.hp.technowomen;

import java.security.PublicKey;
import java.util.Calendar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;


public class Meetup extends AppCompatActivity {
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meetup);
        datePicker =(DatePicker) findViewById(R.id.datePicker);
        Calendar calendar=Calendar.getInstance();

         View BottomSheet = findViewById(R.id.design_bottom_sheet);
        final BottomSheetBehavior behavior = BottomSheetBehavior.from(BottomSheet);
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback()
        {
            public void onStateChanged(@NonNull View BottomSheet,int newState){
                switch (newState){
                    case BottomSheetBehavior.STATE_DRAGGING:
                        Log.i("BottomSheetCAllback", "onStateChanged:BottomSheetBehavior.STATE_DRAGGING ");
                             break;
                    case BottomSheetBehavior.STATE_SETTLING:
                        Log.i("BottomSheetCAllback", "onStateChanged:BottomSheetBehavior.STATE_SETTLING ");
                        break;

                    case BottomSheetBehavior.STATE_EXPANDED:
                        Log.i("BottomSheetCAllback", "onStateChanged:BottomSheetBehavior.STATE_EXPANDED ");
                        break;

                    case BottomSheetBehavior.STATE_COLLAPSED:
                        Log.i("BottomSheetCAllback", "onStateChanged:BottomSheetBehavior.STATE_COLLAPSED ");
                        break;
                    case BottomSheetBehavior.STATE_HIDDEN:
                        Log.i("BottomSheetCAllback", "onStateChanged:BottomSheetBehavior.STATE_HIDDEN");
                        break;


                }

            }
        public void onSlide(@NonNull View BottomSheet,float slideOffset){
            Log.i("BottomSheetCALLPACK", "onSlide:slideOffset "+ slideOffset);


        }
        });


        datePicker.init(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),new DatePicker.OnDateChangedListener()
        {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(),datePicker.getDayOfMonth()+"-"+datePicker.getMonth()+"-"+datePicker.getYear(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
