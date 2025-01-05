package com.example.button;


import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    int clickCount = 0;
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.albert);

    }
      public void go(view view) {
                clickCount++;
                if (clickCount == 1) {
        myButton.setText("Oh, yea, I’ve been clicked!");
        }
    }

    }