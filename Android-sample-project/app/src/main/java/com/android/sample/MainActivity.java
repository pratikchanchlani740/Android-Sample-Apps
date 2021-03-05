package com.android.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Chat launch ");

        Button chatButton = findViewById(R.id.chatButton);
        Button chatLaunchButton = findViewById(R.id.chatLaunchButton);

        final EditText userIdEditText = findViewById(R.id.userIdEditText);


        chatLaunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Applozic chat screen launch


            }
        });

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Applozic chat launch with user


            }
        });


    }


}
