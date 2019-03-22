package com.example.lifecycle.utils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lifecycle.R;

public class activity_share extends AppCompatActivity {

    private TextView mText; /*aca es para compartir un texto y mandarlo a mi app*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        mText= findViewById(R.id.tv_share);
        Intent mIntent= getIntent();
        if(mIntent!=null){
            mText.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
