package com.example.quiz116171598_070;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int REQ_Code1 = 1;
    public static final int REQ_Code2 = 12;
    public static final int REQ_Code3 = 123;
    Button lnkpage1 = (Button) findViewById(R.id.link1);
    Button lnkpage2 = (Button) findViewById(R.id.link2);
    Button lnkpage3 = (Button) findViewById(R.id.link3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lnkpage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navIntent = new Intent(MainActivity.this, Page1.class);
                startActivityForResult(navIntent, REQ_Code1);

            }
        });
        lnkpage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navIntent = new Intent(MainActivity.this, Page2.class);
                startActivityForResult(navIntent, REQ_Code3);

            }
        });
        lnkpage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navIntent = new Intent(MainActivity.this, Page3.class);
                startActivityForResult(navIntent, REQ_Code1);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
