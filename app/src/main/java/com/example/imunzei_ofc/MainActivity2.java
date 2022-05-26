package com.example.imunzei_ofc;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;

import com.google.android.material.chip.Chip;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.imunzei_ofc.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Chip saiba = (Chip) findViewById(R.id.mais);
       // saiba.setOnClickListener(new View.OnClickListener() {

     //       @Override
      //      public void onClick(View view) {
     //           Intent it = new Intent(MainActivity2.this,MainActivity3.class);
       //         startActivity(it);
         //   }
        //});

       setSupportActionBar(binding.appBarMain.toolbar);
      // binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
        //   @Override
          // public void onClick(View view) {
            //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
              //         .setAction("Action", null).show();
           //}


        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.linksFragment, R.id.link_ofFragment)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        WebView comecar = (WebView) findViewById(R.id.teste);
       // comecar.setText(Html.fromHtml(getString(R.string.html_scroll)));
        String html=
                "<html><head><style>" +
                ".title{color:black;font-size:18px;line-height: 1.8;font-family:alex_brush;}"+
                ".text{color:black;font-size:16px;}"+
                "</style></head><body>" +


                "<label style=text-align:center; class='title' >" +
                "O Instituto das Apóstolas do Sagrado Coração de Jesus (IASCJ) é uma associação civil, de caráter confessional e religioso,"+
                "sem fins lucrativos e filantrópica, fundada em Viareggio, Itália, por Madre Clélia Merloni,"+
                "com 127 anos de atuação, possui como objetivo primordial, desde o início de sua fundação,"+
                "promover ações que viabilizem o enfrentamento de situações que ameaçam o desenvolvimento digno da pessoa humana."+
                "</label><br>" +

                "<p class='text'>Hello</p>"+
                "</body></html>";


        comecar.loadUrl("about:blank");
        comecar.loadData(html,"text/html","UTF-8");
        //comecar.loadUrl("file:///android_asset/index.html");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem settingsItem = menu.findItem(R.id.action_settings);
        settingsItem.setVisible(false);
        return false;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}