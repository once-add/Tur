package com.example.turfirma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class activityTwo extends AppCompatActivity {
    TextView Login;
    TextView Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Login = (TextView) findViewById(R.id.log);
        Password = (TextView) findViewById(R.id.pass);
        Intent Two = getIntent();
        String tlogin = Two.getStringExtra("tlogin");
        String tpass = Two.getStringExtra("tpass");
        Login.setText("Ваш логин:"+tlogin+"\n");
        Password.setText("Ваш пароль:"+tpass);
    }
    public void btnKatalog(View view)
    {
        Intent intent = new Intent(this,catalog.class);
        startActivity(intent);
        // выводим сообщение
        Toast.makeText(this, "Вы в Каталоге", Toast.LENGTH_SHORT).show();
    }
    public void mePred(View view)
    {
        Intent intent = new Intent(this,mePredl.class);
        startActivity(intent);


    }
}
