package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/19.
 */
public class LinerarGradient  extends View {
    public LinerarGradient(Context context) {
        super(context);
    }

    public LinerarGradient(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinerarGradient(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    Paint paint = new Paint();
    Shader shader = new LinearGradient(100,100,500,500, Color.parseColor("#E91E63"),Color.parseColor("#0033ff"), Shader.TileMode.MIRROR);


    @Override
    protected void onDraw(Canvas canvas) {
        paint.setShader(shader);
      canvas.drawCircle(300,300,200,paint);
    }
}
