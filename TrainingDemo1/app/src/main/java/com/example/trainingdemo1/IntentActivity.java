package com.example.trainingdemo1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class IntentActivity extends AppCompatActivity {
    Button b2,b3,b4,mainbtn;
    EditText editText;
    ImageButton ib1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        init();
        setTitle("Intent Activity");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+text));
                startActivity(intent);
                editText.setText("");
            }
        });
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.whatsapp");
                intent.putExtra(intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(intent,"Title"));
                editText.setText("");
            }
        });

        mainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND,Uri.parse("mailto:"));
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"ompatel1862@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT,"New Subject");
                email.putExtra(Intent.EXTRA_TEXT,"body of mail");
                startActivity(Intent.createChooser(email,"title"));
            }
        });

    }
    private void init(){
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        mainbtn = (Button) findViewById(R.id.mainbtn);

        editText = (EditText) findViewById(R.id.editText);
        ib1 = (ImageButton) findViewById(R.id.imageButton);


    }
}