package com.taurusx.tax.p594e;

import android.view.GestureDetector;
import android.view.View;

/* renamed from: com.taurusx.tax.e.a */
/* loaded from: classes7.dex */
public class C28319a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public float f73546a;

    /* renamed from: b */
    public float f73547b;

    /* renamed from: c */
    public boolean f73548c;

    /* renamed from: d */
    public boolean f73549d;

    /* renamed from: e */
    public int f73550e;

    /* renamed from: f */
    public float f73551f;

    /* renamed from: g */
    public EnumC28320a f73552g = EnumC28320a.UNSET;

    /* renamed from: com.taurusx.tax.e.a$a */
    /* loaded from: classes7.dex */
    public enum EnumC28320a {
        UNSET,
        GOING_RIGHT,
        GOING_LEFT,
        FINISHED,
        FAILED
    }

    public C28319a(View view) {
        this.f73546a = 100.0f;
        if (view != null && view.getWidth() > 0) {
            this.f73546a = Math.min(100.0f, view.getWidth() / 3.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            com.taurusx.tax.e.a$a r0 = r6.f73552g
            com.taurusx.tax.e.a$a r1 = com.taurusx.tax.p594e.C28319a.EnumC28320a.FINISHED
            if (r0 != r1) goto Lb
            boolean r7 = super.onScroll(r7, r8, r9, r10)
            return r7
        Lb:
            float r0 = r7.getY()
            float r2 = r8.getY()
            float r2 = r2 - r0
            float r0 = java.lang.Math.abs(r2)
            r2 = 1112014848(0x42480000, float:50.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L22
            r0 = r3
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 == 0) goto L2e
            com.taurusx.tax.e.a$a r0 = com.taurusx.tax.p594e.C28319a.EnumC28320a.FAILED
            r6.f73552g = r0
            boolean r7 = super.onScroll(r7, r8, r9, r10)
            return r7
        L2e:
            com.taurusx.tax.e.a$a r0 = r6.f73552g
            int r0 = r0.ordinal()
            if (r0 == 0) goto L9d
            if (r0 == r3) goto L72
            r4 = 2
            if (r0 == r4) goto L3d
            goto Lb1
        L3d:
            float r0 = r8.getX()
            boolean r4 = r6.f73548c
            if (r4 == 0) goto L46
            goto L5d
        L46:
            float r4 = r6.f73551f
            float r5 = r6.f73546a
            float r4 = r4 - r5
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L5f
            r6.f73549d = r2
            r6.f73548c = r3
            int r4 = r6.f73550e
            int r4 = r4 + r3
            r6.f73550e = r4
            r5 = 4
            if (r4 < r5) goto L5d
            r6.f73552g = r1
        L5d:
            r1 = r3
            goto L60
        L5f:
            r1 = r2
        L60:
            if (r1 == 0) goto Lb1
            float r1 = r6.f73547b
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L69
            r2 = r3
        L69:
            if (r2 == 0) goto Lb1
            com.taurusx.tax.e.a$a r1 = com.taurusx.tax.p594e.C28319a.EnumC28320a.GOING_RIGHT
            r6.f73552g = r1
            r6.f73551f = r0
            goto Lb1
        L72:
            float r0 = r8.getX()
            boolean r1 = r6.f73549d
            if (r1 == 0) goto L7c
        L7a:
            r1 = r3
            goto L8b
        L7c:
            float r1 = r6.f73551f
            float r4 = r6.f73546a
            float r1 = r1 + r4
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L8a
            r6.f73548c = r2
            r6.f73549d = r3
            goto L7a
        L8a:
            r1 = r2
        L8b:
            if (r1 == 0) goto Lb1
            float r1 = r6.f73547b
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L94
            r2 = r3
        L94:
            if (r2 == 0) goto Lb1
            com.taurusx.tax.e.a$a r1 = com.taurusx.tax.p594e.C28319a.EnumC28320a.GOING_LEFT
            r6.f73552g = r1
            r6.f73551f = r0
            goto Lb1
        L9d:
            float r0 = r7.getX()
            r6.f73551f = r0
            float r0 = r8.getX()
            float r1 = r6.f73551f
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb1
            com.taurusx.tax.e.a$a r0 = com.taurusx.tax.p594e.C28319a.EnumC28320a.GOING_RIGHT
            r6.f73552g = r0
        Lb1:
            float r0 = r8.getX()
            r6.f73547b = r0
            boolean r7 = super.onScroll(r7, r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p594e.C28319a.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
