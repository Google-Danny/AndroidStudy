package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.cm.xingyu.networkprogramminglearn.R;

/**
 * Created by Administrator on 2017/9/6.
 */
public class AniamtorLayout extends RelativeLayout {
    sportsView view;
    Button animateBt;
    public AniamtorLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AniamtorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
//        view = (sportsView) findViewById(R.id.objectAnimatorView);
//        animateBt = (Button) findViewById(R.id.animateBt);
//
//        animateBt.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ObjectAnimator animator = ObjectAnimator.ofFloat(view,"progress",0,100);
//                animator.setDuration(1000);
//                animator.setInterpolator(new FastOutSlowInInterpolator());
//                animator.start();
//            }
//
//
//        });

    }


}
