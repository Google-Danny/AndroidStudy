package com.cm.xingyu.networkprogramminglearn.CustomeGraphic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.cm.xingyu.networkprogramminglearn.R;

/**
 * Created by Administrator on 2017/8/5.
 */
public class CanvasMethod extends View {

    public CanvasMethod(Context context) {
        super(context);
    }

    public CanvasMethod(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasMethod(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path();
    Camera camera = new Camera();
    Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.net);
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
//        canvas.translate(200,0);
        camera.rotateX(30);
        canvas.translate(200, 10);
        camera.applyToCanvas(canvas);
        canvas.translate(-200,-10);
        camera.restore();
//        canvas.skew(0, 0.5f);
        canvas.drawBitmap(bitmap,200,100,paint);
        canvas.restore();

    }
}
