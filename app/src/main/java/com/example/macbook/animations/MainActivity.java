package com.example.macbook.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view){
        ImageView pic1 = (ImageView) findViewById(R.id.image);
        ImageView pic2 = (ImageView) findViewById(R.id.image2);

        pic1.animate().alpha(0f).setDuration(2000);

        pic2.animate().alpha(1f).setDuration(2000);
    }
}
