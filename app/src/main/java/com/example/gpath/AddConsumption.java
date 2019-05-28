package com.example.gpath;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AddConsumption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_consumption);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.center_actionbar);
        getSupportActionBar().setTitle("Add/Edit Records");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Spinner spinner1=(Spinner)findViewById(R.id.category);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.Amarathus,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemIdAtPosition(position)+"Selected",Toast.LENGTH_LONG);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        TextView textView1=(TextView)findViewById(R.id.male);
        TextView textView2=(TextView)findViewById(R.id.female);
        TextView textView3=(TextView)findViewById(R.id.total);
        TextView textView4=(TextView)findViewById(R.id.comments);
    }
    public void close(View view) {
        startActivity(new Intent(AddConsumption.this,Consumption.class));
    }

    public void save(View view) {
        startActivity(new Intent(AddConsumption.this,Consumption.class));
    }

    public void Inventory(View view) {
        Intent intent = new Intent(AddConsumption.this, Inventory.class);
        startActivity(intent);

    }

    public void Consumption(View view) {
        Intent intent = new Intent(AddConsumption.this, Consumption.class);
        startActivity(intent);
    }

    public void Contribution(View view) {
        Intent intent = new Intent(AddConsumption.this, Contribution.class);
        startActivity(intent);
    }
}
