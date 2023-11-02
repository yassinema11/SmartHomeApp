package dev.mobile.smarthomeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import dev.mobile.smarthomeapp.databinding.ActivityRegistreBinding;

public class activity_registre extends AppCompatActivity
{
    ActivityRegistreBinding Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Binding = ActivityRegistreBinding.inflate(getLayoutInflater());
        View view = Binding.getRoot();
        setContentView(view);

        Binding.btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (Binding.NameRegEdit.getText().toString().isEmpty())
                {
                    Binding.NameRegEdit.setError("REQUIRED !");
                }

                if (Binding.EmailRegEdit.getText().toString().isEmpty())
                {
                    Binding.EmailRegEdit.setError("REQUIRED !");
                }

                if (Binding.PassRegEdit.getText().toString().isEmpty())
                {
                    Binding.PassRegEdit.setError("REQUIRED !");
                }

                if (Binding.PassConfRegEdit.getText().toString().isEmpty())
                {
                    Binding.PassConfRegEdit.setError("REQUIRED !");
                }

                if (Binding.PassRegEdit.getText().toString().equals(Binding.PassConfRegEdit.getText().toString()))
                {
                    // send password to firesotre
                }
                else
                {
                    Binding.PassRegEdit.setError("Password mch kif kif !");
                    Binding.PassConfRegEdit.setError("Pawwsord Mch kif kif");
                }
            }
        });

        Binding.logRegBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent start = new Intent(activity_registre.this, activity_Login.class);
                startActivity(start);
            }
        });


    }

}