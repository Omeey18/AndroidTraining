package com.example.trainnigdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private ConstraintLayout layout;
//    private R.layout layout;

    private  int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this,"Oncreate Method",Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        layout = (ConstraintLayout) findViewById(R.id.layout);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(layout,"Mana kiya thana...!",Snackbar.LENGTH_LONG);
                snackbar.show();
                        //flaticon.com   2. icons8.com  3. fonts.google.com
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i % 2 == 0){
                    textView.setTextColor(Color.parseColor("#008000"));
                    i++;
                }
                else{
                    textView.setTextColor(Color.parseColor("#800080"));
                    i--;
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycle","On start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle","On Destory");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle","On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle","On Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle","On Restart");
    }
}