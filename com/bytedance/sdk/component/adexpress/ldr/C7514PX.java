package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.sdk.component.utils.C7730Fy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.PX */
/* loaded from: classes3.dex */
public class C7514PX extends View {

    /* renamed from: IL */
    Rect f16323IL;

    /* renamed from: Kg */
    private int f16324Kg;

    /* renamed from: Lq */
    private final List<C7515bg> f16325Lq;

    /* renamed from: PX */
    private Xfermode f16326PX;

    /* renamed from: Ta */
    private PorterDuff.Mode f16327Ta;

    /* renamed from: VB */
    private Paint f16328VB;

    /* renamed from: WR */
    private int[] f16329WR;

    /* renamed from: bX */
    private int f16330bX;

    /* renamed from: bg */
    Rect f16331bg;

    /* renamed from: eo */
    private Bitmap f16332eo;
    private int eqN;

    /* renamed from: iR */
    private int f16333iR;
    private int ldr;
    private LinearGradient yDt;

    /* renamed from: zx */
    private int f16334zx;

    /* renamed from: com.bytedance.sdk.component.adexpress.ldr.PX$bg */
    /* loaded from: classes3.dex */
    public static class C7515bg {

        /* renamed from: IL */
        private int f16335IL = 0;

        /* renamed from: bg */
        private final int f16336bg;

        public C7515bg(int i) {
            this.f16336bg = i;
        }

        /* renamed from: bg */
        public void m88631bg() {
            this.f16335IL += this.f16336bg;
        }
    }

    public C7514PX(Context context) {
        super(context);
        this.f16327Ta = PorterDuff.Mode.DST_IN;
        this.f16325Lq = new ArrayList();
        m88633bg();
    }

    /* renamed from: bg */
    private void m88633bg() {
        this.f16330bX = C7730Fy.eqN(getContext(), "tt_splash_unlock_image_arrow");
        this.eqN = Color.parseColor("#00ffffff");
        this.f16334zx = Color.parseColor("#ffffffff");
        int parseColor = Color.parseColor("#00ffffff");
        this.ldr = parseColor;
        this.f16333iR = 10;
        this.f16324Kg = 40;
        this.f16329WR = new int[]{this.eqN, this.f16334zx, parseColor};
        setLayerType(1, null);
        this.f16328VB = new Paint(1);
        this.f16332eo = BitmapFactory.decodeResource(getResources(), this.f16330bX);
        this.f16326PX = new PorterDuffXfermode(this.f16327Ta);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f16332eo, this.f16331bg, this.f16323IL, this.f16328VB);
        canvas.save();
        Iterator<C7515bg> it = this.f16325Lq.iterator();
        while (it.hasNext()) {
            C7515bg next = it.next();
            this.yDt = new LinearGradient(next.f16335IL, 0.0f, next.f16335IL + this.f16324Kg, this.f16333iR, this.f16329WR, (float[]) null, Shader.TileMode.CLAMP);
            this.f16328VB.setColor(-1);
            this.f16328VB.setShader(this.yDt);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f16328VB);
            this.f16328VB.setShader(null);
            next.m88631bg();
            if (next.f16335IL > getWidth()) {
                it.remove();
            }
        }
        this.f16328VB.setXfermode(this.f16326PX);
        canvas.drawBitmap(this.f16332eo, this.f16331bg, this.f16323IL, this.f16328VB);
        this.f16328VB.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f16332eo == null) {
            return;
        }
        this.f16331bg = new Rect(0, 0, this.f16332eo.getWidth(), this.f16332eo.getHeight());
        this.f16323IL = new Rect(0, 0, getWidth(), getHeight());
    }

    /* renamed from: bg */
    public void m88632bg(int i) {
        this.f16325Lq.add(new C7515bg(i));
        postInvalidate();
    }
}
