package com.applovin.impl;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.applovin.impl.f2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4375f2 implements InterfaceC4445g8 {

    /* renamed from: a */
    protected final C5078oo f6032a;

    /* renamed from: b */
    protected final int f6033b;

    /* renamed from: c */
    protected final int[] f6034c;

    /* renamed from: d */
    private final int f6035d;

    /* renamed from: e */
    private final C4310e9[] f6036e;

    /* renamed from: f */
    private final long[] f6037f;

    /* renamed from: g */
    private int f6038g;

    public AbstractC4375f2(C5078oo c5078oo, int[] iArr, int i) {
        boolean z;
        int i2 = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        this.f6035d = i;
        this.f6032a = (C5078oo) AbstractC4100b1.m100583a(c5078oo);
        int length = iArr.length;
        this.f6033b = length;
        this.f6036e = new C4310e9[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f6036e[i3] = c5078oo.m96638a(iArr[i3]);
        }
        Arrays.sort(this.f6036e, new Comparator() { // from class: com.applovin.impl.bv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4375f2.m99398b((C4310e9) obj, (C4310e9) obj2);
            }
        });
        this.f6034c = new int[this.f6033b];
        while (true) {
            int i4 = this.f6033b;
            if (i2 < i4) {
                this.f6034c[i2] = c5078oo.m96636a(this.f6036e[i2]);
                i2++;
            } else {
                this.f6037f = new long[i4];
                return;
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ int m99398b(C4310e9 c4310e9, C4310e9 c4310e92) {
        return m99399a(c4310e9, c4310e92);
    }

    @Override // com.applovin.impl.InterfaceC4445g8
    /* renamed from: a */
    public void mo98620a(float f) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC4375f2 abstractC4375f2 = (AbstractC4375f2) obj;
        if (this.f6032a == abstractC4375f2.f6032a && Arrays.equals(this.f6034c, abstractC4375f2.f6034c)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC4445g8
    /* renamed from: g */
    public final C4310e9 mo99005g() {
        return this.f6036e[mo95704h()];
    }

    public int hashCode() {
        if (this.f6038g == 0) {
            this.f6038g = (System.identityHashCode(this.f6032a) * 31) + Arrays.hashCode(this.f6034c);
        }
        return this.f6038g;
    }

    @Override // com.applovin.impl.InterfaceC5522so
    /* renamed from: a */
    public final C4310e9 mo94588a(int i) {
        return this.f6036e[i];
    }

    @Override // com.applovin.impl.InterfaceC5522so
    /* renamed from: b */
    public final int mo94586b(int i) {
        return this.f6034c[i];
    }

    @Override // com.applovin.impl.InterfaceC5522so
    /* renamed from: a */
    public final C5078oo mo94589a() {
        return this.f6032a;
    }

    @Override // com.applovin.impl.InterfaceC5522so
    /* renamed from: b */
    public final int mo94587b() {
        return this.f6034c.length;
    }

    /* renamed from: a */
    public static /* synthetic */ int m99399a(C4310e9 c4310e9, C4310e9 c4310e92) {
        return c4310e92.f5809i - c4310e9.f5809i;
    }

    @Override // com.applovin.impl.InterfaceC4445g8
    /* renamed from: f */
    public void mo98614f() {
    }

    @Override // com.applovin.impl.InterfaceC4445g8
    /* renamed from: i */
    public void mo98613i() {
    }
}
