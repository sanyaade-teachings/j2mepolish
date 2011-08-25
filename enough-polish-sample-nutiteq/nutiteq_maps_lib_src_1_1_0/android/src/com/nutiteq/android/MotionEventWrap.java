package com.nutiteq.android;

import android.os.Build;
import android.view.MotionEvent;

public class MotionEventWrap {
    private static final boolean IS_API_5 =  Integer.parseInt(Build.VERSION.SDK) >= 5;

    private MotionEventWrap(){};
    static int getPointerCount(MotionEvent event) {
        return IS_API_5 ? MotionEventWrapNew.getPointerCount(event) : 1;
    }

    static float getX(MotionEvent event, int idx) {
        return IS_API_5 ? MotionEventWrapNew.getX(event, idx) : 0;
    }

    static float getY(MotionEvent event, int idx) {
        return IS_API_5 ? MotionEventWrapNew.getY(event, idx) : 0;
    }
}
