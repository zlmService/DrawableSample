package com.demo.zlm.drawablesample;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView te;
    ImageView im;
    ImageView im1;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        te = (TextView) findViewById(R.id.text);
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                te.setSelected(true);
                im.setSelected(false);
                TransitionDrawable drawable = (TransitionDrawable) textView.getBackground();
                drawable.startTransition(2000);
            }
        });
        im = (ImageView) findViewById(R.id.image);

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                te.setSelected(false);
                im.setSelected(true);
                TransitionDrawable drawable = (TransitionDrawable) textView.getBackground();
                drawable.reverseTransition(2000);
            }
        });
        im1 = (ImageView) findViewById(R.id.imagelevel1);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im1.setImageLevel(15);
                im2.setImageLevel(5);
            }
        });
        im2 = (ImageView) findViewById(R.id.imagelevel2);
        textView= (TextView) findViewById(R.id.text_transition);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im1.setImageLevel(5);
                im2.setImageLevel(15);

            }
        });
        im3= (ImageView) findViewById(R.id.image_scale);
        ScaleDrawable scaleDrawable= (ScaleDrawable) im3.getBackground();
        scaleDrawable.setLevel(5555);
        im4= (ImageView) findViewById(R.id.image_clip);
        ClipDrawable clipDrawable= (ClipDrawable) im4.getBackground();
        clipDrawable.setLevel(5000);

        im5= (ImageView) findViewById(R.id.img5);
        CustomDrawable customDrawable=new CustomDrawable(Color.YELLOW);
        im5.setImageDrawable(customDrawable);


    }
}
