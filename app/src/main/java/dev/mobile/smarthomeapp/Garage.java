package dev.mobile.smarthomeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import dev.mobile.smarthomeapp.databinding.ActivityGarageBinding;
import dev.mobile.smarthomeapp.databinding.ActivityMainBinding;

public class Garage extends AppCompatActivity
{
    private ActivityGarageBinding Bind;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Bind = ActivityGarageBinding.inflate(getLayoutInflater());
        View view = Bind.getRoot();
        setContentView(view);


        Bind.parkSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Switch is checked (ON)
                    Bind.parkSwitch.getThumbDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Bind.parkSwitch.getTrackDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Bind.parkSwitch.setText("Gate OPEN");
                    Bind.garageOpen.setImageResource(R.drawable.garageo);
                }
                else
                {
                    Bind.parkSwitch.getThumbDrawable().setTint(getResources().getColor(R.color.white));
                    Bind.parkSwitch.getTrackDrawable().setTint(getResources().getColor(R.color.white));
                    Bind.parkSwitch.setText("Gate CLOSED");
                    Bind.garageOpen.setImageResource(R.drawable.garage);
                }
            }
        });

        Bind.reminderpark.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent start = new Intent(Garage.this, MainMenu.class);
                startActivity(start);
            }
        });

    }
}