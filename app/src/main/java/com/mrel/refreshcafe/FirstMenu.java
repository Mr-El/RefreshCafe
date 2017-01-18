package com.mrel.refreshcafe;
//refresh team
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class FirstMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);
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
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Menu Button events
        Button specialsBtn = (Button) findViewById(R.id.specialsBtn);
        specialsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstMenu.this, SpecialsMenu.class));
            }
        });

        Button saladsBtn = (Button) findViewById(R.id.saladsBtn);
        saladsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstMenu.this, SaladMenu.class));
            }
        });

        Button soupsBtn = (Button) findViewById(R.id.soupsBtn);
        soupsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstMenu.this, SoupMenu.class));
            }
        });

        Button dessertBtn = (Button) findViewById(R.id.dessertBtn);
        dessertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstMenu.this, DessertMenu.class));
            }
        });

        Button beverageBtn = (Button) findViewById(R.id.beverageBtn);
        beverageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstMenu.this, BeverageMenu.class));
            }
        });
    }

}
