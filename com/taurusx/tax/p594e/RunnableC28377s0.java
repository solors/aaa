package com.taurusx.tax.p594e;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.taurusx.tax.e.s0 */
/* loaded from: classes7.dex */
public class RunnableC28377s0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f73648a;

    /* renamed from: b */
    public final /* synthetic */ C28363r0 f73649b;

    public RunnableC28377s0(C28363r0 c28363r0, View view) {
        this.f73649b = c28363r0;
        this.f73648a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        this.f73648a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = this.f73648a.getWidth();
        int height = this.f73648a.getHeight();
        int i3 = width + i;
        int i4 = height + i2;
        this.f73649b.f73630k = new Rect(i, i2, i3, i4);
        this.f73649b.f73631l = new Rect(i, i2, i3, i4);
        this.f73649b.m38214b();
        this.f73649b.m38212c();
    }
}
