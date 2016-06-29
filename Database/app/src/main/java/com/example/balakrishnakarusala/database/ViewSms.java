package com.example.balakrishnakarusala.database;

import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ViewSms extends AppCompatActivity {
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_sms);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myDb =new DatabaseHelper(this);
        ListView lv = (ListView) findViewById(R.id.viewsms);
        if (smsTable() != null) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, smsTable());
            lv.setAdapter(adapter);
        }
        /*Cursor res=myDb.getAllData();
        if(res.getCount() == 0){
            showMessage("Error","Nothing Found");
            return;
        }

        StringBuffer buffer=new StringBuffer();
        while (res.moveToNext()){
            buffer.append("Id :-"+res.getString(0)+"\n");
            buffer.append("Address :-"+res.getString(1)+"\n");
            buffer.append("Date :-"+res.getString(2)+"\n");
            buffer.append("M_Type :-"+res.getString(3)+"\n");
            buffer.append("Message :-"+res.getString(4)+"\n");

        }
        showMessage("Data",buffer.toString());*/
    }

    /*public void showMessage(String title,String message){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }*/
    public ArrayList<String> smsTable() {
        ArrayList<String> sms = new ArrayList<String>();
        Cursor res=myDb.getAllData();
        //res.moveToFirst();
        while (res.moveToNext()) {
            String id = res.getString(0);
            String address = res.getString(1);
            String date = res.getString(2);
            String m_type = res.getString(3);
            String body = res.getString(4);
            sms.add("Id: " + id + "\nAddress: " + address + "\nDate: " + date + "\nM_Type: " + m_type + "\nMessage: " + body);
        }
        return sms;
    }

}
