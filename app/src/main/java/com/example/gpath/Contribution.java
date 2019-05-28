package com.example.gpath;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contribution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribution);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.center_actionbar);
        getSupportActionBar().setTitle("Add/Edit Records");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void close(View view) {
        startActivity(new Intent(Contribution.this,MainActivity.class));
    }

    public void save(View view) {
    }
    public void Inventory(View view) {
        Intent intent = new Intent(Contribution.this, Inventory.class);
        startActivity(intent);

    }

    public void Consumption(View view) {
        Intent intent = new Intent(Contribution.this, Consumption.class);
        startActivity(intent);
    }

    public void Contribution(View view) {
    }
}
