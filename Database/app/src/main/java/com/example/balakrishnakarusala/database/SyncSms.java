package com.example.balakrishnakarusala.database;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class SyncSms extends AppCompatActivity {
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync_sms);
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

        boolean ans=myDb.insertData("Yamu","12-05-2016","TEXT","Hi Annayya");
        if(ans){
            Toast.makeText(SyncSms.this,"Data Inserted Succesfully",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(SyncSms.this,"Data Is Not Inserted Succesfully",Toast.LENGTH_LONG).show();
        }


    }

}
