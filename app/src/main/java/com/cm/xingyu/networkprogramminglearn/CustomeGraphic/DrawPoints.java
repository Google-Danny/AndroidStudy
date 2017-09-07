package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/10.
 */
public class DrawPoints extends View {
    public DrawPoints(Context context) {
        super(context);
    }

    public DrawPoints(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPoints(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float[] points = {0, 0, 50, 50,50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoints(points, 2, 4, paint);
    }
}
