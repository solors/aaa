package com.bytedance.sdk.component.adexpress.ldr;

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
import android.widget.ImageView;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.Ja */
/* loaded from: classes3.dex */
public class C7508Ja extends ImageView {

    /* renamed from: IL */
    private int f16309IL;

    /* renamed from: bX */
    private int f16310bX;

    /* renamed from: bg */
    private Paint f16311bg;
    private Matrix eqN;

    public C7508Ja(Context context) {
        this(context, null);
    }

    /* renamed from: bg */
    private Bitmap m88643bg(Drawable drawable) {
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
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap m88643bg = m88643bg(drawable);
            if (m88643bg != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(m88643bg, tileMode, tileMode);
                float f = 1.0f;
                if (m88643bg.getWidth() != getWidth() || m88643bg.getHeight() != getHeight()) {
                    f = Math.max((getWidth() * 1.0f) / m88643bg.getWidth(), (getHeight() * 1.0f) / m88643bg.getHeight());
                }
                this.eqN.setScale(f, f);
                bitmapShader.setLocalMatrix(this.eqN);
                this.f16311bg.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f16309IL, this.f16310bX, this.f16311bg);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setXRound(int i) {
        this.f16309IL = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.f16310bX = i;
        postInvalidate();
    }

    public C7508Ja(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7508Ja(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16309IL = 25;
        this.f16310bX = 25;
        Paint paint = new Paint();
        this.f16311bg = paint;
        paint.setAntiAlias(true);
        this.f16311bg.setFilterBitmap(true);
        this.eqN = new Matrix();
    }
}
