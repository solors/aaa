package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.pg */
/* loaded from: classes8.dex */
abstract class AbstractC31125pg {

    /* renamed from: a */
    public final int f83944a;

    /* renamed from: com.yandex.mobile.ads.impl.pg$a */
    /* loaded from: classes8.dex */
    static final class C31126a extends AbstractC31125pg {

        /* renamed from: b */
        public final long f83945b;

        /* renamed from: c */
        public final ArrayList f83946c;

        /* renamed from: d */
        public final ArrayList f83947d;

        public C31126a(int i, long j) {
            super(i);
            this.f83945b = j;
            this.f83946c = new ArrayList();
            this.f83947d = new ArrayList();
        }

        @Nullable
        /* renamed from: b */
        public final C31126a m30676b(int i) {
            int size = this.f83947d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C31126a c31126a = (C31126a) this.f83947d.get(i2);
                if (c31126a.f83944a == i) {
                    return c31126a;
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: c */
        public final C31127b m30675c(int i) {
            int size = this.f83946c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C31127b c31127b = (C31127b) this.f83946c.get(i2);
                if (c31127b.f83944a == i) {
                    return c31127b;
                }
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31125pg
        public final String toString() {
            return AbstractC31125pg.m30677a(this.f83944a) + " leaves: " + Arrays.toString(this.f83946c.toArray()) + " containers: " + Arrays.toString(this.f83947d.toArray());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pg$b */
    /* loaded from: classes8.dex */
    static final class C31127b extends AbstractC31125pg {

        /* renamed from: b */
        public final cc1 f83948b;

        public C31127b(int i, cc1 cc1Var) {
            super(i);
            this.f83948b = cc1Var;
        }
    }

    public AbstractC31125pg(int i) {
        this.f83944a = i;
    }

    /* renamed from: a */
    public static String m30677a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return m30677a(this.f83944a);
    }
}
