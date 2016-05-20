package com.example.malhotrag.chitkarauniversity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("About Us");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Contact Us");

        tab1.setIndicator("About Us");
        tab1.setContent(new Intent(getApplicationContext(),AboutUs.class));
        tab2.setIndicator("Contact Us");
        tab2.setContent(new Intent(getApplicationContext(),ContactUs.class));

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
    }
}
