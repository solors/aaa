package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.vj */
/* loaded from: classes8.dex */
public abstract class AbstractC31660vj implements v40 {

    /* renamed from: a */
    protected final v02 f86762a;

    /* renamed from: b */
    protected final int f86763b;

    /* renamed from: c */
    protected final int[] f86764c;

    /* renamed from: d */
    private final v90[] f86765d;

    /* renamed from: e */
    private int f86766e;

    public AbstractC31660vj(v02 v02Var, int[] iArr) {
        boolean z;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C30937nf.m31566b(z);
        this.f86762a = (v02) C30937nf.m31570a(v02Var);
        int length = iArr.length;
        this.f86763b = length;
        this.f86765d = new v90[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f86765d[i2] = v02Var.m28579a(iArr[i2]);
        }
        Arrays.sort(this.f86765d, new Comparator() { // from class: com.yandex.mobile.ads.impl.pz2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC31660vj.m28302b((v90) obj, (v90) obj2);
            }
        });
        this.f86764c = new int[this.f86763b];
        while (true) {
            int i3 = this.f86763b;
            if (i < i3) {
                this.f86764c[i] = v02Var.m28577a(this.f86765d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ int m28302b(v90 v90Var, v90 v90Var2) {
        return m28303a(v90Var, v90Var2);
    }

    @Override // com.yandex.mobile.ads.impl.v40
    /* renamed from: a */
    public void mo28304a(float f) {
    }

    @Override // com.yandex.mobile.ads.impl.v40
    /* renamed from: c */
    public void mo28301c() {
    }

    @Override // com.yandex.mobile.ads.impl.v40
    /* renamed from: e */
    public final v90 mo28299e() {
        return this.f86765d[0];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC31660vj abstractC31660vj = (AbstractC31660vj) obj;
        if (this.f86762a == abstractC31660vj.f86762a && Arrays.equals(this.f86764c, abstractC31660vj.f86764c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f86766e == 0) {
            this.f86766e = Arrays.hashCode(this.f86764c) + (System.identityHashCode(this.f86762a) * 31);
        }
        return this.f86766e;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    /* renamed from: a */
    public final v90 mo26484a(int i) {
        return this.f86765d[i];
    }

    @Override // com.yandex.mobile.ads.impl.z02
    /* renamed from: b */
    public final int mo26482b(int i) {
        return this.f86764c[i];
    }

    @Override // com.yandex.mobile.ads.impl.z02
    /* renamed from: c */
    public final int mo26481c(int i) {
        for (int i2 = 0; i2 < this.f86763b; i2++) {
            if (this.f86764c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    /* renamed from: a */
    public final v02 mo26485a() {
        return this.f86762a;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    /* renamed from: b */
    public final int mo26483b() {
        return this.f86764c.length;
    }

    /* renamed from: a */
    public static /* synthetic */ int m28303a(v90 v90Var, v90 v90Var2) {
        return v90Var2.f86619i - v90Var.f86619i;
    }

    @Override // com.yandex.mobile.ads.impl.v40
    /* renamed from: d */
    public void mo28300d() {
    }
}
