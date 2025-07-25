package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class TimedValueQueue<V> {

    /* renamed from: a */
    private long[] f36169a;

    /* renamed from: b */
    private V[] f36170b;

    /* renamed from: c */
    private int f36171c;

    /* renamed from: d */
    private int f36172d;

    public TimedValueQueue() {
        this(10);
    }

    /* renamed from: a */
    private void m72548a(long j, V v) {
        int i = this.f36171c;
        int i2 = this.f36172d;
        V[] vArr = this.f36170b;
        int length = (i + i2) % vArr.length;
        this.f36169a[length] = j;
        vArr[length] = v;
        this.f36172d = i2 + 1;
    }

    /* renamed from: b */
    private void m72547b(long j) {
        int i = this.f36172d;
        if (i > 0) {
            if (j <= this.f36169a[((this.f36171c + i) - 1) % this.f36170b.length]) {
                clear();
            }
        }
    }

    /* renamed from: c */
    private void m72546c() {
        int length = this.f36170b.length;
        if (this.f36172d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) m72545d(i);
        int i2 = this.f36171c;
        int i3 = length - i2;
        System.arraycopy(this.f36169a, i2, jArr, 0, i3);
        System.arraycopy(this.f36170b, this.f36171c, vArr, 0, i3);
        int i4 = this.f36171c;
        if (i4 > 0) {
            System.arraycopy(this.f36169a, 0, jArr, i3, i4);
            System.arraycopy(this.f36170b, 0, vArr, i3, this.f36171c);
        }
        this.f36169a = jArr;
        this.f36170b = vArr;
        this.f36171c = 0;
    }

    /* renamed from: d */
    private static <V> V[] m72545d(int i) {
        return (V[]) new Object[i];
    }

    @Nullable
    /* renamed from: e */
    private V m72544e(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f36172d > 0) {
            long j3 = j - this.f36169a[this.f36171c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m72543f();
            j2 = j3;
        }
        return v;
    }

    @Nullable
    /* renamed from: f */
    private V m72543f() {
        boolean z;
        if (this.f36172d > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        V[] vArr = this.f36170b;
        int i = this.f36171c;
        V v = vArr[i];
        vArr[i] = null;
        this.f36171c = (i + 1) % vArr.length;
        this.f36172d--;
        return v;
    }

    public synchronized void add(long j, V v) {
        m72547b(j);
        m72546c();
        m72548a(j, v);
    }

    public synchronized void clear() {
        this.f36171c = 0;
        this.f36172d = 0;
        Arrays.fill(this.f36170b, (Object) null);
    }

    @Nullable
    public synchronized V poll(long j) {
        return m72544e(j, false);
    }

    @Nullable
    public synchronized V pollFirst() {
        V m72543f;
        if (this.f36172d == 0) {
            m72543f = null;
        } else {
            m72543f = m72543f();
        }
        return m72543f;
    }

    @Nullable
    public synchronized V pollFloor(long j) {
        return m72544e(j, true);
    }

    public synchronized int size() {
        return this.f36172d;
    }

    public TimedValueQueue(int i) {
        this.f36169a = new long[i];
        this.f36170b = (V[]) m72545d(i);
    }
}
