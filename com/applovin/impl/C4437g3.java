package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;
import java.util.Arrays;

/* renamed from: com.applovin.impl.g3 */
/* loaded from: classes2.dex */
public final class C4437g3 implements InterfaceC4591ij {

    /* renamed from: a */
    public final int f6285a;

    /* renamed from: b */
    public final int[] f6286b;

    /* renamed from: c */
    public final long[] f6287c;

    /* renamed from: d */
    public final long[] f6288d;

    /* renamed from: e */
    public final long[] f6289e;

    /* renamed from: f */
    private final long f6290f;

    public C4437g3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6286b = iArr;
        this.f6287c = jArr;
        this.f6288d = jArr2;
        this.f6289e = jArr3;
        int length = iArr.length;
        this.f6285a = length;
        if (length > 0) {
            int i = length - 1;
            this.f6290f = jArr2[i] + jArr3[i];
            return;
        }
        this.f6290f = 0L;
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return true;
    }

    /* renamed from: c */
    public int m99026c(long j) {
        return AbstractC5863xp.m92980b(this.f6289e, j, true, true);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f6290f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f6285a + ", sizes=" + Arrays.toString(this.f6286b) + ", offsets=" + Arrays.toString(this.f6287c) + ", timeUs=" + Arrays.toString(this.f6289e) + ", durationsUs=" + Arrays.toString(this.f6288d) + ")";
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        int m99026c = m99026c(j);
        C4719kj c4719kj = new C4719kj(this.f6289e[m99026c], this.f6287c[m99026c]);
        if (c4719kj.f7553a < j && m99026c != this.f6285a - 1) {
            int i = m99026c + 1;
            return new InterfaceC4591ij.C4592a(c4719kj, new C4719kj(this.f6289e[i], this.f6287c[i]));
        }
        return new InterfaceC4591ij.C4592a(c4719kj);
    }
}
