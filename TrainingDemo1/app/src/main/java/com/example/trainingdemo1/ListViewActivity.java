package com.example.trainingdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"India","china","Australia","USA","Russia","India","china","Australia","USA","Russia","India","china","Australia","USA","Russia","India","china","Australia","USA","Russia","India","china","Australia","USA","Russia"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        simpleList = (ListView) findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.listviewlayout,R.id.textView2,countryList);

        simpleList.setAdapter(arrayAdapter);
    }
}