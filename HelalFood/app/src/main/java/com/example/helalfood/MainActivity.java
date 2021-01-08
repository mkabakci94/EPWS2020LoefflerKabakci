package com.example.helalfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;


public class MainActivity<mToolbar> extends AppCompatActivity implements View.OnClickListener {

    //const mongoose = require('mongoose');

    Button btnfavo, btnkarten, btngesch;

    ImageView ivlogo;


    final String databaseName = "mongose.db";

    //funktioniert nicht
   /* mToolbar = (Toolbar) findViewById(R.id.toolbarID);
    setSupportActionBar(mToolbar);*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LogoBild
       // ivlogo = findViewById(R.id. ivlogo);

        //Button
        btnfavo = findViewById(R.id. btnfavo);
        btngesch = findViewById(R.id. btngesch);
        btnkarten = findViewById(R.id.btnkarten);

        //wenn was gedrückt wird passiert was
        btnfavo.setOnClickListener(this);
        btnkarten.setOnClickListener(this);
        btngesch.setOnClickListener(this);

        //bild auf toolbar
       // ImageView imageView = (ImageView) findViewById(R.id.profilID);

      //  ImageView img=(ImageView) Toolbar.findViewById(R.id.profilID);

    }



    public void favoriten () {




    }

    public void suchen () {


    }

    public void laeden () {


    }

    //Datenbank erstellen
    public void createDatabase () {

       // SQLiteDatabase database = openOrCreateDatabase(
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnfavo:

                break;

            case R.id.btngesch:

                break;

            case R.id.btnkarten:

                break;

        }

    }
}