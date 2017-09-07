package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.cm.xingyu.networkprogramminglearn.R;

public class HeartAnim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_anim);
        ImageView iv = (ImageView) findViewById(R.id.iv);
//        ObjectAnimator anim1 = ObjectAnimator.ofFloat(iv,"scaleX",1.2f,0.8f);
//        anim1.setRepeatCount(-1);
//        ObjectAnimator anim2 = ObjectAnimator.ofFloat(iv,"scaleY",1.2f,0.8f);
//        anim2.setRepeatCount(-1);
//        AnimatorSet set = new AnimatorSet();
//        set.play(anim1).with(anim2);
//        set.setDuration(2000);
//        set.start();
Animator animator = AnimatorInflater.loadAnimator(this,R.animator.heartanim);
        animator.setTarget(iv);
        animator.start();
    }
}
