package com.applovin.impl;

import com.applovin.impl.C4594ik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.applovin.impl.ik */
/* loaded from: classes2.dex */
public class C4594ik {

    /* renamed from: h */
    private static final Comparator f6940h = new Comparator() { // from class: com.applovin.impl.dy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4594ik.m98404d((C4594ik.C4596b) obj, (C4594ik.C4596b) obj2);
        }
    };

    /* renamed from: i */
    private static final Comparator f6941i = new Comparator() { // from class: com.applovin.impl.ey
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4594ik.m98405c((C4594ik.C4596b) obj, (C4594ik.C4596b) obj2);
        }
    };

    /* renamed from: a */
    private final int f6942a;

    /* renamed from: e */
    private int f6946e;

    /* renamed from: f */
    private int f6947f;

    /* renamed from: g */
    private int f6948g;

    /* renamed from: c */
    private final C4596b[] f6944c = new C4596b[5];

    /* renamed from: b */
    private final ArrayList f6943b = new ArrayList();

    /* renamed from: d */
    private int f6945d = -1;

    /* renamed from: com.applovin.impl.ik$b */
    /* loaded from: classes2.dex */
    public static class C4596b {

        /* renamed from: a */
        public int f6949a;

        /* renamed from: b */
        public int f6950b;

        /* renamed from: c */
        public float f6951c;

        private C4596b() {
        }
    }

    public C4594ik(int i) {
        this.f6942a = i;
    }

    /* renamed from: b */
    private void m98408b() {
        if (this.f6945d != 0) {
            Collections.sort(this.f6943b, f6941i);
            this.f6945d = 0;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ int m98405c(C4596b c4596b, C4596b c4596b2) {
        return m98407b(c4596b, c4596b2);
    }

    /* renamed from: d */
    public static /* synthetic */ int m98404d(C4596b c4596b, C4596b c4596b2) {
        return m98409a(c4596b, c4596b2);
    }

    /* renamed from: a */
    public void m98410a(int i, float f) {
        C4596b c4596b;
        m98412a();
        int i2 = this.f6948g;
        if (i2 > 0) {
            C4596b[] c4596bArr = this.f6944c;
            int i3 = i2 - 1;
            this.f6948g = i3;
            c4596b = c4596bArr[i3];
        } else {
            c4596b = new C4596b();
        }
        int i4 = this.f6946e;
        this.f6946e = i4 + 1;
        c4596b.f6949a = i4;
        c4596b.f6950b = i;
        c4596b.f6951c = f;
        this.f6943b.add(c4596b);
        this.f6947f += i;
        while (true) {
            int i5 = this.f6947f;
            int i6 = this.f6942a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            C4596b c4596b2 = (C4596b) this.f6943b.get(0);
            int i8 = c4596b2.f6950b;
            if (i8 <= i7) {
                this.f6947f -= i8;
                this.f6943b.remove(0);
                int i9 = this.f6948g;
                if (i9 < 5) {
                    C4596b[] c4596bArr2 = this.f6944c;
                    this.f6948g = i9 + 1;
                    c4596bArr2[i9] = c4596b2;
                }
            } else {
                c4596b2.f6950b = i8 - i7;
                this.f6947f -= i7;
            }
        }
    }

    /* renamed from: c */
    public void m98406c() {
        this.f6943b.clear();
        this.f6945d = -1;
        this.f6946e = 0;
        this.f6947f = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ int m98407b(C4596b c4596b, C4596b c4596b2) {
        return Float.compare(c4596b.f6951c, c4596b2.f6951c);
    }

    /* renamed from: a */
    private void m98412a() {
        if (this.f6945d != 1) {
            Collections.sort(this.f6943b, f6940h);
            this.f6945d = 1;
        }
    }

    /* renamed from: a */
    public float m98411a(float f) {
        ArrayList arrayList;
        m98408b();
        float f2 = f * this.f6947f;
        int i = 0;
        for (int i2 = 0; i2 < this.f6943b.size(); i2++) {
            C4596b c4596b = (C4596b) this.f6943b.get(i2);
            i += c4596b.f6950b;
            if (i >= f2) {
                return c4596b.f6951c;
            }
        }
        if (this.f6943b.isEmpty()) {
            return Float.NaN;
        }
        return ((C4596b) this.f6943b.get(arrayList.size() - 1)).f6951c;
    }

    /* renamed from: a */
    public static /* synthetic */ int m98409a(C4596b c4596b, C4596b c4596b2) {
        return c4596b.f6949a - c4596b2.f6949a;
    }
}
