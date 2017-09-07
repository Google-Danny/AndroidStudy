package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.view.View;

import com.cm.xingyu.networkprogramminglearn.R;

/**
 * Created by Administrator on 2017/7/19.
 */
public class BitMapShader extends View {
    public BitMapShader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BitMapShader(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BitMapShader(Context context) {
        super(context);
    }
    
    Paint paint = new Paint();
    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.net);
    Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    @Override
    protected void onDraw(Canvas canvas) {
       paint.setShader(shader);
        canvas.drawCircle(300,300,200,paint);
    }



}
