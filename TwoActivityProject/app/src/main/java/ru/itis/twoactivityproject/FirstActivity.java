package ru.itis.twoactivityproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private Button btnSecondActivity;
    private EditText etEnterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etEnterText = (EditText) findViewById(R.id.et_enter_text);
        btnSecondActivity = (Button) findViewById(R.id.btn_second_activity);
        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etEnterText.getText().toString();

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });
    }
}
