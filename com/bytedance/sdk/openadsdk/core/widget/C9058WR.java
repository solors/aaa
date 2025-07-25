package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.WR */
/* loaded from: classes3.dex */
public class C9058WR extends View {

    /* renamed from: bg */
    private static final int[] f20197bg = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};

    /* renamed from: IL */
    private final RectF f20198IL;

    /* renamed from: Kg */
    private int f20199Kg;

    /* renamed from: WR */
    private int f20200WR;

    /* renamed from: bX */
    private final RectF f20201bX;
    private final ArrayList<C9059bg> eqN;

    /* renamed from: iR */
    private int f20202iR;
    private final Paint ldr;

    /* renamed from: zx */
    private final Paint f20203zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.WR$bg */
    /* loaded from: classes3.dex */
    private static final class C9059bg {

        /* renamed from: IL */
        public float f20204IL;

        /* renamed from: bX */
        float f20205bX;

        /* renamed from: bg */
        public Paint f20206bg;
        float eqN;

        public C9059bg(Paint paint, float f, float f2, float f3) {
            this.f20206bg = paint;
            this.f20204IL = f;
            this.f20205bX = f2;
            this.eqN = f3;
        }
    }

    public C9058WR(Context context) {
        super(context);
        this.f20198IL = new RectF();
        this.f20201bX = new RectF();
        this.eqN = new ArrayList<>();
        this.ldr = new Paint();
        Paint paint = new Paint();
        this.f20203zx = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    /* renamed from: bg */
    private void m83681bg() {
        if (this.f20202iR <= 0) {
            return;
        }
        int width = (int) (((this.f20199Kg * 1.0f) / 100.0f) * getWidth());
        this.f20201bX.right = Math.max(this.f20200WR, width);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f20198IL;
        int i = this.f20202iR;
        canvas.drawRoundRect(rectF, i, i, this.f20203zx);
        RectF rectF2 = this.f20201bX;
        int i2 = this.f20202iR;
        canvas.drawRoundRect(rectF2, i2, i2, this.ldr);
        int save = canvas.save();
        canvas.translate(this.f20201bX.right - this.f20200WR, 0.0f);
        Iterator<C9059bg> it = this.eqN.iterator();
        while (it.hasNext()) {
            C9059bg next = it.next();
            canvas.drawCircle(next.f20205bX, next.eqN, next.f20204IL, next.f20206bg);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int[] iArr;
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.f20202iR = i5;
        this.f20200WR = i5 * 5;
        float f = i;
        float f2 = i2;
        this.f20198IL.set(0.0f, 0.0f, f, f2);
        this.f20201bX.set(0.0f, 0.0f, 0.0f, f2);
        this.ldr.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.eqN.clear();
        float f3 = this.f20202iR / 4.0f;
        for (int i6 : f20197bg) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.eqN.add(new C9059bg(paint, this.f20202iR / 2.0f, f3, f2 / 2.0f));
            f3 += (this.f20202iR / 2.0f) * 3.0f;
        }
        m83681bg();
    }

    public void setProgress(int i) {
        int i2 = this.f20199Kg;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.f20199Kg = i;
        m83681bg();
    }
}
