package com.desenvmovel.dp_aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Criação das variáveis que irão fazer conexão com o layout activity_main.xml
    private EditText mEditText;
    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Link para os componentes do layout (instanciando)
        mEditText = findViewById(R.id.idEditText);
        mTextView = findViewById(R.id.idTextView);

    }

    //Método que será chamado ao clicar no botão confirmar
    public void Confirmar(View view) {
        String textoDigitado = mEditText.getText().toString();
        mTextView.setText("O curso digitado é " + textoDigitado);
    }

}