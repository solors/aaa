package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* loaded from: classes3.dex */
public class NiceImageView extends C9105eqN {

    /* renamed from: Fy */
    private RectF f17673Fy;

    /* renamed from: IL */
    private boolean f17674IL;

    /* renamed from: Kg */
    private int f17675Kg;

    /* renamed from: LZ */
    private final RectF f17676LZ;

    /* renamed from: Lq */
    private int f17677Lq;

    /* renamed from: PX */
    private int f17678PX;

    /* renamed from: Ta */
    private int f17679Ta;

    /* renamed from: VB */
    private int f17680VB;
    private final float[] VzQ;

    /* renamed from: WR */
    private int f17681WR;

    /* renamed from: bX */
    private boolean f17682bX;

    /* renamed from: bg */
    private final Context f17683bg;

    /* renamed from: eo */
    private int f17684eo;
    private int eqN;

    /* renamed from: iR */
    private int f17685iR;
    private Path kMt;
    private int ldr;
    private final Path rri;

    /* renamed from: tC */
    private final Paint f17686tC;
    private final float[] tuV;

    /* renamed from: vb */
    private int f17687vb;
    private float xxp;
    private final Xfermode yDt;

    /* renamed from: zx */
    private int f17688zx;

    public NiceImageView(Context context) {
        this(context, null);
    }

    /* renamed from: IL */
    private void m87056IL() {
        if (this.f17674IL) {
            float min = Math.min(this.f17677Lq, this.f17687vb) / 2.0f;
            this.xxp = min;
            RectF rectF = this.f17673Fy;
            int i = this.f17677Lq;
            int i2 = this.f17687vb;
            rectF.set((i / 2.0f) - min, (i2 / 2.0f) - min, (i / 2.0f) + min, (i2 / 2.0f) + min);
            return;
        }
        this.f17673Fy.set(0.0f, 0.0f, this.f17677Lq, this.f17687vb);
        if (this.f17682bX) {
            this.f17673Fy = this.f17676LZ;
        }
    }

    /* renamed from: bX */
    private void m87055bX() {
        if (this.f17674IL) {
            return;
        }
        int i = 0;
        if (this.f17675Kg <= 0) {
            float[] fArr = this.VzQ;
            int i2 = this.f17681WR;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.f17684eo;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.f17678PX;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.f17680VB;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.tuV;
            int i6 = this.eqN;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.VzQ;
            if (i < fArr3.length) {
                int i7 = this.f17675Kg;
                fArr3[i] = i7;
                this.tuV[i] = i7 - (this.eqN / 2.0f);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: bg */
    private void m87052bg(Canvas canvas) {
        if (this.f17674IL) {
            int i = this.eqN;
            if (i > 0) {
                m87051bg(canvas, i, this.f17688zx, this.xxp - (i / 2.0f));
            }
            int i2 = this.ldr;
            if (i2 > 0) {
                m87051bg(canvas, i2, this.f17685iR, (this.xxp - this.eqN) - (i2 / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.eqN;
        if (i3 > 0) {
            m87050bg(canvas, i3, this.f17688zx, this.f17676LZ, this.VzQ);
        }
    }

    private void eqN() {
        if (!this.f17674IL) {
            this.ldr = 0;
        }
    }

    public void isCircle(boolean z) {
        this.f17674IL = z;
        eqN();
        m87056IL();
        invalidate();
    }

    public void isCoverSrc(boolean z) {
        this.f17682bX = z;
        m87056IL();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f17673Fy, null, 31);
        if (!this.f17682bX) {
            int i = this.f17677Lq;
            int i2 = this.eqN;
            int i3 = this.ldr;
            int i4 = this.f17687vb;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.f17686tC.reset();
        this.rri.reset();
        if (this.f17674IL) {
            this.rri.addCircle(this.f17677Lq / 2.0f, this.f17687vb / 2.0f, this.xxp, Path.Direction.CCW);
        } else {
            this.rri.addRoundRect(this.f17673Fy, this.tuV, Path.Direction.CCW);
        }
        this.f17686tC.setAntiAlias(true);
        this.f17686tC.setStyle(Paint.Style.FILL);
        this.f17686tC.setXfermode(this.yDt);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.rri, this.f17686tC);
        } else {
            this.kMt.addRect(this.f17673Fy, Path.Direction.CCW);
            this.kMt.op(this.rri, Path.Op.DIFFERENCE);
            canvas.drawPath(this.kMt, this.f17686tC);
        }
        this.f17686tC.setXfermode(null);
        int i5 = this.f17679Ta;
        if (i5 != 0) {
            this.f17686tC.setColor(i5);
            canvas.drawPath(this.rri, this.f17686tC);
        }
        canvas.restore();
        m87052bg(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f17677Lq = i;
        this.f17687vb = i2;
        m87054bg();
        m87056IL();
    }

    public void setBorderColor(@ColorInt int i) {
        this.f17688zx = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.eqN = ZQc.m82537bX(this.f17683bg, i);
        m87049bg(false);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.f17680VB = ZQc.m82537bX(this.f17683bg, i);
        m87049bg(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.f17678PX = ZQc.m82537bX(this.f17683bg, i);
        m87049bg(true);
    }

    public void setCornerRadius(int i) {
        this.f17675Kg = ZQc.m82537bX(this.f17683bg, i);
        m87049bg(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.f17681WR = ZQc.m82537bX(this.f17683bg, i);
        m87049bg(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.f17684eo = ZQc.m82537bX(this.f17683bg, i);
        m87049bg(true);
    }

    public void setInnerBorderColor(@ColorInt int i) {
        this.f17685iR = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.ldr = ZQc.m82537bX(this.f17683bg, i);
        eqN();
        invalidate();
    }

    public void setMaskColor(@ColorInt int i) {
        this.f17679Ta = i;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17688zx = -1;
        this.f17685iR = -1;
        this.f17683bg = context;
        this.f17675Kg = ZQc.m82537bX(context, 10.0f);
        this.VzQ = new float[8];
        this.tuV = new float[8];
        this.f17676LZ = new RectF();
        this.f17673Fy = new RectF();
        this.f17686tC = new Paint();
        this.rri = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.yDt = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.yDt = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.kMt = new Path();
        }
        m87055bX();
        eqN();
    }

    /* renamed from: bg */
    private void m87051bg(Canvas canvas, int i, int i2, float f) {
        m87053bg(i, i2);
        this.rri.addCircle(this.f17677Lq / 2.0f, this.f17687vb / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.rri, this.f17686tC);
    }

    /* renamed from: bg */
    private void m87050bg(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        m87053bg(i, i2);
        this.rri.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.rri, this.f17686tC);
    }

    /* renamed from: bg */
    private void m87053bg(int i, int i2) {
        this.rri.reset();
        this.f17686tC.setStrokeWidth(i);
        this.f17686tC.setColor(i2);
        this.f17686tC.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: bg */
    private void m87054bg() {
        if (this.f17674IL) {
            return;
        }
        RectF rectF = this.f17676LZ;
        int i = this.eqN;
        rectF.set(i / 2.0f, i / 2.0f, this.f17677Lq - (i / 2.0f), this.f17687vb - (i / 2.0f));
    }

    /* renamed from: bg */
    private void m87049bg(boolean z) {
        if (z) {
            this.f17675Kg = 0;
        }
        m87055bX();
        m87054bg();
        invalidate();
    }
}
