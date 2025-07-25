package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.VzQ */
/* loaded from: classes3.dex */
public class C9057VzQ extends C9105eqN {

    /* renamed from: IL */
    private int f20193IL;

    /* renamed from: bX */
    private int f20194bX;

    /* renamed from: bg */
    private final Paint f20195bg;
    private final Matrix eqN;
    private BitmapShader ldr;

    /* renamed from: zx */
    private final RectF f20196zx;

    public C9057VzQ(Context context) {
        this(context, null);
    }

    /* renamed from: bg */
    private Bitmap m83682bg(Drawable drawable) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicWidth() <= 0) {
            intrinsicWidth = getWidth();
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() <= 0) {
            intrinsicHeight = getHeight();
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap m83682bg;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.ldr == null && (m83682bg = m83682bg(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.ldr = new BitmapShader(m83682bg, tileMode, tileMode);
            float f = 1.0f;
            if (m83682bg.getWidth() != getWidth() || m83682bg.getHeight() != getHeight()) {
                f = Math.max((getWidth() * 1.0f) / m83682bg.getWidth(), (getHeight() * 1.0f) / m83682bg.getHeight());
            }
            this.eqN.setScale(f, f);
            this.ldr.setLocalMatrix(this.eqN);
        }
        BitmapShader bitmapShader = this.ldr;
        if (bitmapShader != null) {
            this.f20195bg.setShader(bitmapShader);
            canvas.drawRoundRect(this.f20196zx, this.f20193IL, this.f20194bX, this.f20195bg);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20196zx.set(0.0f, 0.0f, i, i2);
    }

    public void setXRound(int i) {
        this.f20193IL = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.f20194bX = i;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.ldr = null;
    }

    public C9057VzQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9057VzQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20193IL = 25;
        this.f20194bX = 25;
        this.f20196zx = new RectF();
        Paint paint = new Paint();
        this.f20195bg = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.eqN = new Matrix();
    }
}
