package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/10.
 */
public class DrawOval extends View {
    public DrawOval(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DrawOval(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawOval(Context context) {
        super(context);
    }

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawOval(50,50,350,200,paint);
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawOval(400,50,350,200,paint);
    }
}
