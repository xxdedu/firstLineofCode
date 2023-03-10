package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private String data[] = {"apple", "banana", "orange", "watermelon", "pear", "grape",
            "pineapple", "strawberry", "cherry", "apple", "banana", "orange", "watermelon",
            "pear", "grape", "pineapple", "strawberry", "cherry", "apple", "banana", "orange",
            "watermelon", "pear", "grape", "pineapple", "strawberry", "cherry", "apple",
            "banana", "orange", "watermelon", "pear", "grape", "pineapple", "strawberry", "cherry"};

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(this, R.layout.fruit_item, fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i < 50; i++) {
            Fruit apple = new Fruit(data[0], R.drawable.cherry);
            fruitList.add(apple);
            Fruit banana = new Fruit(data[1], R.drawable.cherry);
            fruitList.add(banana);
            Fruit orange = new Fruit(data[2], R.drawable.cherry);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(data[3], R.drawable.cherry);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(data[4], R.drawable.cherry);
            fruitList.add(pear);
            Fruit grape = new Fruit(data[5], R.drawable.cherry);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(data[6], R.drawable.cherry);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(data[7], R.drawable.cherry);
            fruitList.add(strawberry);
        }
    }


}