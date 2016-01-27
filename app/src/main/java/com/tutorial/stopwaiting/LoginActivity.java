package com.tutorial.stopwaiting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {/*OJO cambie la herencia (antes:Activity) (despues:AppCompatActivity)*/
    private TextView registro_link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registro_link = (TextView)findViewById(R.id.registroActivity);
    }

    public void clickEnlaceRegistro(View view){
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(intent);
    }
}
