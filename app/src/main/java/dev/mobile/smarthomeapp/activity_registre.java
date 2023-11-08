package dev.mobile.smarthomeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


import java.util.HashMap;
import java.util.Map;

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

        FirebaseFirestore db = FirebaseFirestore.getInstance();

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
                    Map<String, Object> userData = new HashMap<>();
                    userData.put("name", Binding.NameRegEdit.getText().toString());
                    userData.put("email", Binding.EmailRegEdit.getText().toString());

                    // Add the user data to Firestore
                    db.collection("users").add(userData)
                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>()
                            {
                                @Override
                                public void onSuccess(DocumentReference documentReference)
                                {
                                    // Handle success (e.g., user registered successfully)
                                }
                            })
                            .addOnFailureListener(new OnFailureListener()
                            {
                                @Override
                                public void onFailure(@NonNull Exception e)
                                {
                                    // Handle failure (e.g., registration failed)
                                }
                            });
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