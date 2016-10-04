/*
 * Created by Dusan Stankovic on 10/4/16 10:42 AM
 * Copyright (c) 2016. All rights reserved.
 *
 * Last modified 10/4/16 9:53 AM
 */

package com.detrraxic.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPopularMovies;
    Button btnStockHawk;
    Button btnBuildItBigger;
    Button btnMakeMaterial;
    Button btnGoUbiquitous;
    Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopularMovies = (Button) findViewById(R.id.btnPopularMovies);
        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBuildItBigger = (Button) findViewById(R.id.btnBigger);
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnMakeMaterial = (Button) findViewById(R.id.btnMaterial);
        btnMakeMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnGoUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        btnGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
