package com.cm.xingyu.networkprogramminglearn.AnimationLearn;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.cm.xingyu.networkprogramminglearn.R;

/**
 * Created by Administrator on 2016/12/10.
 */
public class AnimationActivity extends Activity implements View.OnClickListener {
    private Animation animation;
    private AnimationDrawable animationDrawable;
    public ImageView goldImage;
    private Button alphaAnim;
    private Button scaleAnim;
    private Button translateAnim;
    private Button rotateAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }

    private void initView() {
        goldImage = (ImageView) findViewById(R.id.image);
        alphaAnim = (Button) findViewById(R.id.alpha);
        scaleAnim = (Button) findViewById(R.id.scale);
        translateAnim = (Button) findViewById(R.id.translate);
        rotateAnim = (Button) findViewById(R.id.rotate);
    }

    private void initData() {
        alphaAnim.setOnClickListener(this);
        scaleAnim.setOnClickListener(this);
        translateAnim.setOnClickListener(this);
        rotateAnim.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.alpha:
                animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
                goldImage.startAnimation(animation);
                break;
            case R.id.scale:
                animation = AnimationUtils.loadAnimation(this, R.anim.scale);
                goldImage.startAnimation(animation);
                break;
            case R.id.translate:
                animation = AnimationUtils.loadAnimation(this, R.anim.translate);
                goldImage.startAnimation(animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                         goldImage.setAnimation(animation);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                break;
            case R.id.rotate:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
                goldImage.startAnimation(animation);
                break;
            default: {
                break;
            }

        }
    }
}
