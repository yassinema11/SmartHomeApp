package dev.mobile.smarthomeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dev.mobile.smarthomeapp.databinding.ActivityLoginBinding;
import dev.mobile.smarthomeapp.databinding.ActivityRegistreBinding;

public class activity_Login extends AppCompatActivity
{
    private ActivityLoginBinding Bind;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Bind = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = Bind.getRoot();
        setContentView(view);

        Bind.btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (Bind.EmailEditLogin.getText().toString().isEmpty())
                {
                    Bind.EmailEditLogin.setError("REQUIRED !");
                }

                if (Bind.PassLogEdit.getText().toString().isEmpty())
                {
                    Bind.PassLogEdit.setError("REQUIRED !");
                }

                Intent start = new Intent(activity_Login.this, MainActivity.class);
                startActivity(start);
            }
        });

        Bind.logRegBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent start = new Intent(activity_Login.this, activity_registre.class);
                startActivity(start);
            }
        });
    }
}