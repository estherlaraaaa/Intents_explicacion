package com.example.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lifecycle.utils.AppConstant;

public class IntentActivity extends AppCompatActivity {
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        mText=findViewById(R.id.tv_message); /**este es explicito*/
        Intent mIntent = this.getIntent();

        if(mIntent!=null){
            mText.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY));
        }
    }
}
