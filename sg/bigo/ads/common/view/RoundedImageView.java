package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.view.p939b.C43883b;
import sg.bigo.ads.common.view.p939b.InterfaceC43882a;

/* loaded from: classes10.dex */
public class RoundedImageView extends ImageView implements InterfaceC43882a {

    /* renamed from: a */
    private float f114789a;

    /* renamed from: b */
    private float f114790b;

    /* renamed from: c */
    private float f114791c;

    /* renamed from: d */
    private float f114792d;

    /* renamed from: e */
    private float f114793e;

    /* renamed from: f */
    private int f114794f;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m4752a() {
        if (getOutlineProvider() instanceof C43883b) {
            return;
        }
        super.setOutlineProvider(new C43883b());
    }

    private RectF getImageRectF() {
        float f;
        float f2;
        float f3;
        float max;
        float f4;
        float f5;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = getDrawable();
        float f6 = 0.0f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float[] fArr = new float[9];
            Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null && !imageMatrix.isIdentity()) {
                imageMatrix.getValues(fArr);
            }
            float f7 = fArr[2];
            float f8 = fArr[5];
            float f9 = fArr[0];
            float f10 = fArr[4];
            if (Float.isNaN(f7)) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, f7);
            }
            if (Float.isNaN(f8)) {
                f3 = 0.0f;
            } else {
                f3 = Math.max(0.0f, f8);
            }
            if (!Float.isNaN(f9) && f9 > 0.0f) {
                f4 = intrinsicWidth * f9;
            } else {
                f4 = intrinsicWidth;
            }
            f = Math.min(f4 + max, measuredWidth);
            if (!Float.isNaN(f10) && f10 > 0.0f) {
                f5 = intrinsicHeight * f10;
            } else {
                f5 = intrinsicHeight;
            }
            f2 = Math.min(f5 + f3, measuredHeight);
            f6 = max;
        } else {
            f = measuredWidth;
            f2 = measuredHeight;
            f3 = 0.0f;
        }
        return new RectF(f6, f3, f, f2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Path clipPath = getClipPath();
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        super.draw(canvas);
        RectF imageRectF = getImageRectF();
        if (this.f114793e > 0.0f && !imageRectF.isEmpty()) {
            Paint paint = new Paint();
            paint.setColor(this.f114794f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f114793e);
            paint.setAntiAlias(true);
            float f = this.f114789a;
            canvas.drawRoundRect(imageRectF, f, f, paint);
        }
        canvas.restoreToCount(save);
    }

    @Override // sg.bigo.ads.common.view.p939b.InterfaceC43882a
    public Path getClipPath() {
        float f;
        float f2;
        float f3;
        RectF imageRectF = getImageRectF();
        if (!Float.isNaN(this.f114789a) && !Float.isNaN(this.f114790b) && !Float.isNaN(this.f114792d) && !Float.isNaN(this.f114791c) && imageRectF != null && !imageRectF.isEmpty()) {
            Path path = new Path();
            float[] fArr = new float[8];
            float f4 = 0.0f;
            if (Float.isNaN(this.f114789a)) {
                f = 0.0f;
            } else {
                f = this.f114789a;
            }
            fArr[0] = f;
            fArr[1] = f;
            if (Float.isNaN(this.f114790b)) {
                f2 = 0.0f;
            } else {
                f2 = this.f114790b;
            }
            fArr[2] = f2;
            fArr[3] = f2;
            if (Float.isNaN(this.f114792d)) {
                f3 = 0.0f;
            } else {
                f3 = this.f114792d;
            }
            fArr[4] = f3;
            fArr[5] = f3;
            if (!Float.isNaN(this.f114791c)) {
                f4 = this.f114791c;
            }
            fArr[6] = f4;
            fArr[7] = f4;
            path.addRoundRect(imageRectF, fArr, Path.Direction.CW);
            return path;
        }
        return null;
    }

    public void setCornerRadius(float f) {
        this.f114789a = f;
        this.f114790b = f;
        this.f114791c = f;
        this.f114792d = f;
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m4752a();
    }

    public void setStrokeColor(@ColorInt int i) {
        this.f114794f = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f114793e = f;
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        m4752a();
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114789a = Float.NaN;
        this.f114790b = Float.NaN;
        this.f114791c = Float.NaN;
        this.f114792d = Float.NaN;
        this.f114794f = -1;
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }
}
