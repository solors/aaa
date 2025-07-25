package com.applovin.impl;

import java.util.Comparator;

/* renamed from: com.applovin.impl.y3 */
/* loaded from: classes2.dex */
public abstract class AbstractC5892y3 {

    /* renamed from: a */
    private static final AbstractC5892y3 f12280a = new C5893a();

    /* renamed from: b */
    private static final AbstractC5892y3 f12281b = new C5894b(-1);

    /* renamed from: c */
    private static final AbstractC5892y3 f12282c = new C5894b(1);

    /* renamed from: com.applovin.impl.y3$a */
    /* loaded from: classes2.dex */
    class C5893a extends AbstractC5892y3 {
        C5893a() {
            super(null);
        }

        /* renamed from: a */
        AbstractC5892y3 m92826a(int i) {
            if (i < 0) {
                return AbstractC5892y3.f12281b;
            }
            return i > 0 ? AbstractC5892y3.f12282c : AbstractC5892y3.f12280a;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: b */
        public AbstractC5892y3 mo92821b(boolean z, boolean z2) {
            return m92826a(AbstractC4693k2.m98037a(z2, z));
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: d */
        public int mo92820d() {
            return 0;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92825a(int i, int i2) {
            return m92826a(AbstractC5555tb.m94483a(i, i2));
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92824a(long j, long j2) {
            return m92826a(AbstractC5261rc.m95910a(j, j2));
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92823a(Object obj, Object obj2, Comparator comparator) {
            return m92826a(comparator.compare(obj, obj2));
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92822a(boolean z, boolean z2) {
            return m92826a(AbstractC4693k2.m98037a(z, z2));
        }
    }

    /* renamed from: com.applovin.impl.y3$b */
    /* loaded from: classes2.dex */
    private static final class C5894b extends AbstractC5892y3 {

        /* renamed from: d */
        final int f12283d;

        C5894b(int i) {
            super(null);
            this.f12283d = i;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92825a(int i, int i2) {
            return this;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: d */
        public int mo92820d() {
            return this.f12283d;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92824a(long j, long j2) {
            return this;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92823a(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: a */
        public AbstractC5892y3 mo92822a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.applovin.impl.AbstractC5892y3
        /* renamed from: b */
        public AbstractC5892y3 mo92821b(boolean z, boolean z2) {
            return this;
        }
    }

    private AbstractC5892y3() {
    }

    /* synthetic */ AbstractC5892y3(C5893a c5893a) {
        this();
    }

    /* renamed from: e */
    public static AbstractC5892y3 m92827e() {
        return f12280a;
    }

    /* renamed from: a */
    public abstract AbstractC5892y3 mo92825a(int i, int i2);

    /* renamed from: a */
    public abstract AbstractC5892y3 mo92824a(long j, long j2);

    /* renamed from: a */
    public abstract AbstractC5892y3 mo92823a(Object obj, Object obj2, Comparator comparator);

    /* renamed from: a */
    public abstract AbstractC5892y3 mo92822a(boolean z, boolean z2);

    /* renamed from: b */
    public abstract AbstractC5892y3 mo92821b(boolean z, boolean z2);

    /* renamed from: d */
    public abstract int mo92820d();
}
