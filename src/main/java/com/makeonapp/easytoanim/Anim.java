package com.makeonapp.easytoanim;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by levic on 14/04/2018.
 */

public class Anim {

    public static final int SLIDE_TO_DOWN = R.anim.slide_to_down;
    public static final int FADE_IN = R.anim.fade_in;
    public static final int FADE_OUT = R.anim.fade_out;

    public static void animTextView(Context context, int anim, TextView textView) {
        textView.startAnimation(anim(context, anim));
    }

    public static void animEditText(Context context, int anim, EditText editText) {
        editText.startAnimation(anim(context, anim));
    }

    private static Animation anim(Context context, int animation) {
        Animation slideUpAnimation = AnimationUtils.loadAnimation(context,
                animation);
        slideUpAnimation.setFillAfter(true);
        return slideUpAnimation;
    }
}
