package com.lichobo.hotfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "补丁安装成功", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "补丁未安装", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
