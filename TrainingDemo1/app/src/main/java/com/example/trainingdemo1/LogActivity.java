package com.example.trainingdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LogActivity extends AppCompatActivity {

    Button fragment1, fragmnet2;
    LinearLayout layout;

    private static final String LOG_TAG = "LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        setTitle("Log Activity");

        Log.v(LOG_TAG,"This is verbose log");
        Log.d(LOG_TAG,"This is debug log");
        Log.i(LOG_TAG,"This is info log");
        Log.w(LOG_TAG, "This is warn log");
        Log.e(LOG_TAG,"This is error log");


        fragment1 = (Button) findViewById(R.id.fg1);
        fragmnet2 = (Button) findViewById(R.id.fg2);
        layout = (LinearLayout) findViewById(R.id.layout);

        fragmnet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFragment2 mf2 = new MyFragment2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout,mf2);
                transaction.commit();
            }


        });

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFragment1 mf1 = new MyFragment1();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout,mf1);
                transaction.commit();
            }


        });

    }

}