package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C16310R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* loaded from: classes5.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    @NonNull
    public int[] indicatorColors = new int[0];
    public int showAnimationBehavior;
    @ColorInt
    public int trackColor;
    @InterfaceC0152Px
    public int trackCornerRadius;
    @InterfaceC0152Px
    public int trackThickness;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C16310R.dimen.mtrl_progress_track_thickness);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C16310R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, C16310R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, C16310R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.trackThickness / 2);
        this.showAnimationBehavior = obtainStyledAttributes.getInt(C16310R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.hideAnimationBehavior = obtainStyledAttributes.getInt(C16310R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        m71200a(context, obtainStyledAttributes);
        m71199b(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m71200a(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i = C16310R.styleable.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C16310R.attr.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.indicatorColors = intArray;
            if (intArray.length != 0) {
                return;
            }
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* renamed from: b */
    private void m71199b(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i = C16310R.styleable.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            this.trackColor = typedArray.getColor(i, -1);
            return;
        }
        this.trackColor = this.indicatorColors[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo71127c();

    public boolean isHideAnimationEnabled() {
        if (this.hideAnimationBehavior != 0) {
            return true;
        }
        return false;
    }

    public boolean isShowAnimationEnabled() {
        if (this.showAnimationBehavior != 0) {
            return true;
        }
        return false;
    }
}
