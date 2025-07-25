package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.xxp */
/* loaded from: classes3.dex */
public class C9084xxp extends View {

    /* renamed from: IL */
    private final boolean f20279IL;

    /* renamed from: bX */
    private int f20280bX;

    /* renamed from: bg */
    private final Path f20281bg;
    private Drawable eqN;
    private float ldr;

    /* renamed from: zx */
    private Drawable f20282zx;

    public C9084xxp(Context context) {
        this(context, false);
    }

    /* renamed from: IL */
    private void m83602IL() {
        int width = getWidth();
        int height = getHeight();
        if (this.ldr > 0.0f && width > 0 && height > 0) {
            this.f20281bg.reset();
            this.f20281bg.addRect(new RectF(0.0f, 0.0f, width * this.ldr, height), Path.Direction.CCW);
        }
    }

    /* renamed from: bg */
    private void m83601bg() {
        Context context = getContext();
        this.eqN = C7730Fy.m87919bX(context, this.f20279IL ? "tt_star_thick_dark" : "tt_star_thick");
        this.f20282zx = C7730Fy.m87919bX(context, "tt_star");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f20280bX <= 0) {
            return;
        }
        int save = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.eqN.draw(canvas);
            canvas.translate(this.f20280bX, 0.0f);
        }
        canvas.restoreToCount(save);
        canvas.clipPath(this.f20281bg);
        for (int i2 = 0; i2 < 5; i2++) {
            this.f20282zx.draw(canvas);
            canvas.translate(this.f20280bX, 0.0f);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f20280bX * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20280bX, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m83602IL();
    }

    public C9084xxp(Context context, boolean z) {
        super(context);
        this.f20281bg = new Path();
        this.f20279IL = z;
        m83601bg();
    }

    /* renamed from: bg */
    public void m83600bg(double d, int i) {
        int m82529bg = (int) ZQc.m82529bg(getContext(), i, false);
        this.f20280bX = m82529bg;
        this.eqN.setBounds(0, 0, m82529bg, m82529bg);
        Drawable drawable = this.f20282zx;
        int i2 = this.f20280bX;
        drawable.setBounds(0, 0, i2, i2);
        this.ldr = ((float) d) / 5.0f;
        m83602IL();
        requestLayout();
    }
}
