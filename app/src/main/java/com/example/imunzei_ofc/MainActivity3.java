package com.example.imunzei_ofc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        WebView projeto = findViewById(R.id.saibamais_inteiro);
        projeto.loadUrl("file:///android_asset/projeto.html");
    }
}