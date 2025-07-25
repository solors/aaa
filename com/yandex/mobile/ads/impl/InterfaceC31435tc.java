package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vt0;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.tc */
/* loaded from: classes8.dex */
public interface InterfaceC31435tc {

    /* renamed from: com.yandex.mobile.ads.impl.tc$a */
    /* loaded from: classes8.dex */
    public static final class C31436a {

        /* renamed from: a */
        public final long f85579a;

        /* renamed from: b */
        public final g02 f85580b;

        /* renamed from: c */
        public final int f85581c;
        @Nullable

        /* renamed from: d */
        public final vt0.C31682b f85582d;

        /* renamed from: e */
        public final long f85583e;

        /* renamed from: f */
        public final g02 f85584f;

        /* renamed from: g */
        public final int f85585g;
        @Nullable

        /* renamed from: h */
        public final vt0.C31682b f85586h;

        /* renamed from: i */
        public final long f85587i;

        /* renamed from: j */
        public final long f85588j;

        public C31436a(long j, g02 g02Var, int i, @Nullable vt0.C31682b c31682b, long j2, g02 g02Var2, int i2, @Nullable vt0.C31682b c31682b2, long j3, long j4) {
            this.f85579a = j;
            this.f85580b = g02Var;
            this.f85581c = i;
            this.f85582d = c31682b;
            this.f85583e = j2;
            this.f85584f = g02Var2;
            this.f85585g = i2;
            this.f85586h = c31682b2;
            this.f85587i = j3;
            this.f85588j = j4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C31436a.class != obj.getClass()) {
                return false;
            }
            C31436a c31436a = (C31436a) obj;
            if (this.f85579a == c31436a.f85579a && this.f85581c == c31436a.f85581c && this.f85583e == c31436a.f85583e && this.f85585g == c31436a.f85585g && this.f85587i == c31436a.f85587i && this.f85588j == c31436a.f85588j && da1.m34981a(this.f85580b, c31436a.f85580b) && da1.m34981a(this.f85582d, c31436a.f85582d) && da1.m34981a(this.f85584f, c31436a.f85584f) && da1.m34981a(this.f85586h, c31436a.f85586h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f85579a), this.f85580b, Integer.valueOf(this.f85581c), this.f85582d, Long.valueOf(this.f85583e), this.f85584f, Integer.valueOf(this.f85585g), this.f85586h, Long.valueOf(this.f85587i), Long.valueOf(this.f85588j)});
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tc$b */
    /* loaded from: classes8.dex */
    public static final class C31437b {

        /* renamed from: a */
        private final n90 f85589a;

        /* renamed from: b */
        private final SparseArray<C31436a> f85590b;

        public C31437b(n90 n90Var, SparseArray<C31436a> sparseArray) {
            this.f85589a = n90Var;
            SparseArray<C31436a> sparseArray2 = new SparseArray<>(n90Var.m31645a());
            for (int i = 0; i < n90Var.m31645a(); i++) {
                int m31642b = n90Var.m31642b(i);
                sparseArray2.append(m31642b, (C31436a) C30937nf.m31570a(sparseArray.get(m31642b)));
            }
            this.f85590b = sparseArray2;
        }

        /* renamed from: a */
        public final boolean m29232a(int i) {
            return this.f85589a.m31644a(i);
        }

        /* renamed from: b */
        public final int m29231b(int i) {
            return this.f85589a.m31642b(i);
        }

        /* renamed from: c */
        public final C31436a m29230c(int i) {
            C31436a c31436a = this.f85590b.get(i);
            c31436a.getClass();
            return c31436a;
        }

        /* renamed from: a */
        public final int m29233a() {
            return this.f85589a.m31645a();
        }
    }
}
