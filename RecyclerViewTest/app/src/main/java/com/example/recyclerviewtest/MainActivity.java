package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    private String data[] = {"apple", "banana", "orange", "watermelon", "pear", "grape",
            "pineapple", "strawberry", "cherry", "apple", "banana", "orange", "watermelon",
            "pear", "grape", "pineapple", "strawberry", "cherry", "apple", "banana", "orange",
            "watermelon", "pear", "grape", "pineapple", "strawberry", "cherry", "apple",
            "banana", "orange", "watermelon", "pear", "grape", "pineapple", "strawberry", "cherry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        // 这三行是ui
        // 获取RecyclerView的实例
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        // 创建一个LinearLayoutManager对象（线性布局），并将它设置到RecyclerView中
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        // 这一行是数据
        // 创建FruitAdapter实例，并将数据传入其构造函数中
        FruitAdapter adapter = new FruitAdapter(fruitList);

        // 这一行是将数据放入ui
        // 调用RecyclerView的setAdapter方法完成适配器设置，完成RecyclerView和数据之间的关联
        recyclerView.setAdapter(adapter);

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