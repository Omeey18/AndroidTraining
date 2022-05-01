package com.example.trainingdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class RecycleViewActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "Mypref";


    ArrayList personname = new ArrayList<>(Arrays.asList("Person 1","Person 2","Person 3","Person 4","Person 5","Person 6","Person 7","Person 8"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        SharedPreferences setting = getSharedPreferences(PREFS_NAME,0);
        boolean dailogShown = setting.getBoolean("dailogShown",false);

        if(!dailogShown){
            Toast.makeText(this, "Hello",
                    Toast.LENGTH_SHORT).show();

            SharedPreferences.Editor editor = setting.edit();
            editor.putBoolean("dialogShown",true);
            editor.commit();
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdaptor customAdaptor = new CustomAdaptor(RecycleViewActivity.this,personname);
        recyclerView.setAdapter(customAdaptor);
    }
}