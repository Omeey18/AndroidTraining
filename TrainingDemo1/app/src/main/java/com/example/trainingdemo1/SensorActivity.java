package com.example.trainingdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class SensorActivity extends AppCompatActivity {
    TextView tv;
    private SensorManager sensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        tv = (TextView) findViewById(R.id.textView);
        tv.setVisibility(View.GONE);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> mList = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for(int i=1;i<mList.size();i++){
            tv.setVisibility(View.VISIBLE);
            tv.append("\n" + mList.get(i).getName());
        }

    }
}