package ru.itis.twoactivityproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvText = (TextView) findViewById(R.id.tv_text);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        tvText.setText(text);
    }
}
