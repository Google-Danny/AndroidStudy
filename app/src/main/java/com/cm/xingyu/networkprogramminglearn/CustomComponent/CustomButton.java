package com.cm.xingyu.networkprogramminglearn.CustomComponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.cm.xingyu.networkprogramminglearn.R;

/**
 * Created by Administrator on 2016/12/10.
 */
public class CustomButton extends Button {
    //come on!!!
    private Context mContext;
    private Paint mBorderPaint;
    private Paint mTextPaint;
    private boolean mTopBorder;
    private boolean mLeftBorder;
    private boolean mRightBorder;
    private boolean mBottomBorder;

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        mTextPaint = new Paint();
        mTextPaint.setColor(Color.WHITE);
        mBorderPaint = new Paint();
        mBorderPaint.setColor(Color.BLACK);
        TypedArray params = context.obtainStyledAttributes(attrs, R.styleable.CustomButton);
//        int background = params.getResourceId()
        int buttonColor = params.getColor(R.styleable.CustomButton_buttonColor,000000);
        setTextColor(buttonColor);
        float textsize = params.getDimension(R.styleable.CustomButton_textSize,40);
        setTextSize(textsize);
        mTopBorder = params.getBoolean(R.styleable.CustomButton_topBorder,true);
        mBottomBorder = params.getBoolean(R.styleable.CustomButton_bottomBorder,true);
        mLeftBorder = params.getBoolean(R.styleable.CustomButton_leftBorder,true);
        mRightBorder = params.getBoolean(R.styleable.CustomButton_rightBorder,true);
    }

    public CustomButton(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mTopBorder==true){
            canvas.drawLine(0,0,this.getWidth()-1,0,mBorderPaint);
        }
    }
}
