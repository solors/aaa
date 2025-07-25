package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.i */
/* loaded from: classes7.dex */
public class C25809i extends C26038q9 {
    public static final int DEFAULT_HEIGHT = 20;
    private int fixedHeight;

    public C25809i(Context context) {
        this(context, null);
    }

    @Override // com.p551my.target.C26038q9, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.fixedHeight >= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setFixedHeight(int i) {
        this.fixedHeight = i;
    }

    @Override // com.p551my.target.C26038q9, android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        int i;
        int i2;
        float f;
        int i3 = this.fixedHeight;
        int i4 = 0;
        if (i3 >= 0) {
            i = (i3 - getPaddingTop()) - getPaddingBottom();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (bitmap != null) {
                i2 = bitmap.getWidth();
                i4 = bitmap.getHeight();
            } else {
                i2 = 0;
            }
            if (i4 > 0) {
                f = i2 / i4;
            } else {
                f = 0.0f;
            }
            setMeasuredDimension(((int) (i * f)) + getPaddingLeft() + getPaddingRight(), this.fixedHeight);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // com.p551my.target.C26038q9, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        int i;
        int i2;
        float f;
        int i3 = this.fixedHeight;
        int i4 = 0;
        if (i3 >= 0) {
            i = (i3 - getPaddingTop()) - getPaddingBottom();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (drawable != null) {
                i2 = drawable.getIntrinsicWidth();
                i4 = drawable.getIntrinsicHeight();
            } else {
                i2 = 0;
            }
            if (i4 > 0) {
                f = i2 / i4;
            } else {
                f = 0.0f;
            }
            setMeasuredDimension(((int) (i * f)) + getPaddingLeft() + getPaddingRight(), this.fixedHeight);
        }
        super.setImageDrawable(drawable);
    }

    public C25809i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C25809i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedHeight = -1;
        this.fixedHeight = C25869ka.m43610a(20, context);
    }
}
