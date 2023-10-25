package com.example.demolistview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CafeActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Cafe đen", "Cafe sua da", "Cafe muoi"};
    String mDescription[] = {"10.000đ", "12.000đ", "15.000đ"};
    int images[] = {R.drawable.cafeden, R.drawable.cafesuada, R.drawable.cafemuoi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        Button btn = (Button) findViewById(R.id.btnbackcafe);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(CafeActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        listView = findViewById(R.id.listviewCafe);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

    }
}
