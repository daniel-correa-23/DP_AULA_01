package com.desenvmovel.dp_aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.idEditText);
        mTextView = findViewById(R.id.idTextView);

    }

    public void Confirmar(View view) {
        String textoDigitado = mEditText.getText().toString();
        mTextView.setText("O curso digitado é " + textoDigitado);
    }

}