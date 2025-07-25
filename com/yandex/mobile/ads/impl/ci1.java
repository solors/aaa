package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class ci1 {

    /* renamed from: a */
    public final C30095a f77632a;

    /* renamed from: b */
    public final C30095a f77633b;

    /* renamed from: c */
    public final int f77634c;

    /* renamed from: d */
    public final boolean f77635d;

    /* renamed from: com.yandex.mobile.ads.impl.ci1$a */
    /* loaded from: classes8.dex */
    public static final class C30095a {

        /* renamed from: a */
        private final C30096b[] f77636a;

        public C30095a(C30096b... c30096bArr) {
            this.f77636a = c30096bArr;
        }

        /* renamed from: a */
        public final C30096b m35230a() {
            return this.f77636a[0];
        }

        /* renamed from: b */
        public final int m35229b() {
            return this.f77636a.length;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ci1$b */
    /* loaded from: classes8.dex */
    public static final class C30096b {

        /* renamed from: a */
        public final int f77637a;

        /* renamed from: b */
        public final int f77638b;

        /* renamed from: c */
        public final float[] f77639c;

        /* renamed from: d */
        public final float[] f77640d;

        public C30096b(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.f77637a = i;
            if (fArr.length * 2 == fArr2.length * 3) {
                z = true;
            } else {
                z = false;
            }
            C30937nf.m31567a(z);
            this.f77639c = fArr;
            this.f77640d = fArr2;
            this.f77638b = i2;
        }

        /* renamed from: a */
        public final int m35228a() {
            return this.f77639c.length / 3;
        }
    }

    public ci1(C30095a c30095a, C30095a c30095a2, int i) {
        boolean z;
        this.f77632a = c30095a;
        this.f77633b = c30095a2;
        this.f77634c = i;
        if (c30095a == c30095a2) {
            z = true;
        } else {
            z = false;
        }
        this.f77635d = z;
    }
}
