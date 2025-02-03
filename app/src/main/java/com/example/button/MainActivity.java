package com.example.button;


import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button myButton;
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.button2);

    }

    public void go(View view) {
        clickCount++;
        myButton.setText("This is a click number:" + clickCount);
        if (clickCount == 7) {
            myButton.setText("Enough to click. Go to new start!");
            clickCount = 0;
        }
    }
}