package com.example.registeruser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextFirstName;
    EditText editTextLastName;
    EditText editTextEmail;
    TextView textViewFirstName;
    TextView textViewLastName;
    TextView textViewEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void registerUser(View view){
        button = findViewById(R.id.bottom);
        editTextFirstName = findViewById(R.id.editText);
        editTextLastName = findViewById(R.id.editText2);
        editTextEmail = findViewById(R.id.editText3);
        textViewFirstName = findViewById(R.id.textView3);
        textViewLastName = findViewById(R.id.textView2);
        textViewEmail = findViewById(R.id.textView);
        textViewFirstName.setText(editTextFirstName.getText().toString());
        textViewLastName.setText(editTextLastName.getText().toString());
        textViewEmail.setText(editTextEmail.getText().toString());
    }
}
