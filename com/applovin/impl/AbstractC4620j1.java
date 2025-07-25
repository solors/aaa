package com.applovin.impl;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.j1 */
/* loaded from: classes2.dex */
abstract class AbstractC4620j1 {

    /* renamed from: a */
    public final int f7017a;

    /* renamed from: com.applovin.impl.j1$a */
    /* loaded from: classes2.dex */
    static final class C4621a extends AbstractC4620j1 {

        /* renamed from: b */
        public final long f7018b;

        /* renamed from: c */
        public final List f7019c;

        /* renamed from: d */
        public final List f7020d;

        public C4621a(int i, long j) {
            super(i);
            this.f7018b = j;
            this.f7019c = new ArrayList();
            this.f7020d = new ArrayList();
        }

        /* renamed from: a */
        public void m98350a(C4621a c4621a) {
            this.f7020d.add(c4621a);
        }

        /* renamed from: d */
        public C4621a m98348d(int i) {
            int size = this.f7020d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4621a c4621a = (C4621a) this.f7020d.get(i2);
                if (c4621a.f7017a == i) {
                    return c4621a;
                }
            }
            return null;
        }

        /* renamed from: e */
        public C4622b m98347e(int i) {
            int size = this.f7019c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4622b c4622b = (C4622b) this.f7019c.get(i2);
                if (c4622b.f7017a == i) {
                    return c4622b;
                }
            }
            return null;
        }

        @Override // com.applovin.impl.AbstractC4620j1
        public String toString() {
            return AbstractC4620j1.m98353a(this.f7017a) + " leaves: " + Arrays.toString(this.f7019c.toArray()) + " containers: " + Arrays.toString(this.f7020d.toArray());
        }

        /* renamed from: a */
        public void m98349a(C4622b c4622b) {
            this.f7019c.add(c4622b);
        }
    }

    /* renamed from: com.applovin.impl.j1$b */
    /* loaded from: classes2.dex */
    static final class C4622b extends AbstractC4620j1 {

        /* renamed from: b */
        public final C4066ah f7021b;

        public C4622b(int i, C4066ah c4066ah) {
            super(i);
            this.f7021b = c4066ah;
        }
    }

    public AbstractC4620j1(int i) {
        this.f7017a = i;
    }

    /* renamed from: a */
    public static String m98353a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m98352b(int i) {
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    /* renamed from: c */
    public static int m98351c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m98353a(this.f7017a);
    }
}
