package com.example.gpath;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inventory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.center_actionbar);
        getSupportActionBar().setTitle("Add/Edit Records");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void addInventory(View view) {
        Intent intent = new Intent(Inventory.this, AddInventory.class);
        startActivity(intent);
    }

    public void Inventory(View view) {

    }

    public void Consumption(View view) {
        Intent intent = new Intent(Inventory.this, Consumption.class);
        startActivity(intent);
    }

    public void Contribution(View view) {
        Intent intent = new Intent(Inventory.this, Contribution.class);
        startActivity(intent);
    }

    public void edit(View view) {
        Intent intent = new Intent(Inventory.this, AddInventory.class);
        startActivity(intent);
    }

    public void delete(View view) {
        Intent intent = new Intent(Inventory.this, AddInventory.class);
        startActivity(intent);
    }
}
