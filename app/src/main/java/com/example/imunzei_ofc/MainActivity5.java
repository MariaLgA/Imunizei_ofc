package com.example.imunzei_ofc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        WebView projeto = findViewById(R.id.in4);
        projeto.loadUrl("file:///android_asset/indigena_3.html");
    }
}