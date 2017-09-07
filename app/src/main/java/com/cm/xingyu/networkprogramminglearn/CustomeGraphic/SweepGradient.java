package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/19.
 */
public class SweepGradient extends View {
    public SweepGradient(Context context) {
        super(context);
    }

    public SweepGradient(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SweepGradient(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();


    Shader shader = new android.graphics.SweepGradient(200, 200, Color.parseColor("#E91E63"),
            Color.parseColor("#0033ff"));

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setShader(shader);
        canvas.drawCircle(300,300,200,paint);
    }
}
