package com.police.e_cop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin=findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(LoginActivity.this, CivilHomeActivity.class);
                startActivity(main);
                finish();
            }
        });
    }
    public void Forgot(View view)
    {
        Intent forgot = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(forgot);
        finish();
    }
    public void Register(View view)
    {
        Intent signup = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(signup);
        finish();
    }

}
