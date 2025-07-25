package com.five_corp.p372ad.internal.view;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

/* renamed from: com.five_corp.ad.internal.view.I */
/* loaded from: classes4.dex */
public abstract class AbstractC14130I {
    /* renamed from: a */
    public static int m78062a(String str) {
        try {
            if (!str.startsWith("#")) {
                str = "#".concat(str);
            }
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: a */
    public static void m78064a(View view) {
        ViewParent parent;
        if (view == null || (parent = view.getParent()) == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
    }

    /* renamed from: a */
    public static void m78063a(TextView textView, GradientDrawable gradientDrawable) {
        textView.setBackground(gradientDrawable);
    }
}
