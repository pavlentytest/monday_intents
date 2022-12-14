package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(view -> {
            // неявное намерение
            String url = "https://www.mirea.ru/";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);

        });
        btn2.setOnClickListener(view -> {
            // явное намерение
            Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(intent);
        });

    }
}