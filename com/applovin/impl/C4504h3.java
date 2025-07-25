package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.applovin.impl.h3 */
/* loaded from: classes2.dex */
public class C4504h3 extends View {

    /* renamed from: x */
    private static final int f6531x = Color.rgb(66, 145, 241);

    /* renamed from: y */
    private static final int f6532y = Color.rgb(66, 145, 241);

    /* renamed from: z */
    private static final int f6533z = Color.rgb(66, 145, 241);

    /* renamed from: a */
    private Paint f6534a;

    /* renamed from: b */
    private Paint f6535b;

    /* renamed from: c */
    protected Paint f6536c;

    /* renamed from: d */
    protected Paint f6537d;

    /* renamed from: f */
    private RectF f6538f;

    /* renamed from: g */
    private float f6539g;

    /* renamed from: h */
    private int f6540h;

    /* renamed from: i */
    private int f6541i;

    /* renamed from: j */
    private int f6542j;

    /* renamed from: k */
    private int f6543k;

    /* renamed from: l */
    private int f6544l;

    /* renamed from: m */
    private float f6545m;

    /* renamed from: n */
    private int f6546n;

    /* renamed from: o */
    private String f6547o;

    /* renamed from: p */
    private String f6548p;

    /* renamed from: q */
    private float f6549q;

    /* renamed from: r */
    private String f6550r;

    /* renamed from: s */
    private float f6551s;

    /* renamed from: t */
    private final float f6552t;

    /* renamed from: u */
    private final float f6553u;

    /* renamed from: v */
    private final float f6554v;

    /* renamed from: w */
    private final int f6555w;

    /* renamed from: com.applovin.impl.h3$a */
    /* loaded from: classes2.dex */
    private static class C4505a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static float m98807c(Resources resources, float f) {
            return (f * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static float m98806d(Resources resources, float f) {
            return f * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public C4504h3(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f6543k) * 360.0f;
    }

    /* renamed from: a */
    protected void m98812a() {
        this.f6544l = f6531x;
        this.f6540h = f6532y;
        this.f6539g = this.f6553u;
        setMax(100);
        setProgress(0);
        this.f6545m = this.f6552t;
        this.f6546n = 0;
        this.f6549q = this.f6554v;
        this.f6541i = f6533z;
    }

    /* renamed from: b */
    protected void m98810b() {
        TextPaint textPaint = new TextPaint();
        this.f6536c = textPaint;
        textPaint.setColor(this.f6540h);
        this.f6536c.setTextSize(this.f6539g);
        this.f6536c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f6537d = textPaint2;
        textPaint2.setColor(this.f6541i);
        this.f6537d.setTextSize(this.f6549q);
        this.f6537d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f6534a = paint;
        paint.setColor(this.f6544l);
        this.f6534a.setStyle(Paint.Style.STROKE);
        this.f6534a.setAntiAlias(true);
        this.f6534a.setStrokeWidth(this.f6545m);
        Paint paint2 = new Paint();
        this.f6535b = paint2;
        paint2.setColor(this.f6546n);
        this.f6535b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f6544l;
    }

    public float getFinishedStrokeWidth() {
        return this.f6545m;
    }

    public int getInnerBackgroundColor() {
        return this.f6546n;
    }

    public String getInnerBottomText() {
        return this.f6550r;
    }

    public int getInnerBottomTextColor() {
        return this.f6541i;
    }

    public float getInnerBottomTextSize() {
        return this.f6549q;
    }

    public int getMax() {
        return this.f6543k;
    }

    public String getPrefixText() {
        return this.f6547o;
    }

    public int getProgress() {
        return this.f6542j;
    }

    public String getSuffixText() {
        return this.f6548p;
    }

    public int getTextColor() {
        return this.f6540h;
    }

    public float getTextSize() {
        return this.f6539g;
    }

    @Override // android.view.View
    public void invalidate() {
        m98810b();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f6545m;
        this.f6538f.set(f, f, getWidth() - f, getHeight() - f);
        float f2 = this.f6545m;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() - f2) + f2) / 2.0f, this.f6535b);
        canvas.drawArc(this.f6538f, 270.0f, -getProgressAngle(), false, this.f6534a);
        String str = this.f6547o + this.f6542j + this.f6548p;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f6536c.measureText(str)) / 2.0f, (getWidth() - (this.f6536c.descent() + this.f6536c.ascent())) / 2.0f, this.f6536c);
        }
        if (!TextUtils.isEmpty(getInnerBottomText())) {
            this.f6537d.setTextSize(this.f6549q);
            canvas.drawText(getInnerBottomText(), (getWidth() - this.f6537d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f6551s) - ((this.f6536c.descent() + this.f6536c.ascent()) / 2.0f), this.f6537d);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m98811a(i), m98811a(i2));
        this.f6551s = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f6540h = bundle.getInt("text_color");
            this.f6539g = bundle.getFloat("text_size");
            this.f6549q = bundle.getFloat("inner_bottom_text_size");
            this.f6550r = bundle.getString("inner_bottom_text");
            this.f6541i = bundle.getInt("inner_bottom_text_color");
            this.f6544l = bundle.getInt("finished_stroke_color");
            this.f6545m = bundle.getFloat("finished_stroke_width");
            this.f6546n = bundle.getInt("inner_background_color");
            m98810b();
            setMax(bundle.getInt("max"));
            setProgress(bundle.getInt("progress"));
            this.f6547o = bundle.getString("prefix");
            this.f6548p = bundle.getString("suffix");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i) {
        this.f6544l = i;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f) {
        this.f6545m = f;
        invalidate();
    }

    public void setInnerBackgroundColor(int i) {
        this.f6546n = i;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f6550r = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i) {
        this.f6541i = i;
        invalidate();
    }

    public void setInnerBottomTextSize(float f) {
        this.f6549q = f;
        invalidate();
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f6543k = i;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f6547o = str;
        invalidate();
    }

    public void setProgress(int i) {
        this.f6542j = i;
        if (i > getMax()) {
            this.f6542j %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f6548p = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f6540h = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f6539g = f;
        invalidate();
    }

    public C4504h3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4504h3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6538f = new RectF();
        this.f6542j = 0;
        this.f6547o = "";
        this.f6548p = "";
        this.f6550r = "";
        this.f6553u = C4505a.m98806d(getResources(), 14.0f);
        this.f6555w = (int) C4505a.m98807c(getResources(), 100.0f);
        this.f6552t = C4505a.m98807c(getResources(), 4.0f);
        this.f6554v = C4505a.m98806d(getResources(), 18.0f);
        m98812a();
        m98810b();
    }

    /* renamed from: a */
    private int m98811a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.f6555w;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }
}
