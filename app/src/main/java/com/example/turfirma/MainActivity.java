package com.example.turfirma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
    Button Auth;
    EditText Login;
    EditText Password;
    TextView Label;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (EditText) findViewById(R.id.editText5);
        Password = (EditText) findViewById(R.id.editText6);

       // btnOk = (Button) findViewById(R.id.btnOk);

    }

    public void onMyButtonClick(View view)
    {

        Intent intent = new Intent(this,activityTwo.class);
        intent.putExtra("tlogin",Login.getText().toString());
        intent.putExtra("tpass",Password.getText().toString());
        startActivity(intent);
        // выводим сообщение
        Toast.makeText(this, "Вы перешли на главное меню", Toast.LENGTH_SHORT).show();

    }


}
              //  Intent intent = new Intent(this,activityTwo.class);
              //  startActivity(intent);
