package com.applovin.impl;

import android.util.SparseBooleanArray;

/* renamed from: com.applovin.impl.a9 */
/* loaded from: classes2.dex */
public final class C3997a9 {

    /* renamed from: a */
    private final SparseBooleanArray f4536a;

    private C3997a9(SparseBooleanArray sparseBooleanArray) {
        this.f4536a = sparseBooleanArray;
    }

    /* renamed from: a */
    public boolean m101020a(int i) {
        return this.f4536a.get(i);
    }

    /* renamed from: b */
    public int m101018b(int i) {
        AbstractC4100b1.m100584a(i, 0, m101021a());
        return this.f4536a.keyAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3997a9)) {
            return false;
        }
        C3997a9 c3997a9 = (C3997a9) obj;
        if (AbstractC5863xp.f12151a < 24) {
            if (m101021a() != c3997a9.m101021a()) {
                return false;
            }
            for (int i = 0; i < m101021a(); i++) {
                if (m101018b(i) != c3997a9.m101018b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f4536a.equals(c3997a9.f4536a);
    }

    public int hashCode() {
        if (AbstractC5863xp.f12151a < 24) {
            int m101021a = m101021a();
            for (int i = 0; i < m101021a(); i++) {
                m101021a = (m101021a * 31) + m101018b(i);
            }
            return m101021a;
        }
        return this.f4536a.hashCode();
    }

    /* renamed from: com.applovin.impl.a9$b */
    /* loaded from: classes2.dex */
    public static final class C3999b {

        /* renamed from: a */
        private final SparseBooleanArray f4537a = new SparseBooleanArray();

        /* renamed from: b */
        private boolean f4538b;

        /* renamed from: a */
        public C3999b m101016a(int i) {
            AbstractC4100b1.m100577b(!this.f4538b);
            this.f4537a.append(i, true);
            return this;
        }

        /* renamed from: a */
        public C3999b m101014a(C3997a9 c3997a9) {
            for (int i = 0; i < c3997a9.m101021a(); i++) {
                m101016a(c3997a9.m101018b(i));
            }
            return this;
        }

        /* renamed from: a */
        public C3999b m101013a(int... iArr) {
            for (int i : iArr) {
                m101016a(i);
            }
            return this;
        }

        /* renamed from: a */
        public C3999b m101015a(int i, boolean z) {
            return z ? m101016a(i) : this;
        }

        /* renamed from: a */
        public C3997a9 m101017a() {
            AbstractC4100b1.m100577b(!this.f4538b);
            this.f4538b = true;
            return new C3997a9(this.f4537a);
        }
    }

    /* renamed from: a */
    public boolean m101019a(int... iArr) {
        for (int i : iArr) {
            if (m101020a(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int m101021a() {
        return this.f4536a.size();
    }
}
