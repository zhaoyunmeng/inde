package com.example.index;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvUsername = findViewById(R.id.text1);

        Intent intent = getIntent();
        String username = intent.getStringExtra("key_username");
        tvUsername.setText(username);


        TextView tvBack=findViewById(R.id.tv_back);
        tvBack.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                Intent i=new Intent();
                i.putExtra("key_result","kdygfawb");
                setResult(Activity.RESULT_OK,i);
                finish();
            }
        });

    }
}
