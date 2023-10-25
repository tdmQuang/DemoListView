package com.example.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SinhtoActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Sinh tố bơ", "Sinh tố cam", "Sinh tố dưa hấu"};
    String mDescription[] = {"18.000đ", "18.000đ", "18.000đ"};
    int images[] = {R.drawable.sinhtobo, R.drawable.sinhtocam, R.drawable.sinhtodh};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinhto);

        Button btn3 = (Button) findViewById(R.id.btn_back);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SinhtoActivity.super.onBackPressed();
            }
        });


        listView = findViewById(R.id.listviewSinhto);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

    }
}