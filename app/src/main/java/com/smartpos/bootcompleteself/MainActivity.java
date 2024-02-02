package com.smartpos.bootcompleteself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        if (intent != null) {
            String bootTips = intent.getStringExtra("BootTips");
            if (bootTips != null) {
                TextView viewById = findViewById(R.id.tips);
                viewById.setText(bootTips);
            }
        }
    }
}