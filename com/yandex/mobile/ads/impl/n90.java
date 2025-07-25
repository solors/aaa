package com.yandex.mobile.ads.impl;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class n90 {

    /* renamed from: a */
    private final SparseBooleanArray f82633a;

    /* renamed from: b */
    public final int m31642b(int i) {
        C30937nf.m31572a(i, this.f82633a.size());
        return this.f82633a.keyAt(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90Var = (n90) obj;
        if (y32.f88010a < 24) {
            if (this.f82633a.size() != n90Var.f82633a.size()) {
                return false;
            }
            for (int i = 0; i < this.f82633a.size(); i++) {
                if (m31642b(i) != n90Var.m31642b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f82633a.equals(n90Var.f82633a);
    }

    public final int hashCode() {
        if (y32.f88010a < 24) {
            int size = this.f82633a.size();
            for (int i = 0; i < this.f82633a.size(); i++) {
                size = (size * 31) + m31642b(i);
            }
            return size;
        }
        return this.f82633a.hashCode();
    }

    private n90(SparseBooleanArray sparseBooleanArray) {
        this.f82633a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final boolean m31644a(int i) {
        return this.f82633a.get(i);
    }

    /* renamed from: com.yandex.mobile.ads.impl.n90$a */
    /* loaded from: classes8.dex */
    public static final class C30918a {

        /* renamed from: a */
        private final SparseBooleanArray f82634a = new SparseBooleanArray();

        /* renamed from: b */
        private boolean f82635b;

        /* renamed from: a */
        public final C30918a m31640a(int i) {
            if (!this.f82635b) {
                this.f82634a.append(i, true);
                return this;
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public final void m31639a(n90 n90Var) {
            for (int i = 0; i < n90Var.f82633a.size(); i++) {
                m31640a(n90Var.m31642b(i));
            }
        }

        /* renamed from: a */
        public final n90 m31641a() {
            if (!this.f82635b) {
                this.f82635b = true;
                return new n90(this.f82634a);
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final int m31645a() {
        return this.f82633a.size();
    }
}
