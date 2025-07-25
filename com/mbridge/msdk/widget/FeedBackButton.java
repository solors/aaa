package com.mbridge.msdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameTool;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes6.dex */
public class FeedBackButton extends TextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public FeedBackButton(Context context) {
        super(context);
        m48093a();
    }

    /* renamed from: a */
    private void m48093a() {
        setText(ResourceUtil.m51605a(getContext(), "mbridge_cm_feedback_btn_text", "string"));
        Context context = getContext();
        int m51772a = SameTool.m51772a(context, 13.0f);
        setPadding(m51772a, 0, m51772a, 0);
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(SameTool.m51772a(context, 20.0f));
        gradientDrawable.setColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
        setTextColor(-1);
    }

    public FeedBackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48093a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48093a();
    }

    @RequiresApi(api = 21)
    public FeedBackButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m48093a();
    }
}
