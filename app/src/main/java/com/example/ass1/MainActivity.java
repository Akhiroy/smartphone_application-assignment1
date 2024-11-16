package com.example.ass1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        TextView textView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);
        final int max=3;
        final int[] n={0};

        // Set Button click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show toast message
                if(n[0]<=max) {
                    if(n[0]==0){
                        Toast.makeText(MainActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show();
                        imageView.setImageResource(R.drawable.ok_smile);
                        textView.setText("Hurray! you clicked the Button");
                    }
                    else if (n[0]==1){
                        imageView.setImageResource(R.drawable.sad);
                        textView.setText("Why are you clicking repeatedly!...");

                    }
                    else if (n[0]==2){
                        imageView.setImageResource(R.drawable.happy_face);
                        textView.setText("hehehe......");
                    }
                    else{
                        imageView.setImageResource(R.drawable.angry);
                        textView.setText("stop clicking");
                        button.setText("stop");
                    }
                    n[0]++;
                }
                else {
                    Toast.makeText(MainActivity.this, "This button will no longer work!", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
