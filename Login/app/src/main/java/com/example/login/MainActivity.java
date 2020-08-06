package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button)findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView)findViewById(R.id.tLogin);
                TextView tSenha = (TextView)findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if(login.equals("pilo")&&senha.equals("123")){
                    setContentView(R.layout.tela2);
                    TextView tView = (TextView)findViewById(R.id.tView);
                    tView.setText("Seja Bem vindo "+ login);
                    //alert("Seja Bem vindo "+ login);
                }
                else{
                    alert("Login ou senha Incorretos.");
                    tLogin.setText("");
                    tSenha.setText("");



                }
            }
        });
    }
    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
