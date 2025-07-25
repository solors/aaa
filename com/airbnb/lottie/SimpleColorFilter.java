package com.airbnb.lottie;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.annotation.ColorInt;

/* renamed from: com.airbnb.lottie.r */
/* loaded from: classes2.dex */
public class SimpleColorFilter extends PorterDuffColorFilter {
    public SimpleColorFilter(@ColorInt int i) {
        super(i, PorterDuff.Mode.SRC_ATOP);
    }
}
