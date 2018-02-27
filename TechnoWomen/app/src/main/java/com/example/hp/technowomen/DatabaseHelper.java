/**
 * Created by hp on 17-02-2018.
 */
package com.example.hp.technowomen;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 12/30/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static  final String DATABASE_NAME = "Profile.db";
    // final static int DATABASE_VERSION = 1;
    public static final String TABLE_NAME="Profile_table";
    public static final String TABLE_NAME1="Mentor";


    public static final String COL_1="id";
    public static final String COL_2="name";
    public static final String COL_3="mobileno";
    public static final String COL_4="state";
    public static final String COL_5="district";
    public static final String COL_6="village";
    public static final String COL_7="email";
    public static final String COL_8="pass";

    public static final String COL9="pass10";
    public static final String COL10="per10";
    public static final String COL11="pass12";
    public static final String COL12="per12";
    public static final String COL13="stream";
    public static final String COL14="grad";
    public static final String COL15="gradper";
    public static final String COL16="graddetail";
    public static final String COL17="area";

    public static final String COLM1="id";
    public static final String COLM2="name";
    public static final String COLM3="field";
    public static final String COLM4="district";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE "+ TABLE_NAME + "(id integer primary key autoincrement, name text not null, mobileno integer not null, state text not null, district text not null, village text not null, email text not null, pass text not null)");

        db.execSQL("CREATE TABLE "+ TABLE_NAME1 + "(id integer primary key autoincrement, name text not null, field text not null,district text not null)");

    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

        db.execSQL("DROP TABLE IF EXISTS profile" + TABLE_NAME);

        db.execSQL("DROP TABLE IF EXISTS mentor" + TABLE_NAME1);


        //onCreate(db);
    }


    public boolean insertdata(String name , String mobileno, String state, String district, String village, String email,String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv =  new ContentValues();
        cv.put(COL_2,name);
        cv.put(COL_3,mobileno);
        cv.put(COL_4,state);
        cv.put(COL_5,district);
        cv.put(COL_6,village);
        cv.put(COL_7,email);
        cv.put(COL_8,password);



        long result =db.insert(TABLE_NAME,null,cv);
        db.close();

        if(result==-1) {
            return false;
        }
        else {
            return true;
        }
    }
    public Cursor getAllData()
    {
        SQLiteDatabase db1 = this.getWritableDatabase();
        Cursor res = db1.rawQuery("Select * from "+ TABLE_NAME,null);
      //  db1.close();
        return res;

    }





}


