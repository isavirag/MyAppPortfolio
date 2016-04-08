package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *Shows a toast message every time a button is clicked that will be used to launch apps in the future
     *
     * @param view this method takes in the view that calls it (button clicks in this case)
     */
    public void showApp(View view){
        Button clickedButton = (Button) view;
        int duration = Toast.LENGTH_SHORT;
        switch(clickedButton.getId()){
            case R.id.button_spotify_streamer:
                Toast.makeText(this, "This will launch my Spotify Streamer", duration).show();
                break;
            case R.id.button_scores:
                Toast.makeText(this, "This will launch my Scores App!", duration).show();
                break;
            case R.id.button_library:
                Toast.makeText(this, "This will launch my Library App!", duration).show();
                break;
            case R.id.button_build_it_bigger:
                Toast.makeText(this, "This will launch Build It Bigger", duration).show();
                break;
            case R.id.button_xyz_reader:
                Toast.makeText(this, "This will launch my XYZ Reader App!", duration).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(this, "This will launch my Capstone App!", duration).show();
                break;
        }
    }
}
