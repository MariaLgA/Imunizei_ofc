package com.example.imunzei_ofc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        WebView projeto = findViewById(R.id.in4);
        projeto.loadUrl("file:///android_asset/idosos_2.html");
    }
}