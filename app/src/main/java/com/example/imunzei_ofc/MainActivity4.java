package com.example.imunzei_ofc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        WebView projeto = findViewById(R.id.in4);
        projeto.loadUrl("file:///android_asset/indigenas_2.html");


        Button next = (Button)  findViewById(R.id.button4);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(it);
            }
        });
    }
}