package com.example.spinner_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spin = findViewById(R.id.turtle_spinner);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView result = findViewById(R.id.result_text);
                String turtle = (String) spin.getSelectedItem();
                result.setText("You select " + turtle);

                ImageView image = findViewById(R.id.turtle_image);
//                image.setImageResource(R.drawable.raphael);

                if(position == 0) {
                    image.setImageResource(R.drawable.turtle);
                }
                else if(position == 1) {
                    image.setImageResource(R.drawable.leonardo);
                }
                else if (position == 2) {
                    image.setImageResource(R.drawable.donatello);
                }
                else if(position == 3) {
                    image.setImageResource(R.drawable.raphael);
                }

                Toast.makeText(parent.getContext(), "You select " + turtle, LENGTH_SHORT).show();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
