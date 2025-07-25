package com.explorestack.iab.vast.view;

import android.content.Context;
import android.view.TextureView;

/* renamed from: com.explorestack.iab.vast.view.a */
/* loaded from: classes3.dex */
public class C10592a extends TextureView {

    /* renamed from: b */
    private int f24313b;

    /* renamed from: c */
    private int f24314c;

    public C10592a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m78956a(int i, int i2) {
        this.f24313b = i;
        this.f24314c = i2;
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r1 > r6) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f24313b
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f24314c
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f24313b
            if (r2 <= 0) goto L75
            int r2 = r5.f24314c
            if (r2 <= 0) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3c
            if (r1 != r2) goto L3c
            int r0 = r5.f24313b
            int r1 = r0 * r7
            int r2 = r5.f24314c
            int r3 = r6 * r2
            if (r1 >= r3) goto L37
            int r0 = r1 / r2
            goto L5d
        L37:
            if (r1 <= r3) goto L5a
            int r1 = r3 / r0
            goto L4c
        L3c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L4e
            int r0 = r5.f24314c
            int r0 = r0 * r6
            int r2 = r5.f24313b
            int r0 = r0 / r2
            if (r1 != r3) goto L4b
            if (r0 <= r7) goto L4b
            goto L5a
        L4b:
            r1 = r0
        L4c:
            r0 = r6
            goto L75
        L4e:
            if (r1 != r2) goto L5f
            int r1 = r5.f24313b
            int r1 = r1 * r7
            int r2 = r5.f24314c
            int r1 = r1 / r2
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
        L5a:
            r0 = r6
            goto L5d
        L5c:
            r0 = r1
        L5d:
            r1 = r7
            goto L75
        L5f:
            int r2 = r5.f24313b
            int r4 = r5.f24314c
            if (r1 != r3) goto L6b
            if (r4 <= r7) goto L6b
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6d
        L6b:
            r1 = r2
            r7 = r4
        L6d:
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L4c
        L75:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r7 = "/"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "Size"
            android.util.Log.e(r7, r6)
            r5.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.view.C10592a.onMeasure(int, int):void");
    }
}
