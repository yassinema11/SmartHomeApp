package dev.mobile.smarthomeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import dev.mobile.smarthomeapp.databinding.ActivityLoginBinding;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;


public class activity_Login extends AppCompatActivity
{
    private ActivityLoginBinding Bind;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Bind = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = Bind.getRoot();
        setContentView(view);

        db = FirebaseFirestore.getInstance();


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

                    // Query Firestore to check if the user with the provided email and password exists
                    Query query = db.collection("users")
                            .whereEqualTo("email", Bind.EmailEditLogin)
                            .whereEqualTo("password", Bind.PassLogEdit);

                    query.get()
                            .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>()
                            {
                                @Override
                                public void onSuccess(QuerySnapshot queryDocumentSnapshots)
                                {
                                    if (!queryDocumentSnapshots.isEmpty())
                                    {
                                        // User authenticated successfully, navigate to the main activity
                                        Toast.makeText(activity_Login.this,"Welcome User",Toast.LENGTH_LONG).show();
                                        Intent start = new Intent(activity_Login.this, MainActivity.class);
                                        startActivity(start);
                                    }
                                    else
                                    {
                                        Toast.makeText(activity_Login.this,"User Not Found",Toast.LENGTH_LONG).show();
                                    }
                                }
                            })
                            .addOnFailureListener(new OnFailureListener()
                            {
                                @Override
                                public void onFailure(@NonNull Exception e)
                                {
                                    // Handle Firestore query failure (e.g., display an error message)
                                }
                            });
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