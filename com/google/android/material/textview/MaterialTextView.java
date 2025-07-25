package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C16310R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes5.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m70447a(@NonNull Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C16310R.styleable.MaterialTextAppearance);
        int m70443e = m70443e(getContext(), obtainStyledAttributes, C16310R.styleable.MaterialTextAppearance_android_lineHeight, C16310R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m70443e >= 0) {
            setLineHeight(m70443e);
        }
    }

    /* renamed from: b */
    private static boolean m70446b(Context context) {
        return MaterialAttributes.resolveBoolean(context, C16310R.attr.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: c */
    private static int m70445c(@NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C16310R.styleable.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    private void m70444d(@Nullable AttributeSet attributeSet, int i, int i2) {
        int m70445c;
        Context context = getContext();
        if (m70446b(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m70442f(context, theme, attributeSet, i, i2) && (m70445c = m70445c(theme, attributeSet, i, i2)) != -1) {
                m70447a(theme, m70445c);
            }
        }
    }

    /* renamed from: e */
    private static int m70443e(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull @StyleableRes int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: f */
    private static boolean m70442f(@NonNull Context context, @NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C16310R.styleable.MaterialTextView, i, i2);
        int m70443e = m70443e(context, obtainStyledAttributes, C16310R.styleable.MaterialTextView_android_lineHeight, C16310R.styleable.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (m70443e == -1) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (m70446b(context)) {
            m70447a(context.getTheme(), i);
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        m70444d(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        m70444d(attributeSet, i, i2);
    }
}
