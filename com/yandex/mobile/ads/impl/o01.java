package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class o01<K0, V0> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.o01$a */
    /* loaded from: classes8.dex */
    public static final class C31008a<V> implements uy1<List<V>>, Serializable {

        /* renamed from: b */
        private final int f83252b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C31008a(int i) {
            this.f83252b = C30644jp.m32828a(i, "expectedValuesPerKey");
        }

        @Override // com.yandex.mobile.ads.impl.uy1
        public final Object get() {
            return new ArrayList(this.f83252b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o01$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC31009b<K0, V0> extends o01<K0, V0> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC31009b() {
            super();
        }

        /* renamed from: b */
        public abstract <K extends K0, V extends V0> bp0<K, V> mo30858b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.o01$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC31010c<K0> {
        /* renamed from: a */
        public final AbstractC31009b<K0, Object> m31199a() {
            C30644jp.m32828a(2, "expectedValuesPerKey");
            return new p01(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo31198b();
    }

    /* renamed from: a */
    public static AbstractC31010c<Comparable> m31200a() {
        v81 v81Var = v81.f86600b;
        v81Var.getClass();
        return new n01(v81Var);
    }

    private o01() {
    }
}
