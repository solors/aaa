package com.facebook.ads.redexgen.p370X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.OU */
/* loaded from: assets/audience_network.dex */
public class C12328OU extends ImageView {
    public static String[] A04 = {"Kc8JibrER9cs", "6Wp6BEbZPT212ACykXyq", "O0Hoe", "baZKEFvTxoHzeItuM7o3AXmynaYxTYwd", "xn1t1phU", "0uUoxvDF5neMvwmx1nt40mKgR1ymbUJ1", "GF6FLq8961WfPcMwM9rdoNQLfzsndhBQ", "oIRkeIv6PHjnfLhlAQ7Y"};
    public static final int A05 = (int) (AbstractC12137LP.A02 * 8.0f);
    public static final float[] A06 = {A05, A05, A05, A05, A05, A05, A05, A05};
    public boolean A00;
    public float[] A01;
    public final Path A02;
    public final RectF A03;

    public C12328OU(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A01 = A06;
        this.A00 = false;
        this.A02 = new Path();
        this.A03 = new RectF();
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        int radiusForCircle = Math.min(getWidth(), getHeight()) / 2;
        return new float[]{radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle};
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.A03.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A02.reset();
        float[] radiiForCircularImage = this.A00 ? getRadiiForCircularImage() : this.A01;
        Path path = this.A02;
        String[] strArr = A04;
        if (strArr[6].charAt(16) != strArr[3].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "ZxWhoSIa4o5yXhIxMh2nNae8eEoL0rG0";
        strArr2[3] = "aU5wM7Ngl7vhZDd4M0TRPmCvUiPnnlll";
        path.addRoundRect(this.A03, radiiForCircularImage, Path.Direction.CW);
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
