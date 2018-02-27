package com.example.hp.technowomen;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 24-02-2018.
 */


public class DBHandler extends SQLiteOpenHelper {

    public static  final String DATABASE_NAME = "MentorInfo.db";
    // final static int DATABASE_VERSION = 1;
    public static final String TABLE_MENTOR = "Mentor";

    public static final String COLM1="id";
    public static final String COLM2="name";
    public static final String COLM3="field";
    public static final String COLM4="district";

    public DBHandler(Context context , String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DATABASE_NAME, factory, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_MENTOR + "(" + COLM1 + " INTEGER," + COLM2 + " TEXT," + COLM3 +" TEXT," +COLM4 + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
        //db.execSQL("CREATE TABLE "+ TABLE_MENTOR + "(id integer primary key autoincrement, name text not null, field integer not null )");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MENTOR);
        onCreate(db);
    }
    public void addMentor(Mentor mentor)
    {
        SQLiteDatabase db1 = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLM1, mentor.getId());
        values.put(COLM2, mentor.getName());
        values.put(COLM3, mentor.getField());
        values.put(COLM4, mentor.getDistrict());
        db1.insert(TABLE_MENTOR, null, values);
        db1.close();
    }
    /* public Mentor getMentor(int id)
     {
         SQLiteDatabase db=this.getReadableDatabase();

         Cursor cursor=db.query(TABLE_MENTOR,new String[]{COLM1,COLM2,COLM3,COLM4},COLM1 +"=?", new String[]{String.valueOf(id)},null,null,null,null);
         if (cursor !=null)
             cursor.moveToFirst();

         Mentor m1=new Mentor(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2));
         return m1;
     }*/
    public List<Mentor> getAllShops() {
        List<Mentor> shopList = new ArrayList<Mentor>();
// Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_MENTOR;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Mentor shop = new Mentor();
                shop.setId(Integer.parseInt(cursor.getString(0)));
                shop.setName(cursor.getString(1));
                shop.setField(cursor.getString(2));
                shop.setDistrict(cursor.getString(3));
// Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }

// return contact list
        return shopList;
    }
    public Cursor getWordMatches(String query, String[] columns) {
        String selection = COLM4 + " MATCH ?";
        String[] selectionArgs = new String[] {query+"*"};

        return query(selection, selectionArgs, columns);
    }

    private Cursor query(String selection, String[] selectionArgs, String[] columns) {
        SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
       // DBHandler dbHandler=new DBHandler(this,null,null,1);
        builder.setTables(TABLE_MENTOR);

        Cursor cursor = builder.query(getReadableDatabase(),
                columns, selection, selectionArgs, null, null, null);

        if (cursor == null) {
            return null;
        } else if (!cursor.moveToFirst()) {
            cursor.close();
            return null;
        }
        return cursor;
    }
}
