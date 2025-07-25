package com.bytedance.adsdk.p183IL;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.bytedance.adsdk.IL.yDt */
/* loaded from: classes3.dex */
public class C6872yDt<K, V> {

    /* renamed from: IL */
    private int f14766IL;

    /* renamed from: Kg */
    private int f14767Kg;

    /* renamed from: bX */
    private int f14768bX;

    /* renamed from: bg */
    private final LinkedHashMap<K, V> f14769bg;
    private int eqN;

    /* renamed from: iR */
    private int f14770iR;
    private int ldr;

    /* renamed from: zx */
    private int f14771zx;

    public C6872yDt(int i) {
        if (i > 0) {
            this.f14768bX = i;
            this.f14769bg = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: bX */
    private int m90588bX(K k, V v) {
        int m90589IL = m90589IL(k, v);
        if (m90589IL >= 0) {
            return m90589IL;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: IL */
    protected int m90589IL(K k, V v) {
        return 1;
    }

    /* renamed from: bg */
    public final V m90586bg(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f14769bg.get(k);
                if (v != null) {
                    this.f14770iR++;
                    return v;
                }
                this.f14767Kg++;
                V m90590IL = m90590IL(k);
                if (m90590IL == null) {
                    return null;
                }
                synchronized (this) {
                    this.f14771zx++;
                    put = this.f14769bg.put(k, m90590IL);
                    if (put != null) {
                        this.f14769bg.put(k, put);
                    } else {
                        this.f14766IL += m90588bX(k, m90590IL);
                    }
                }
                if (put != null) {
                    return put;
                }
                m90587bg(this.f14768bX);
                return m90590IL;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f14770iR;
        int i3 = this.f14767Kg + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f14768bX), Integer.valueOf(this.f14770iR), Integer.valueOf(this.f14767Kg), Integer.valueOf(i));
    }

    /* renamed from: IL */
    protected V m90590IL(K k) {
        return null;
    }

    /* renamed from: bg */
    public final V m90585bg(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.eqN++;
                this.f14766IL += m90588bX(k, v);
                put = this.f14769bg.put(k, v);
                if (put != null) {
                    this.f14766IL -= m90588bX(k, put);
                }
            }
            m90587bg(this.f14768bX);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m90587bg(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f14766IL     // Catch: java.lang.Throwable -> L6d
            if (r0 < 0) goto L4e
            java.util.LinkedHashMap<K, V> r0 = r3.f14769bg     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L11
            int r0 = r3.f14766IL     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L4e
        L11:
            int r0 = r3.f14766IL     // Catch: java.lang.Throwable -> L6d
            if (r0 <= r4) goto L4c
            java.util.LinkedHashMap<K, V> r0 = r3.f14769bg     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L1e
            goto L4c
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.f14769bg     // Catch: java.lang.Throwable -> L6d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap<K, V> r2 = r3.f14769bg     // Catch: java.lang.Throwable -> L6d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6d
            int r2 = r3.f14766IL     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.m90588bX(r1, r0)     // Catch: java.lang.Throwable -> L6d
            int r2 = r2 - r0
            r3.f14766IL = r2     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.ldr     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + 1
            r3.ldr = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            goto L0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            return
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6d
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r4     // Catch: java.lang.Throwable -> L6d
        L6d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.p183IL.C6872yDt.m90587bg(int):void");
    }
}
