package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import com.example.lifecycle.utils.AppConstant;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mButton, mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btn_send);
        mButtonShare= findViewById(R.id.btn_share);

        mButton.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, IntentActivity.class);
            mIntent.putExtra(AppConstant.TEXT_KEY, "Hi, im new");
            startActivity(mIntent);
        });

        mButtonShare.setOnClickListener(v->{
            Intent mIntent = new Intent();  /*Intent implicito*/
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, "fuck you"); /*estandar que el texto ira con esa clave, asi la otra aplicacion sabe como leerlo*/
            startActivity(mIntent);
        });
    }
}

    /*@Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "On Stop");
    }*/


