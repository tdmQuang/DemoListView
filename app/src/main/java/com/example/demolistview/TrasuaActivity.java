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

public class TrasuaActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Trà sữa trân châu", "Trà sữa socola", "Trà sữa Macha"};
    String mDescription[] = {"10.000đ", "12.000đ", "15.000đ"};
    int images[] = {R.drawable.trasuatt, R.drawable.trasuascl, R.drawable.trasuamacha};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasua);

        Button btn2 = (Button) findViewById(R.id.btnbacktrasua);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(TrasuaActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });

        listView = findViewById(R.id.listviewTrasua);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
    }
}