package com.bytedance.sdk.component.p275zx.p277bX.p280bg;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.bX */
/* loaded from: classes3.dex */
public class C7807bX<K, V> {

    /* renamed from: IL */
    private int f17025IL;

    /* renamed from: Kg */
    private int f17026Kg;

    /* renamed from: bX */
    private int f17027bX;

    /* renamed from: bg */
    private final LinkedHashMap<K, SoftReference<V>> f17028bg;
    private int eqN;

    /* renamed from: iR */
    private int f17029iR;
    private int ldr;

    /* renamed from: zx */
    private int f17030zx;

    public C7807bX(int i) {
        if (i > 0) {
            this.f17027bX = i;
            this.f17028bg = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: bX */
    private int m87692bX(K k, V v) {
        int mo87693IL = mo87693IL(k, v);
        if (mo87693IL >= 0) {
            return mo87693IL;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: IL */
    protected int mo87693IL(K k, V v) {
        return 1;
    }

    /* renamed from: bg */
    public final V m87690bg(K k) {
        V v;
        if (k != null) {
            synchronized (this) {
                SoftReference<V> softReference = this.f17028bg.get(k);
                if (softReference != null) {
                    v = softReference.get();
                    if (v != null) {
                        this.f17029iR++;
                        return v;
                    }
                    this.f17028bg.remove(k);
                } else {
                    v = null;
                }
                this.f17026Kg++;
                V m87694IL = m87694IL(k);
                if (m87694IL == null) {
                    return null;
                }
                synchronized (this) {
                    this.f17030zx++;
                    SoftReference<V> put = this.f17028bg.put(k, new SoftReference<>(m87694IL));
                    if (put != null) {
                        v = put.get();
                    }
                    if (v != null) {
                        this.f17028bg.put(k, put);
                    } else {
                        this.f17025IL += m87692bX(k, m87694IL);
                    }
                }
                if (v != null) {
                    return v;
                }
                m87691bg(this.f17027bX);
                return m87694IL;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f17029iR;
        int i3 = this.f17026Kg + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f17027bX), Integer.valueOf(this.f17029iR), Integer.valueOf(this.f17026Kg), Integer.valueOf(i));
    }

    /* renamed from: IL */
    protected V m87694IL(K k) {
        return null;
    }

    /* renamed from: bg */
    public final V m87689bg(K k, V v) {
        V v2;
        if (k != null && v != null) {
            synchronized (this) {
                this.eqN++;
                this.f17025IL += m87692bX(k, v);
                SoftReference<V> put = this.f17028bg.put(k, new SoftReference<>(v));
                if (put != null) {
                    v2 = put.get();
                    if (v2 != null) {
                        this.f17025IL -= m87692bX(k, v2);
                    }
                } else {
                    v2 = null;
                }
            }
            m87691bg(this.f17027bX);
            return v2;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.f17025IL + ", maxSize: " + r4);
        r3.f17025IL = 0;
        r3.f17028bg.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        return;
     */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m87691bg(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f17025IL     // Catch: java.lang.Throwable -> L79
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.f17028bg     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            int r0 = r3.f17025IL     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            goto L52
        L12:
            int r0 = r3.f17025IL     // Catch: java.lang.Throwable -> L79
            if (r0 > r4) goto L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L18:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.f17028bg     // Catch: java.lang.Throwable -> L79
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L79
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L2c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L79
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.f17028bg     // Catch: java.lang.Throwable -> L79
            r2.remove(r1)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L79
            int r2 = r3.f17025IL     // Catch: java.lang.Throwable -> L79
            int r0 = r3.m87692bX(r1, r0)     // Catch: java.lang.Throwable -> L79
            int r2 = r2 - r0
            r3.f17025IL = r2     // Catch: java.lang.Throwable -> L79
        L4a:
            int r0 = r3.ldr     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + 1
            r3.ldr = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            goto L0
        L52:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79
            int r2 = r3.f17025IL     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            r1.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L79
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r3.f17025IL = r4     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.f17028bg     // Catch: java.lang.Throwable -> L79
            r4.clear()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7807bX.m87691bg(int):void");
    }
}
