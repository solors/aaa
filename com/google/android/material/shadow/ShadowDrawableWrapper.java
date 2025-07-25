package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.content.ContextCompat;
import com.google.android.material.C16310R;

@Deprecated
/* loaded from: classes5.dex */
public class ShadowDrawableWrapper extends DrawableWrapper {

    /* renamed from: s */
    static final double f38121s = Math.cos(Math.toRadians(45.0d));
    @NonNull

    /* renamed from: b */
    final Paint f38122b;
    @NonNull

    /* renamed from: c */
    final Paint f38123c;
    @NonNull

    /* renamed from: d */
    final RectF f38124d;

    /* renamed from: f */
    float f38125f;

    /* renamed from: g */
    Path f38126g;

    /* renamed from: h */
    float f38127h;

    /* renamed from: i */
    float f38128i;

    /* renamed from: j */
    float f38129j;

    /* renamed from: k */
    float f38130k;

    /* renamed from: l */
    private boolean f38131l;

    /* renamed from: m */
    private final int f38132m;

    /* renamed from: n */
    private final int f38133n;

    /* renamed from: o */
    private final int f38134o;

    /* renamed from: p */
    private boolean f38135p;

    /* renamed from: q */
    private float f38136q;

    /* renamed from: r */
    private boolean f38137r;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f38131l = true;
        this.f38135p = true;
        this.f38137r = false;
        this.f38132m = ContextCompat.getColor(context, C16310R.C16311color.design_fab_shadow_start_color);
        this.f38133n = ContextCompat.getColor(context, C16310R.C16311color.design_fab_shadow_mid_color);
        this.f38134o = ContextCompat.getColor(context, C16310R.C16311color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f38122b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f38125f = Math.round(f);
        this.f38124d = new RectF();
        Paint paint2 = new Paint(paint);
        this.f38123c = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    /* renamed from: a */
    private void m71113a(@NonNull Rect rect) {
        float f = this.f38128i;
        float f2 = 1.5f * f;
        this.f38124d.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f38124d;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m71112b();
    }

    /* renamed from: b */
    private void m71112b() {
        float f = this.f38125f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f38129j;
        rectF2.inset(-f2, -f2);
        Path path = this.f38126g;
        if (path == null) {
            this.f38126g = new Path();
        } else {
            path.reset();
        }
        this.f38126g.setFillType(Path.FillType.EVEN_ODD);
        this.f38126g.moveTo(-this.f38125f, 0.0f);
        this.f38126g.rLineTo(-this.f38129j, 0.0f);
        this.f38126g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f38126g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f38126g.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f38125f / f3;
            this.f38122b.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f38132m, this.f38133n, this.f38134o}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f38123c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f38132m, this.f38133n, this.f38134o}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f38123c.setAntiAlias(false);
    }

    /* renamed from: c */
    private void m71111c(@NonNull Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        int save = canvas.save();
        canvas.rotate(this.f38136q, this.f38124d.centerX(), this.f38124d.centerY());
        float f5 = this.f38125f;
        float f6 = (-f5) - this.f38129j;
        float f7 = f5 * 2.0f;
        if (this.f38124d.width() - f7 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f38124d.height() - f7 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f8 = this.f38130k;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f38124d;
        canvas.translate(rectF.left + f5, rectF.top + f5);
        canvas.scale(f9, f10);
        canvas.drawPath(this.f38126g, this.f38122b);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f38124d.width() - f7, -this.f38125f, this.f38123c);
        } else {
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
        }
        canvas.restoreToCount(i);
        int save3 = canvas.save();
        RectF rectF2 = this.f38124d;
        canvas.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas.scale(f9, f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f38126g, this.f38122b);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f38124d.width() - f7, (-this.f38125f) + this.f38129j, this.f38123c);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f38124d;
        canvas.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas.scale(f9, f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f38126g, this.f38122b);
        if (z2) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f38124d.height() - f7, -this.f38125f, this.f38123c);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f38124d;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas.scale(f9, f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f38126g, this.f38122b);
        if (z2) {
            canvas.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f38124d.height() - f7, -this.f38125f, this.f38123c);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i2);
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - f38121s) * f2));
        }
        return f;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - f38121s) * f2));
        }
        return f * 1.5f;
    }

    /* renamed from: d */
    private static int m71110d(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f38131l) {
            m71113a(getBounds());
            this.f38131l = false;
        }
        m71111c(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.f38125f;
    }

    public float getMaxShadowSize() {
        return this.f38128i;
    }

    public float getMinHeight() {
        float f = this.f38128i;
        return (Math.max(f, this.f38125f + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.f38128i * 1.5f * 2.0f);
    }

    public float getMinWidth() {
        float f = this.f38128i;
        return (Math.max(f, this.f38125f + (f / 2.0f)) * 2.0f) + (this.f38128i * 2.0f);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.f38128i, this.f38125f, this.f38135p));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.f38128i, this.f38125f, this.f38135p));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.f38130k;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f38131l = true;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.f38135p = z;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f38122b.setAlpha(i);
        this.f38123c.setAlpha(i);
    }

    public void setCornerRadius(float f) {
        float round = Math.round(f);
        if (this.f38125f == round) {
            return;
        }
        this.f38125f = round;
        this.f38131l = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.f38130k, f);
    }

    public final void setRotation(float f) {
        if (this.f38136q != f) {
            this.f38136q = f;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            float m71110d = m71110d(f);
            float m71110d2 = m71110d(f2);
            if (m71110d > m71110d2) {
                if (!this.f38137r) {
                    this.f38137r = true;
                }
                m71110d = m71110d2;
            }
            if (this.f38130k == m71110d && this.f38128i == m71110d2) {
                return;
            }
            this.f38130k = m71110d;
            this.f38128i = m71110d2;
            this.f38129j = Math.round(m71110d * 1.5f);
            this.f38127h = m71110d2;
            this.f38131l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.f38128i);
    }
}
