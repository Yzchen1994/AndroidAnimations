package com.example.macbook.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){
        ImageView pic1 = (ImageView) findViewById(R.id.image);

        //pic1.animate().rotation(180f).setDuration(2000);
        //pic1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //pic1.animate().translationXBy(1000f).setDuration(2000);

        pic1.animate().rotation(360f).translationXBy(1000f).setDuration(2000);

        //ImageView pic2 = (ImageView) findViewById(R.id.image2);
        //pic2.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView pic1 = (ImageView) findViewById(R.id.image);
        pic1.setTranslationX(-1000f);



    }


}
