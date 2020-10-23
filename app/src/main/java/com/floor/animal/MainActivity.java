package com.floor.animal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity {

    Button roll;
    TextView textView;
    ImageView animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.roll);
        textView = findViewById(R.id.textView);
        animal = findViewById(R.id.animal);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll.setEnabled(false);
                roll.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        roll.setEnabled(true);
                    }
                }, 2000);
                roller();
            }
        });
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    private void roller() {
        int rollerNumber = (int) (Math.random() * 12 + 1);

        switch (rollerNumber) {
            case 1:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.tiger));
                textView.setText("Tiger");
                Toast.makeText(this, "Tiger", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.squirrel));
                textView.setText("Squirrel");
                Toast.makeText(this, "Squirrel", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.panda));
                textView.setText("Panda Bear");
                Toast.makeText(this, "Panda Bear", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.lion));
                textView.setText("Lion");
                Toast.makeText(this, "Lion", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.bear));
                textView.setText("Bear");
                Toast.makeText(this, "Bear", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.elephant));
                textView.setText("Elephant");
                Toast.makeText(this, "Elephant", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.shark));
                textView.setText("Shark");
                Toast.makeText(this, "Shark", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.ant));
                textView.setText("Ant");
                Toast.makeText(this, "Ant", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.horse));
                textView.setText("Horse");
                Toast.makeText(this, "Horse", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                textView.setText("Cat");
                Toast.makeText(this, "Cat", Toast.LENGTH_SHORT).show();
                break;
            case 11:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.dog));
                textView.setText("Dog");
                Toast.makeText(this, "Dog", Toast.LENGTH_SHORT).show();
                break;
            case 12:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.fox));
                textView.setText("Fox");
                Toast.makeText(this, "Fox", Toast.LENGTH_SHORT).show();
                break;
            default:
                animal.setImageDrawable(getResources().getDrawable(R.drawable.animal));
                textView.setText("Empty dice");
                Toast.makeText(this, "EmptyDice", Toast.LENGTH_SHORT).show();
        }
    }
}