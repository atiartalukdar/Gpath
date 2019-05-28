package com.example.gpath;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Consumption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumption);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.center_actionbar);
        getSupportActionBar().setTitle("Add/Edit Records");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void addConsumption(View view) {
        Intent intent = new Intent(Consumption.this, AddConsumption.class);
        startActivity(intent);
    }
    public void Inventory(View view) {
        Intent intent = new Intent(Consumption.this, Inventory.class);
        startActivity(intent);

    }

    public void Consumption(View view) {
    }

    public void Contribution(View view) {
        Intent intent = new Intent(Consumption.this, Contribution.class);
        startActivity(intent);
    }

    public void edit(View view) {
        Intent intent = new Intent(Consumption.this, AddConsumption.class);
        startActivity(intent);
    }

    public void delete(View view) {
        Intent intent = new Intent(Consumption.this, AddConsumption.class);
        startActivity(intent);
    }
}
