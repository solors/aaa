package com.bytedance.sdk.openadsdk.core.p313IL;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.settings.C8999PX;

/* renamed from: com.bytedance.sdk.openadsdk.core.IL.bX */
/* loaded from: classes3.dex */
public abstract class AbstractView$OnClickListenerC8522bX implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: IL */
    private static float f18740IL = 0.0f;
    protected static int aGH = 8;

    /* renamed from: bX */
    private static float f18741bX;

    /* renamed from: bg */
    private static float f18742bg;
    private static float eqN;

    /* renamed from: zx */
    private static long f18743zx;

    /* renamed from: VJ */
    protected View f18748VJ;

    /* renamed from: LZ */
    protected float f18745LZ = -1.0f;

    /* renamed from: tC */
    protected float f18751tC = -1.0f;
    protected float rri = -1.0f;
    protected float kMt = -1.0f;
    protected long JAA = -1;

    /* renamed from: Ja */
    protected long f18744Ja = -1;

    /* renamed from: Uw */
    protected int f18747Uw = -1;
    protected int DDQ = -1024;

    /* renamed from: Uq */
    protected int f18746Uq = -1;

    /* renamed from: VW */
    protected boolean f18749VW = true;
    public SparseArray<C8523bg> daV = new SparseArray<>();
    private int ldr = 0;

    /* renamed from: iR */
    private int f18750iR = 0;

    /* renamed from: com.bytedance.sdk.openadsdk.core.IL.bX$bg */
    /* loaded from: classes3.dex */
    public static class C8523bg {

        /* renamed from: IL */
        public double f18752IL;

        /* renamed from: bX */
        public double f18753bX;

        /* renamed from: bg */
        public int f18754bg;
        public long eqN;

        public C8523bg(int i, double d, double d2, long j) {
            this.f18754bg = i;
            this.f18752IL = d;
            this.f18753bX = d2;
            this.eqN = j;
        }
    }

    static {
        if (C8838VzQ.m84740bg() != null) {
            aGH = C8838VzQ.m84743IL();
        }
        f18742bg = 0.0f;
        f18740IL = 0.0f;
        f18741bX = 0.0f;
        eqN = 0.0f;
        f18743zx = 0L;
    }

    /* renamed from: bg */
    private boolean m85868bg(View view, Point point) {
        int i;
        int i2;
        int i3;
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (C8520IL.m85885bX(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    if (!view.isShown() || (i = point.x) < (i2 = iArr[0]) || i > i2 + childAt.getWidth() || (i3 = point.y) < (i4 = iArr[1]) || i3 > i4 + childAt.getHeight()) {
                        return false;
                    }
                    return true;
                } else if (m85868bg(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public abstract void mo83557bg(View view, float f, float f2, float f3, float f4, SparseArray<C8523bg> sparseArray, boolean z);

    /* renamed from: iR */
    public boolean m85867iR() {
        return this.f18749VW;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!C8999PX.m83842bg()) {
            return;
        }
        mo83557bg(view, this.f18745LZ, this.f18751tC, this.rri, this.kMt, this.daV, this.f18749VW);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX.eqN <= r3) goto L26;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
