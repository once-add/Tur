package com.example.turfirma;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class catalog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog2);
    }
    public void button1(View view)
    {


        Toast.makeText(this, "Цвет программы изменен", Toast.LENGTH_SHORT).show();
    }
}
