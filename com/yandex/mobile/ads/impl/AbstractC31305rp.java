package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.rp */
/* loaded from: classes8.dex */
public abstract class AbstractC31305rp {

    /* renamed from: a */
    private static final AbstractC31305rp f84844a = new C31306a();

    /* renamed from: b */
    private static final AbstractC31305rp f84845b = new C31307b(-1);

    /* renamed from: c */
    private static final AbstractC31305rp f84846c = new C31307b(1);

    /* renamed from: com.yandex.mobile.ads.impl.rp$a */
    /* loaded from: classes8.dex */
    final class C31306a extends AbstractC31305rp {
        C31306a() {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final int mo29965a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: b */
        public final AbstractC31305rp mo29960b(boolean z, boolean z2) {
            char c;
            if (z2 == z) {
                c = 0;
            } else if (z2) {
                c = 1;
            } else {
                c = 65535;
            }
            if (c < 0) {
                return AbstractC31305rp.f84845b;
            }
            return c > 0 ? AbstractC31305rp.f84846c : AbstractC31305rp.f84844a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final AbstractC31305rp mo29964a(int i, int i2) {
            char c = i < i2 ? (char) 65535 : i > i2 ? (char) 1 : (char) 0;
            if (c < 0) {
                return AbstractC31305rp.f84845b;
            }
            return c > 0 ? AbstractC31305rp.f84846c : AbstractC31305rp.f84844a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final AbstractC31305rp mo29963a(long j, long j2) {
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            char c = i < 0 ? (char) 65535 : i > 0 ? (char) 1 : (char) 0;
            if (c < 0) {
                return AbstractC31305rp.f84845b;
            }
            return c > 0 ? AbstractC31305rp.f84846c : AbstractC31305rp.f84844a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final <T> AbstractC31305rp mo29962a(T t, T t2, Comparator<T> comparator) {
            int compare = comparator.compare(t, t2);
            if (compare < 0) {
                return AbstractC31305rp.f84845b;
            }
            return compare > 0 ? AbstractC31305rp.f84846c : AbstractC31305rp.f84844a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final AbstractC31305rp mo29961a(boolean z, boolean z2) {
            char c = z == z2 ? (char) 0 : z ? (char) 1 : (char) 65535;
            if (c < 0) {
                return AbstractC31305rp.f84845b;
            }
            return c > 0 ? AbstractC31305rp.f84846c : AbstractC31305rp.f84844a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rp$b */
    /* loaded from: classes8.dex */
    private static final class C31307b extends AbstractC31305rp {

        /* renamed from: d */
        final int f84847d;

        C31307b(int i) {
            super();
            this.f84847d = i;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final AbstractC31305rp mo29964a(int i, int i2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final AbstractC31305rp mo29963a(long j, long j2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final <T> AbstractC31305rp mo29962a(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final AbstractC31305rp mo29961a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: a */
        public final int mo29965a() {
            return this.f84847d;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31305rp
        /* renamed from: b */
        public final AbstractC31305rp mo29960b(boolean z, boolean z2) {
            return this;
        }
    }

    /* renamed from: b */
    public static AbstractC31305rp m29969b() {
        return f84844a;
    }

    /* renamed from: a */
    public abstract int mo29965a();

    /* renamed from: a */
    public abstract AbstractC31305rp mo29964a(int i, int i2);

    /* renamed from: a */
    public abstract AbstractC31305rp mo29963a(long j, long j2);

    /* renamed from: a */
    public abstract <T> AbstractC31305rp mo29962a(T t, T t2, Comparator<T> comparator);

    /* renamed from: a */
    public abstract AbstractC31305rp mo29961a(boolean z, boolean z2);

    /* renamed from: b */
    public abstract AbstractC31305rp mo29960b(boolean z, boolean z2);

    private AbstractC31305rp() {
    }
}
