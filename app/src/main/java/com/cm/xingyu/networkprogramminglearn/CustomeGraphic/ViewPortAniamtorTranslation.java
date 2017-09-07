package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.cm.xingyu.networkprogramminglearn.R;
import com.cm.xingyu.networkprogramminglearn.Utils.Utils;

import static android.os.Build.VERSION.SDK_INT;
/**
 * Created by Administrator on 2017/9/7.
 */
public class ViewPortAniamtorTranslation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int translationStateCount = SDK_INT > Build.VERSION_CODES.LOLLIPOP ? 6 : 4;
    int translationState = 0;
    public ViewPortAniamtorTranslation(Context context) {
        super(context);
    }

    public ViewPortAniamtorTranslation(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewPortAniamtorTranslation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (translationState){
                    case 0:
                        imageView.animate().translationX(Utils.dpToPixel(500)).setInterpolator(new DecelerateInterpolator());
                        break;
                    case 1:
                        imageView.animate().translationX(0);
                        break;
                    case 2:
                        imageView.animate().translationY(Utils.dpToPixel(50));
                        break;
                    case 3:
                        imageView.animate().translationY(0);
                        break;
                    case 4:
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            imageView.animate().translationZ(Utils.dpToPixel(15));
                        }
                        break;
                    case 5:
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            imageView.animate().translationZ(0);
                        }
                        break;
                }
                translationState++;
                if (translationState == translationStateCount) {
                    translationState = 0;
                }
            }
        });
    }
}
