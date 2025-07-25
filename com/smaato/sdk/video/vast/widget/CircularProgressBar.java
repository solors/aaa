package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.smaato.sdk.video.C27640R;

/* loaded from: classes7.dex */
public class CircularProgressBar extends View {
    private int backgroundColor;
    @NonNull
    private final Paint backgroundOuterPaint;
    @NonNull
    private final Paint backgroundPaint;
    private float backgroundStrokeWidth;
    private int color;
    @Nullable
    private String label;
    @NonNull
    private final Paint labelPaint;
    private float labelSize;
    private float progress;
    private float progressMax;
    @NonNull
    private final RectF rectF;
    private float strokeWidth;
    @NonNull
    private final Rect textRect;

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.rectF = new RectF();
        this.textRect = new Rect();
        this.backgroundOuterPaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        this.labelPaint = new Paint(1);
        this.progress = 0.0f;
        this.progressMax = 100.0f;
        this.strokeWidth = getResources().getDimension(C27640R.dimen.smaato_sdk_video_default_background_stroke_width);
        this.backgroundStrokeWidth = getResources().getDimension(C27640R.dimen.smaato_sdk_video_default_stroke_width);
        this.color = ViewCompat.MEASURED_STATE_MASK;
        this.backgroundColor = -7829368;
        this.labelSize = 48.0f;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C27640R.styleable.smaato_sdk_video_circular_progress_bar, 0, 0);
        try {
            this.strokeWidth = obtainStyledAttributes.getDimension(C27640R.styleable.f72408x5b5543a1, this.strokeWidth);
            this.backgroundStrokeWidth = obtainStyledAttributes.getDimension(C27640R.styleable.f72405x564d8d28, this.backgroundStrokeWidth);
            this.color = obtainStyledAttributes.getInt(C27640R.styleable.f72407x5a3e453e, this.color);
            this.backgroundColor = obtainStyledAttributes.getInt(C27640R.styleable.f72404x55368ec5, this.backgroundColor);
            this.labelSize = obtainStyledAttributes.getDimension(C27640R.styleable.f72406xbc78c3fa, this.labelSize);
            obtainStyledAttributes.recycle();
            this.backgroundOuterPaint.setColor(this.backgroundColor);
            this.backgroundOuterPaint.setStyle(Paint.Style.STROKE);
            this.backgroundOuterPaint.setStrokeWidth(this.backgroundStrokeWidth);
            this.backgroundPaint.setColor(this.color);
            this.backgroundPaint.setStyle(Paint.Style.FILL);
            this.labelPaint.setColor(this.backgroundColor);
            this.labelPaint.setTextSize(this.labelSize);
            this.labelPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void reDraw() {
        requestLayout();
        invalidate();
    }

    public float getProgress() {
        return this.progress;
    }

    public float getProgressMax() {
        return this.progressMax;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.rectF, this.backgroundPaint);
        String str = this.label;
        float width = this.rectF.width() / 2.0f;
        float height = this.rectF.height() / 2.0f;
        if (!TextUtils.isEmpty(str)) {
            if (str != null) {
                this.labelPaint.getTextBounds(str, 0, str.length(), this.textRect);
            }
            canvas.drawText(str, width - (this.textRect.width() / 2.0f), height + (this.textRect.height() / 2.0f), this.labelPaint);
        }
        canvas.drawArc(this.rectF, 270.0f, ((100.0f - ((this.progress / this.progressMax) * 100.0f)) * (-360.0f)) / 100.0f, false, this.backgroundOuterPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
        float max = Math.max(this.strokeWidth, this.backgroundStrokeWidth) / 2.0f;
        float f = min - max;
        this.rectF.set(max, max, f, f);
    }

    @MainThread
    public void setProgress(float f, float f2, @NonNull String str) {
        boolean z;
        boolean z2;
        if (f2 < 0.0f) {
            f2 = 100.0f;
        }
        boolean z3 = false;
        if (Math.abs(this.progressMax - f2) > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.progressMax = f2;
        }
        float min = Math.min(f, this.progressMax);
        if (Math.abs(this.progress - min) > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.progress = min;
        }
        boolean z4 = !TextUtils.equals(this.label, str);
        if (z4) {
            this.label = str;
        }
        if (z2 || z || z4) {
            z3 = true;
        }
        if (z3) {
            reDraw();
        }
    }
}
