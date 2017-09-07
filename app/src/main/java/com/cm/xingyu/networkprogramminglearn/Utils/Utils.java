package com.cm.xingyu.networkprogramminglearn.Utils;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by Administrator on 2017/9/7.
 */
public class Utils  {
    public  static float dpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return dp * metrics.density;
    }
}
