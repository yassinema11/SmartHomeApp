package dev.mobile.smarthomeapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import dev.mobile.smarthomeapp.databinding.ActivityMainBinding;
import dev.mobile.smarthomeapp.databinding.ActivityRegistreBinding;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = Binding.getRoot();
        setContentView(view);

        Binding.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Switch is checked (ON)
                    Binding.switch1.getThumbDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch1.getTrackDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch1.setText("Light ON");
                    Binding.switchImage1.setImageResource(R.drawable.bulb);
                }
                else
                {
                    Binding.switch1.getThumbDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch1.getTrackDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch1.setText("Light OFF");
                    Binding.switchImage1.setImageResource(R.drawable.lightbulb);
                }
            }
        });

        Binding.switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Switch is checked (ON)
                    Binding.switch2.getThumbDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch2.getTrackDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch2.setText("Light ON");
                    Binding.switchImage2.setImageResource(R.drawable.bulb);
                }
                else
                {
                    Binding.switch2.getThumbDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch2.getTrackDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch2.setText("Light OFF");
                    Binding.switchImage2.setImageResource(R.drawable.lightbulb);

                }
            }
        });

        Binding.switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Switch is checked (ON)
                    Binding.switch3.getThumbDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch3.getTrackDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch3.setText("Light ON");
                    Binding.switchImage3.setImageResource(R.drawable.bulb);
                }
                else
                {
                    Binding.switch3.getThumbDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch3.getTrackDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch3.setText("Light OFF");
                    Binding.switchImage3.setImageResource(R.drawable.lightbulb);
                }
            }
        });

        Binding.switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Switch is checked (ON)
                    Binding.switch4.getThumbDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch4.getTrackDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.switch4.setText("Light ON");
                    Binding.switchImage4.setImageResource(R.drawable.bulb);
                }
                else
                {
                    Binding.switch4.getThumbDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch4.getTrackDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.switch4.setText("Light OFF");
                    Binding.switchImage4.setImageResource(R.drawable.lightbulb);
                }
            }
        });

        Binding.acSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Switch is checked (ON)
                    Binding.acSwitch.getThumbDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.acSwitch.getTrackDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.acSwitch.setText("Climatiseur ON");
                }
                else
                {
                    Binding.acSwitch.getThumbDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.acSwitch.getTrackDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.acSwitch.setText("Climatiseur OFF");
                }
            }
        });

        Binding.fanSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    // Switch is checked (ON)
                    Binding.fanSwitch.getThumbDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.fanSwitch.getTrackDrawable().setTint(getResources().getColor(R.color.primaryColor));
                    Binding.fanSwitch.setText("Ventillateur ON");
                }
                else
                {
                    Binding.fanSwitch.getThumbDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.fanSwitch.getTrackDrawable().setTint(getResources().getColor(R.color.white));
                    Binding.fanSwitch.setText("Ventillateur OFF");
                }
            }
        });

        Binding.reminder.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Garage.class);
                startActivity(intent);
            }
        });
    }


}
