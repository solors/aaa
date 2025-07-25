package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rv1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class rv1 {

    /* renamed from: h */
    private static final Comparator<C31314a> f84907h = new Comparator() { // from class: com.yandex.mobile.ads.impl.jv2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return rv1.m29919d((rv1.C31314a) obj, (rv1.C31314a) obj2);
        }
    };

    /* renamed from: i */
    private static final Comparator<C31314a> f84908i = new Comparator() { // from class: com.yandex.mobile.ads.impl.kv2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return rv1.m29920c((rv1.C31314a) obj, (rv1.C31314a) obj2);
        }
    };

    /* renamed from: a */
    private final int f84909a;

    /* renamed from: e */
    private int f84913e;

    /* renamed from: f */
    private int f84914f;

    /* renamed from: g */
    private int f84915g;

    /* renamed from: c */
    private final C31314a[] f84911c = new C31314a[5];

    /* renamed from: b */
    private final ArrayList<C31314a> f84910b = new ArrayList<>();

    /* renamed from: d */
    private int f84912d = -1;

    /* renamed from: com.yandex.mobile.ads.impl.rv1$a */
    /* loaded from: classes8.dex */
    public static class C31314a {

        /* renamed from: a */
        public int f84916a;

        /* renamed from: b */
        public int f84917b;

        /* renamed from: c */
        public float f84918c;

        private C31314a() {
        }
    }

    public rv1(int i) {
        this.f84909a = i;
    }

    /* renamed from: b */
    public static /* synthetic */ int m29921b(C31314a c31314a, C31314a c31314a2) {
        return Float.compare(c31314a.f84918c, c31314a2.f84918c);
    }

    /* renamed from: c */
    public static /* synthetic */ int m29920c(C31314a c31314a, C31314a c31314a2) {
        return m29921b(c31314a, c31314a2);
    }

    /* renamed from: d */
    public static /* synthetic */ int m29919d(C31314a c31314a, C31314a c31314a2) {
        return m29923a(c31314a, c31314a2);
    }

    /* renamed from: a */
    public final void m29924a(int i, float f) {
        C31314a c31314a;
        if (this.f84912d != 1) {
            Collections.sort(this.f84910b, f84907h);
            this.f84912d = 1;
        }
        int i2 = this.f84915g;
        if (i2 > 0) {
            C31314a[] c31314aArr = this.f84911c;
            int i3 = i2 - 1;
            this.f84915g = i3;
            c31314a = c31314aArr[i3];
        } else {
            c31314a = new C31314a();
        }
        int i4 = this.f84913e;
        this.f84913e = i4 + 1;
        c31314a.f84916a = i4;
        c31314a.f84917b = i;
        c31314a.f84918c = f;
        this.f84910b.add(c31314a);
        this.f84914f += i;
        while (true) {
            int i5 = this.f84914f;
            int i6 = this.f84909a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            C31314a c31314a2 = this.f84910b.get(0);
            int i8 = c31314a2.f84917b;
            if (i8 <= i7) {
                this.f84914f -= i8;
                this.f84910b.remove(0);
                int i9 = this.f84915g;
                if (i9 < 5) {
                    C31314a[] c31314aArr2 = this.f84911c;
                    this.f84915g = i9 + 1;
                    c31314aArr2[i9] = c31314a2;
                }
            } else {
                c31314a2.f84917b = i8 - i7;
                this.f84914f -= i7;
            }
        }
    }

    /* renamed from: b */
    public final void m29922b() {
        this.f84910b.clear();
        this.f84912d = -1;
        this.f84913e = 0;
        this.f84914f = 0;
    }

    /* renamed from: a */
    public final float m29925a() {
        ArrayList<C31314a> arrayList;
        if (this.f84912d != 0) {
            Collections.sort(this.f84910b, f84908i);
            this.f84912d = 0;
        }
        float f = 0.5f * this.f84914f;
        int i = 0;
        for (int i2 = 0; i2 < this.f84910b.size(); i2++) {
            C31314a c31314a = this.f84910b.get(i2);
            i += c31314a.f84917b;
            if (i >= f) {
                return c31314a.f84918c;
            }
        }
        if (this.f84910b.isEmpty()) {
            return Float.NaN;
        }
        return this.f84910b.get(arrayList.size() - 1).f84918c;
    }

    /* renamed from: a */
    public static /* synthetic */ int m29923a(C31314a c31314a, C31314a c31314a2) {
        return c31314a.f84916a - c31314a2.f84916a;
    }
}
