package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class wf1 {

    /* renamed from: com.yandex.mobile.ads.impl.wf1$a */
    /* loaded from: classes8.dex */
    private static class C31744a<T> implements vf1<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final List<? extends vf1<? super T>> f87249b;

        @Override // com.yandex.mobile.ads.impl.vf1
        public final boolean apply(T t) {
            for (int i = 0; i < this.f87249b.size(); i++) {
                if (!this.f87249b.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C31744a) {
                return this.f87249b.equals(((C31744a) obj).f87249b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f87249b.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends vf1<? super T>> list = this.f87249b;
            StringBuilder sb2 = new StringBuilder("Predicates.and(");
            boolean z = true;
            for (T t : list) {
                if (!z) {
                    sb2.append(',');
                }
                sb2.append(t);
                z = false;
            }
            sb2.append(')');
            return sb2.toString();
        }

        private C31744a(List<? extends vf1<? super T>> list) {
            this.f87249b = list;
        }
    }

    /* renamed from: a */
    public static <T> vf1<T> m27918a(vf1<? super T> vf1Var, vf1<? super T> vf1Var2) {
        vf1Var.getClass();
        vf1Var2.getClass();
        return new C31744a(Arrays.asList(vf1Var, vf1Var2));
    }
}
