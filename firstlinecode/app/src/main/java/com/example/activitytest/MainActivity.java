package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 显式intent传递数据
        /*Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key1", "value1");
        startActivity(intent);*/


        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 返回数据给上一个活动
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 1);


                // 隐式intent打开浏览器
//                Intent intent = new Intent(Intent.ACTION_VIEW); // ACTION_VIEW是安卓系统内置的动作
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);

                // 隐式intent
//                Intent intent = new Intent("com.example.activitytest.ACTION");
//                startActivity(intent);

                // 显式intent
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);

//                Toast.makeText(MainActivity.this, "Happy", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 处理返回的数据
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnData = data.getStringExtra("data_key");
                    Log.d("returnData", returnData);
                }
                break;
            default:
        }
    }

    /**
     * 显示创建的菜单
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * 定义菜单响应事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
}