package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/10.
 */
public class drawRoundRect extends View {
    public drawRoundRect(Context context) {
        super(context);
    }

    public drawRoundRect(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public drawRoundRect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(100,100,500,300,10,10,paint);
    }
}
