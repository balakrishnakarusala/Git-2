package com.example.balakrishnakarusala.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by BalakrishnaKarusala on 19-05-2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="SmsParser.db";
    public static final String TABLE_NAME="sms_table";
    public static final String Id="id";
    public static final String From = "address";
    public static final String Received="date";
    public static final String Type="m_type";
    public static final String Body="message";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
        Log.d("Database Operations","Database Created Successfully");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL("create table "+ TABLE_NAME +"(id INTEGER PRIMARY KEY AUTOINCREMENT,address TEXT,date TEXT,m_type TEXT,message TEXT)");
        db.execSQL("create table "+ TABLE_NAME +"(id INTEGER PRIMARY KEY AUTOINCREMENT,address TEXT,date TEXT,m_type TEXT,message TEXT,CONSTRAINT message_unique UNIQUE (message))");
        Log.d("Database Operations","Table Created Successfully");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
    public boolean insertData(String name,String name1,String name2,String name3){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(From,name);
        cv.put(Received,name1);
        cv.put(Type,name2);
        cv.put(Body,name3);
        long result = db.insert(TABLE_NAME,null, cv);
        Log.d("Database Operations","DataInsertion Completed Succesfully");
        if(result == -1){
            return false;
        }
        else{
            return true;
        }
    }
    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null);
        Log.d("Database Operations","Display Query Executed Succesfully");
        return res;

    }
}
