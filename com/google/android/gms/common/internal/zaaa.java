package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.base.C16256R;
import com.google.android.gms.common.util.DeviceProperties;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes4.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return i4;
                }
                throw new IllegalStateException("Unknown color scheme: " + i);
            }
            return i3;
        }
        return i2;
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C16256R.C16258drawable.common_google_signin_btn_icon_dark;
        int i5 = C16256R.C16258drawable.common_google_signin_btn_icon_light;
        int zab = zab(i2, i4, i5, i5);
        int i6 = C16256R.C16258drawable.common_google_signin_btn_text_dark;
        int i7 = C16256R.C16258drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i2, i6, i7, i7);
        if (i != 0 && i != 1) {
            if (i != 2) {
                throw new IllegalStateException("Unknown button size: " + i);
            }
        } else {
            zab = zab2;
        }
        Drawable wrap = DrawableCompat.wrap(resources.getDrawable(zab));
        DrawableCompat.setTintList(wrap, resources.getColorStateList(C16256R.C16257color.common_google_signin_btn_tint));
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(wrap);
        int i8 = C16256R.C16257color.common_google_signin_btn_text_dark;
        int i9 = C16256R.C16257color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i2, i8, i9, i9))));
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    setText((CharSequence) null);
                } else {
                    throw new IllegalStateException("Unknown button size: " + i);
                }
            } else {
                setText(resources.getString(C16256R.C16260string.common_signin_button_text_long));
            }
        } else {
            setText(resources.getString(C16256R.C16260string.common_signin_button_text));
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
