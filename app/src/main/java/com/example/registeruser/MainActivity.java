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
        button = findViewById(R.id.buttonRegisterUser);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        textViewFirstName = findViewById(R.id.textViewFirstName);
        textViewLastName = findViewById(R.id.textViewLastName);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewFirstName.setText(editTextFirstName.getText().toString());
        textViewLastName.setText(editTextLastName.getText().toString());
        textViewEmail.setText(editTextEmail.getText().toString());
    }
}
