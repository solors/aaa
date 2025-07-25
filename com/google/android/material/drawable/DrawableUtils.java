package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class DrawableUtils {
    private DrawableUtils() {
    }

    @Nullable
    /* renamed from: a */
    private static Drawable m71478a(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (mode != null) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        int intrinsicHeight;
        int i;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() != -1 && drawable2.getIntrinsicHeight() != -1) {
            if (drawable2.getIntrinsicWidth() <= drawable.getIntrinsicWidth() && drawable2.getIntrinsicHeight() <= drawable.getIntrinsicHeight()) {
                i = drawable2.getIntrinsicWidth();
                intrinsicHeight = drawable2.getIntrinsicHeight();
            } else {
                float intrinsicWidth = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
                if (intrinsicWidth >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                    i = drawable.getIntrinsicWidth();
                    intrinsicHeight = (int) (i / intrinsicWidth);
                } else {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                    i = (int) (intrinsicWidth * intrinsicHeight);
                }
            }
        } else {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
            i = intrinsicWidth2;
        }
        layerDrawable.setLayerSize(1, i, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @Nullable
    public static Drawable createTintableDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return m71478a(drawable, colorStateList, mode, false);
    }

    @Nullable
    public static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return m71478a(drawable, colorStateList, mode, false);
    }

    @NonNull
    public static int[] getCheckedState(@NonNull int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    @NonNull
    public static int[] getUncheckedState(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    @NonNull
    public static AttributeSet parseDrawableXml(@NonNull Context context, @XmlRes int i, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(@Nullable RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DrawableCompat.setTint(drawable, i);
        } else {
            DrawableCompat.setTintList(drawable, null);
        }
    }

    @Nullable
    public static PorterDuffColorFilter updateTintFilter(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }
}
