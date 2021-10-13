package com.example.app1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//  TODO some comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText();

        for (int j = 0; j < 10; j++) {
            Log.d("MainActivity", "j = " + j);
        }
    }

    private void displayText() {
        TextView nt = findViewById(R.id.newtest);

        TextFunction tf = new TextFunction();
        nt.setText(tf.getValue());
    }
}