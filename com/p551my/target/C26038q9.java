package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.q9 */
/* loaded from: classes7.dex */
public class C26038q9 extends ImageView {
    @Nullable
    private Bitmap bitmap;
    @Nullable
    private Drawable drawable;
    private int maxHeight;
    private int maxWidth;
    private int placeholderHeight;
    private int placeholderWidth;

    public C26038q9(Context context) {
        super(context);
        m43112a();
    }

    /* renamed from: a */
    public final void m43112a() {
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
    }

    public boolean hasImage() {
        if (this.bitmap == null && this.drawable == null) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.placeholderHeight;
        if (i3 == 0 || (intrinsicWidth = this.placeholderWidth) == 0) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                intrinsicWidth = bitmap.getWidth();
                i3 = this.bitmap.getHeight();
            } else {
                Drawable drawable = this.drawable;
                if (drawable != null) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    i3 = this.drawable.getIntrinsicHeight();
                } else {
                    setMeasuredDimension(0, 0);
                    return;
                }
            }
        }
        if (intrinsicWidth > 0 && i3 > 0) {
            float f = intrinsicWidth;
            float f2 = i3;
            float f3 = f / f2;
            int i4 = this.maxHeight;
            if (i4 > 0) {
                size2 = Math.min(i4, size2);
            }
            int i5 = this.maxWidth;
            if (i5 > 0) {
                size = Math.min(i5, size);
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                setMeasuredDimension(size, size2);
                return;
            }
            if (mode != 0 || mode2 != 0) {
                if (mode == 0) {
                    intrinsicWidth = (int) (size2 * f3);
                } else {
                    if (mode2 == 0) {
                        i3 = (int) (size / f3);
                    } else {
                        float f4 = size;
                        float f5 = f4 / f;
                        float f6 = size2;
                        if (Math.min(f5, f6 / f2) == f5 && f3 > 0.0f) {
                            i3 = (int) (f4 / f3);
                        } else {
                            intrinsicWidth = (int) (f6 * f3);
                        }
                    }
                    intrinsicWidth = size;
                }
                i3 = size2;
            }
            setMeasuredDimension(intrinsicWidth, i3);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
        super.setImageBitmap(bitmap);
    }

    public void setImageData(@Nullable ImageData imageData) {
        Bitmap bitmap;
        if (imageData == null) {
            this.placeholderHeight = 0;
            this.placeholderWidth = 0;
            bitmap = null;
        } else {
            this.placeholderHeight = imageData.getHeight();
            this.placeholderWidth = imageData.getWidth();
            bitmap = imageData.getBitmap();
        }
        setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.drawable = drawable;
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setPlaceholderDimensions(int i, int i2) {
        this.placeholderWidth = i;
        this.placeholderHeight = i2;
    }

    public C26038q9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43112a();
    }

    public void setImageBitmap(@Nullable Bitmap bitmap, boolean z) {
        if (!z) {
            setImageBitmap(bitmap);
            return;
        }
        setAlpha(0.0f);
        setImageBitmap(bitmap);
        animate().alpha(1.0f).setDuration(300L);
    }
}
