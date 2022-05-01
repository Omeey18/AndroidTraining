package com.example.trainingdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button bluetoothbtn, intentbtn,linearlayoutbtn, listviewbtn, logbtn, mainbtn,
            mapbtn, multilangbtn, proximitybtn, recycleviewbbtn,sensorbtn,sharedprerencesbtn, spinnerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();

        bluetoothbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BluetoothActivity.class);
                startActivity(intent);
            }
        });

        intentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IntentActivity.class);
                startActivity(intent);
            }
        });

        linearlayoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        listviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListViewActivity.class);
                startActivity(intent);
            }
        });

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LogActivity.class);
                startActivity(intent);
            }
        });

        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });

        multilangbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MultiLangActivity.class);
                startActivity(intent);
            }
        });

        proximitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProximityActivity.class);
                startActivity(intent);
            }
        });

        recycleviewbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecycleViewActivity.class);
                startActivity(intent);
            }
        });

        sensorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SensorActivity.class);
                startActivity(intent);
            }
        });
        sharedprerencesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SharedPreferencesActivity.class);
                startActivity(intent);
            }
        });

        spinnerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SpinnerActivity.class);
                startActivity(intent);
            }
        });

    }


    private void init(){
        bluetoothbtn = (Button) findViewById(R.id.bluetoothbtn);
        intentbtn = (Button) findViewById(R.id.intentbtn);
        linearlayoutbtn = (Button) findViewById(R.id.linearlayoutbtn);
        listviewbtn = (Button) findViewById(R.id.listviewbtn);
        logbtn = (Button) findViewById(R.id.logbtn);
        mainbtn = (Button) findViewById(R.id.mainbtn);
        mapbtn = (Button) findViewById(R.id.mapbtn);
        multilangbtn = (Button) findViewById(R.id.multilangbtn);
        proximitybtn = (Button) findViewById(R.id.proximitybtn);
        recycleviewbbtn = (Button) findViewById(R.id.recycleviewbbtn);
        sensorbtn = (Button) findViewById(R.id.sensorbtn);
        sharedprerencesbtn = (Button) findViewById(R.id.sharedprerencesbtn);
        spinnerbtn = (Button) findViewById(R.id.spinnerbtn);
    }
}