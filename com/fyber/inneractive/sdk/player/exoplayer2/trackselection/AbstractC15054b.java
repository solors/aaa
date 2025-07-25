package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C15046y;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b */
/* loaded from: classes4.dex */
public abstract class AbstractC15054b {

    /* renamed from: a */
    public final C15046y f29595a;

    /* renamed from: b */
    public final int f29596b;

    /* renamed from: c */
    public final int[] f29597c;

    /* renamed from: d */
    public final C15014o[] f29598d;

    /* renamed from: e */
    public final long[] f29599e;

    /* renamed from: f */
    public int f29600f;

    public AbstractC15054b(C15046y c15046y, int... iArr) {
        if (iArr.length > 0) {
            c15046y.getClass();
            this.f29595a = c15046y;
            int length = iArr.length;
            this.f29596b = length;
            this.f29598d = new C15014o[length];
            int i = 0;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f29598d[i2] = c15046y.f29584b[iArr[i2]];
            }
            Arrays.sort(this.f29598d, new C15053a());
            this.f29597c = new int[this.f29596b];
            while (true) {
                int i3 = this.f29596b;
                if (i < i3) {
                    this.f29597c[i] = c15046y.m77277a(this.f29598d[i]);
                    i++;
                } else {
                    this.f29599e = new long[i3];
                    return;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public abstract int mo77272a();

    /* renamed from: a */
    public final boolean m77274a(int i) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f29599e[i] > elapsedRealtime) {
            z = true;
        } else {
            z = false;
        }
        for (int i2 = 0; i2 < this.f29596b && !z; i2++) {
            if (i2 != i && this.f29599e[i2] <= elapsedRealtime) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        long[] jArr = this.f29599e;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + 60000);
        return true;
    }

    /* renamed from: b */
    public abstract Object mo77271b();

    /* renamed from: c */
    public abstract int mo77270c();

    /* renamed from: d */
    public abstract void mo77269d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC15054b abstractC15054b = (AbstractC15054b) obj;
        if (this.f29595a == abstractC15054b.f29595a && Arrays.equals(this.f29597c, abstractC15054b.f29597c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29600f == 0) {
            this.f29600f = Arrays.hashCode(this.f29597c) + (System.identityHashCode(this.f29595a) * 31);
        }
        return this.f29600f;
    }
}
