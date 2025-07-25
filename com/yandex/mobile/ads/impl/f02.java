package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class f02<V> {

    /* renamed from: a */
    private long[] f78856a;

    /* renamed from: b */
    private V[] f78857b;

    /* renamed from: c */
    private int f78858c;

    /* renamed from: d */
    private int f78859d;

    public f02() {
        this(0);
    }

    /* renamed from: b */
    private static Object[] m34398b() {
        return new Object[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final synchronized void m34399a(Object obj, long j) {
        int i = this.f78859d;
        if (i > 0) {
            if (j <= this.f78856a[((this.f78858c + i) - 1) % this.f78857b.length]) {
                m34401a();
            }
        }
        int length = this.f78857b.length;
        if (this.f78859d >= length) {
            int i2 = length * 2;
            long[] jArr = new long[i2];
            V[] vArr = (V[]) new Object[i2];
            int i3 = this.f78858c;
            int i4 = length - i3;
            System.arraycopy(this.f78856a, i3, jArr, 0, i4);
            System.arraycopy(this.f78857b, this.f78858c, vArr, 0, i4);
            int i5 = this.f78858c;
            if (i5 > 0) {
                System.arraycopy(this.f78856a, 0, jArr, i4, i5);
                System.arraycopy(this.f78857b, 0, vArr, i4, this.f78858c);
            }
            this.f78856a = jArr;
            this.f78857b = vArr;
            this.f78858c = 0;
        }
        int i6 = this.f78858c;
        int i7 = this.f78859d;
        V[] vArr2 = this.f78857b;
        int length2 = (i6 + i7) % vArr2.length;
        this.f78856a[length2] = j;
        vArr2[length2] = obj;
        this.f78859d = i7 + 1;
    }

    @Nullable
    /* renamed from: c */
    public final synchronized V m34396c() {
        V v;
        int i = this.f78859d;
        v = null;
        if (i != 0) {
            if (i > 0) {
                V[] vArr = this.f78857b;
                int i2 = this.f78858c;
                V v2 = vArr[i2];
                vArr[i2] = null;
                this.f78858c = (i2 + 1) % vArr.length;
                this.f78859d = i - 1;
                v = v2;
            } else {
                throw new IllegalStateException();
            }
        }
        return v;
    }

    /* renamed from: d */
    public final synchronized int m34395d() {
        return this.f78859d;
    }

    public f02(int i) {
        this.f78856a = new long[10];
        this.f78857b = (V[]) m34398b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        throw new java.lang.IllegalStateException();
     */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized V m34397b(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            r1 = r0
        L3:
            int r2 = r9.f78859d     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L30
            long[] r3 = r9.f78856a     // Catch: java.lang.Throwable -> L32
            int r4 = r9.f78858c     // Catch: java.lang.Throwable -> L32
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L32
            long r5 = r10 - r5
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L16
            goto L30
        L16:
            if (r2 <= 0) goto L2a
            V[] r1 = r9.f78857b     // Catch: java.lang.Throwable -> L32
            r3 = r1[r4]     // Catch: java.lang.Throwable -> L32
            r1[r4] = r0     // Catch: java.lang.Throwable -> L32
            int r4 = r4 + 1
            int r1 = r1.length     // Catch: java.lang.Throwable -> L32
            int r4 = r4 % r1
            r9.f78858c = r4     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + (-1)
            r9.f78859d = r2     // Catch: java.lang.Throwable -> L32
            r1 = r3
            goto L3
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            r10.<init>()     // Catch: java.lang.Throwable -> L32
            throw r10     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r9)
            return r1
        L32:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f02.m34397b(long):java.lang.Object");
    }

    /* renamed from: a */
    public final synchronized void m34401a() {
        this.f78858c = 0;
        this.f78859d = 0;
        Arrays.fill(this.f78857b, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        throw new java.lang.IllegalStateException();
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized V m34400a(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r0
        L8:
            int r4 = r11.f78859d     // Catch: java.lang.Throwable -> L3c
            if (r4 <= 0) goto L3a
            long[] r5 = r11.f78856a     // Catch: java.lang.Throwable -> L3c
            int r6 = r11.f78858c     // Catch: java.lang.Throwable -> L3c
            r7 = r5[r6]     // Catch: java.lang.Throwable -> L3c
            long r7 = r12 - r7
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 >= 0) goto L20
            long r9 = -r7
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 < 0) goto L20
            goto L3a
        L20:
            if (r4 <= 0) goto L34
            V[] r1 = r11.f78857b     // Catch: java.lang.Throwable -> L3c
            r3 = r1[r6]     // Catch: java.lang.Throwable -> L3c
            r1[r6] = r0     // Catch: java.lang.Throwable -> L3c
            int r6 = r6 + 1
            int r1 = r1.length     // Catch: java.lang.Throwable -> L3c
            int r6 = r6 % r1
            r11.f78858c = r6     // Catch: java.lang.Throwable -> L3c
            int r4 = r4 + (-1)
            r11.f78859d = r4     // Catch: java.lang.Throwable -> L3c
            r1 = r7
            goto L8
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            r12.<init>()     // Catch: java.lang.Throwable -> L3c
            throw r12     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r11)
            return r3
        L3c:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f02.m34400a(long):java.lang.Object");
    }
}
