package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.C16310R;

/* loaded from: classes5.dex */
public class MaterialThemeOverlay {

    /* renamed from: a */
    private static final int[] f38712a = {16842752, C16310R.attr.theme};

    /* renamed from: b */
    private static final int[] f38713b = {C16310R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @StyleRes
    /* renamed from: a */
    private static int m70441a(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f38712a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    @StyleRes
    /* renamed from: b */
    private static int m70440b(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f38713b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        boolean z;
        int m70440b = m70440b(context, attributeSet, i, i2);
        if ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == m70440b) {
            z = true;
        } else {
            z = false;
        }
        if (m70440b != 0 && !z) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m70440b);
            int m70441a = m70441a(context, attributeSet);
            if (m70441a != 0) {
                contextThemeWrapper.getTheme().applyStyle(m70441a, true);
            }
            return contextThemeWrapper;
        }
        return context;
    }
}
