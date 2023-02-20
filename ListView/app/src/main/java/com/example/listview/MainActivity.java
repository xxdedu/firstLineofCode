package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private String data[] = {"apple", "banana", "orange", "watermelon", "pear", "grape",
            "pineapple", "strawberry", "cherry", "apple", "banana", "orange", "watermelon",
            "pear", "grape", "pineapple", "strawberry", "cherry","apple", "banana", "orange",
            "watermelon", "pear", "grape", "pineapple", "strawberry", "cherry", "apple",
            "banana", "orange", "watermelon", "pear", "grape", "pineapple", "strawberry", "cherry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}