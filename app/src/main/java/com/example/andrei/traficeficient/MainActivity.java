package com.example.andrei.traficeficient;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

            }
        }, TIME_OUT);

        ImageView imageView = (ImageView) findViewById(R.id.imageView4);
        imageView.animate().rotation(360).setDuration(2000).start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            case (MotionEvent.ACTION_DOWN):{
                Intent intent = new Intent(MainActivity.this, Meniu.class);
                startActivity(intent);
                finish();
                return true;
            }
            default:
                return super.onTouchEvent(event);
        }
    }

}
