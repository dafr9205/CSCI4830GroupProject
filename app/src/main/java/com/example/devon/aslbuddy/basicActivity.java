package com.example.devon.aslbuddy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class basicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }

    public void browser1(View view ){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.startasl.com/basic-words-in-sign-language.html"));
        startActivity(browserIntent);
    }
}




