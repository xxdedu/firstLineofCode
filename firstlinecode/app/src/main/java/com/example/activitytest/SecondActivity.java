package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // 取出数据-9.
        /*Intent intent = getIntent();
        String data = intent.getStringExtra("key1");
        Log.d("TAG", data);*/

        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_key", "data_value");
                setResult(RESULT_OK, intent);
                // 由于SecondActivity是用startActivityForResult启动的，活动销毁之后会调用上一个活动的onActivityResult方法
                finish();
            }
        });
    }
}