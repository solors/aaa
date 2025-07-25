package com.facebook.ads.redexgen.p370X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.OV */
/* loaded from: assets/audience_network.dex */
public class C12329OV extends RelativeLayout {
    public static final int A04 = (int) (AbstractC12137LP.A02 * 4.0f);
    public static final float[] A05 = {A04, A04, A04, A04, A04, A04, A04, A04};
    public boolean A00;
    public float[] A01;
    public final Path A02;
    public final RectF A03;

    public C12329OV(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A01 = A05;
        this.A00 = false;
        this.A02 = new Path();
        this.A03 = new RectF();
        AbstractC12177M3.A0M(this, 0);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        int radiusForCircle = Math.min(getWidth(), getHeight()) / 2;
        return new float[]{radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A03.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A02.reset();
        this.A02.addRoundRect(this.A03, this.A00 ? getRadiiForCircularImage() : this.A01, Path.Direction.CW);
        canvas.clipPath(this.A02);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z) {
        this.A00 = z;
    }

    public void setRadius(int i) {
        int densityAdjustedRadius = (int) (i * AbstractC12137LP.A02);
        this.A01 = new float[]{densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius};
    }

    public void setRadius(float[] fArr) {
        this.A01 = fArr;
    }
}
