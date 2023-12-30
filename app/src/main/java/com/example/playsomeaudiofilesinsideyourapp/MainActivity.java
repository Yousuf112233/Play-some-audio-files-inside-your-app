package com.example.playsomeaudiofilesinsideyourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

Button button1;
Button button2;
MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(mediaPlayer!=null)mediaPlayer.release();

                MediaPlayer MediaPlayer = android.media.MediaPlayer.create(MainActivity.this,R.raw.music_);
                MediaPlayer.start();
                





            }
        });



     button2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             if(mediaPlayer!=null)mediaPlayer.release();

             MediaPlayer MediaPlayer = new MediaPlayer();
             try {
                 MediaPlayer.setDataSource("https://yousufalibd.000webhostapp.com/song/Amar%20Sonar%20Bangala.mp3");
                 MediaPlayer.prepare();
                 MediaPlayer.start();
                 



             } catch (IOException e) {
                 throw new RuntimeException(e);
             }


         }
     });



    }
}