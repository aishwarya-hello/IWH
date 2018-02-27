package com.example.hp.technowomen;

import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class SearchMentor extends AppCompatActivity implements SearchView.OnQueryTextListener {

 ListView lv;
 SearchView searchView;
 ArrayAdapter<String> adapter;
 String[] data = {"Mentor1 : Pune : Science", "Mentor2 : Pune : Arts","Mentor3 : Pune : Commerce","Mentor4 : Kolhapur : Science","Mentor5 : Solapur : Arts","Mentor6 : Baramati : Science"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_mentor);
      lv = (ListView) findViewById(R.id.listview) ;

      searchView = (SearchView) findViewById(R.id.searchview) ;
      adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
      lv.setAdapter(adapter);
        searchView.setOnQueryTextListener(this);

    }

    @Override
    public  boolean onQueryTextSubmit(String query){
        return  false;
    }

    @Override
    public  boolean onQueryTextChange(String newtext){
        String text = newtext;
        adapter.getFilter().filter(newtext);
        //Toast.makeText(this,"query is" + text,Toast.LENGTH_SHORT).show();
        return  false;
    }
}
