package br.com.etecia.loginaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                TextView textUsername = findViewById(R.id.textUsername);
                TextView textPassword = findViewById(R.id.textPassword);
                String username = textUsername.getText().toString();
                String password = textPassword.getText().toString();
            /*if (username.equals("admin")){
                if(password.equals("admin")){
                    System.out.println("Logado com Suuuucesso");
                }else{
                    System.out.println("Senha incorreta");
                }
            } else{
                System.out.println("Usuário incorreto");
            }*/

                if ("admin".equals(username) && "12345".equals(password)) {
                    Intent intentIrPraCasa = new Intent(MainActivity.this,
                            Home.class);
                    startActivity(intentIrPraCasa);
                } else {
                    System.out.println("Deu ruim mermao");
                }
            }
        });
    }

    private void alert(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}