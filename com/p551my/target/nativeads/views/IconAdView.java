package com.p551my.target.nativeads.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C25869ka;
import com.p551my.target.C26038q9;

/* renamed from: com.my.target.nativeads.views.IconAdView */
/* loaded from: classes7.dex */
public class IconAdView extends FrameLayout {
    @NonNull
    private final C26038q9 imageView;
    private int placeholderHeight;
    private int placeholderWidth;

    public IconAdView(@NonNull Context context) {
        this(context, null);
    }

    private void measureBasedOnIconImage(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        if (size == 0 && size2 == 0) {
            setMeasuredDimension(0, 0);
        }
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int measuredWidth = this.imageView.getMeasuredWidth();
        int measuredHeight = this.imageView.getMeasuredHeight();
        if (mode2 != 1073741824) {
            size2 = measuredHeight;
        }
        if (mode != 1073741824) {
            size = measuredWidth;
        }
        if (childCount > 1) {
            for (int i3 = 1; i3 < childCount; i3++) {
                getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"WrongCall"})
    private void measureBasedOnRatio(int i, int i2, float f) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (mode == 0) {
            size = (int) (size2 * f);
        } else if (mode2 == 0 || mode2 != 1073741824) {
            size2 = (int) (size / f);
        }
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i5 = Integer.MIN_VALUE;
                if (layoutParams != null) {
                    if (layoutParams.width == -1) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (layoutParams.height == -1) {
                        i5 = 1073741824;
                    }
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i3), View.MeasureSpec.makeMeasureSpec(size2, i5));
                if (childAt.getMeasuredHeight() > 0) {
                    z = true;
                }
            }
        }
        if (z) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @NonNull
    public ImageView getImageView() {
        return this.imageView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i6 = ((i3 - i) - measuredWidth) / 2;
                    int i7 = ((i4 - i2) - measuredHeight) / 2;
                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.placeholderWidth;
        if (i4 != 0 && (i3 = this.placeholderHeight) != 0) {
            measureBasedOnRatio(i, i2, i4 / i3);
        } else {
            measureBasedOnIconImage(i, i2);
        }
    }

    public void setPlaceHolderDimension(int i, int i2) {
        this.placeholderWidth = i;
        this.placeholderHeight = i2;
        this.imageView.setPlaceholderDimensions(i, i2);
    }

    public IconAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C26038q9 c26038q9 = new C26038q9(context);
        this.imageView = c26038q9;
        C25869ka.m43594b(c26038q9, "nativeads_icon");
        addView(c26038q9);
    }
}
