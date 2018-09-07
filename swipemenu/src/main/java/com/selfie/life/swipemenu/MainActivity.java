package com.selfie.life.swipemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.selfie.life.swipemenu.SwipeLayoutLibrary.SwipeRevealLayout;

public class MainActivity extends AppCompatActivity {

    private SwipeRevealLayout   swipeLayout;
    private LinearLayout        frontLayout;
    private LinearLayout        delete_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeLayout     =   (SwipeRevealLayout)findViewById(R.id.swipe_layout);
        frontLayout     =   (LinearLayout)findViewById(R.id.frontLayout);

        delete_layout   =   (LinearLayout)findViewById(R.id.delete_layout);

        delete_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swipeLayout.isOpened()){
                    swipeLayout.close(true);
                }else {
                }
            }
        });

        frontLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swipeLayout.isOpened()){
                    swipeLayout.close(true);
                }else {

                }
            }
        });
    }
}
