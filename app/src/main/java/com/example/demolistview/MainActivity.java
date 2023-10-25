package com.example.demolistview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Cafe", "Trà sữa", "Sinh tố"};
    String mDescription[] = {"Có 3 loại sản phẩm", "Có 3 loại sản phẩm", "Có 3 loại sản phẩm"};
    int images[] = {R.drawable.cafe, R.drawable.trasua, R.drawable.sinhto};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Cafe", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, CafeActivity.class));
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Tra sua", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, TrasuaActivity.class));
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Sinh to", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, SinhtoActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }


