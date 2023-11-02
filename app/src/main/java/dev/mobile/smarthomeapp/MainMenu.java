package dev.mobile.smarthomeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;

import dev.mobile.smarthomeapp.databinding.ActivityMainMenuBinding;

public class MainMenu extends AppCompatActivity implements View.OnClickListener
{

    private ActivityMainMenuBinding Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        View view = Binding.getRoot();
        setContentView(view);

        Binding.Homeicon.setOnClickListener(this);
        Binding.Gardenicon.setOnClickListener(this);
        Binding.Garageicon.setOnClickListener(this);

        if (savedInstanceState == null)
        {
            loadFragment(new HomeFragement());
        }
    }

    @Override
    public void onClick(View v)
    {
        v.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            loadFragment(new HomeFragement());

        }
    });

    }

    private void loadFragment(Fragment fragment)
    {
        if (fragment != null)
        {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_placeholder, fragment)
                    .commit();
        }
    }
}
