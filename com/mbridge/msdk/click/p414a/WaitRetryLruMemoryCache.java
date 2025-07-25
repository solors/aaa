package com.mbridge.msdk.click.p414a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: com.mbridge.msdk.click.a.c */
/* loaded from: classes6.dex */
public final class WaitRetryLruMemoryCache {

    /* renamed from: a */
    private final LinkedHashMap<String, RetryUrlRecordData> f55348a;

    /* renamed from: b */
    private final int f55349b;

    /* renamed from: c */
    private int f55350c;

    public WaitRetryLruMemoryCache(int i) {
        if (i > 0) {
            this.f55349b = i;
            this.f55348a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final RetryUrlRecordData m53178a(String str) {
        if (str != null) {
            synchronized (this) {
                RetryUrlRecordData retryUrlRecordData = this.f55348a.get(str);
                if (retryUrlRecordData != null) {
                    return retryUrlRecordData;
                }
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final void m53176b(String str) {
        if (str != null) {
            synchronized (this) {
                if (this.f55348a.remove(str) != null) {
                    this.f55350c--;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f55349b));
    }

    /* renamed from: a */
    public final boolean m53177a(String str, RetryUrlRecordData retryUrlRecordData) {
        if (str != null && retryUrlRecordData != null) {
            synchronized (this) {
                this.f55350c++;
                if (this.f55348a.put(str, retryUrlRecordData) != null) {
                    this.f55350c--;
                }
            }
            m53179a(this.f55349b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        throw new java.lang.IllegalStateException(com.mbridge.msdk.click.p414a.WaitRetryLruMemoryCache.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m53179a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f55350c     // Catch: java.lang.Throwable -> L6a
            if (r0 < 0) goto L4d
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f55348a     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L11
            int r0 = r2.f55350c     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L4d
        L11:
            int r0 = r2.f55350c     // Catch: java.lang.Throwable -> L6a
            if (r0 <= r3) goto L4b
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f55348a     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L1e
            goto L4b
        L1e:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f55348a     // Catch: java.lang.Throwable -> L6a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6a
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            goto L4c
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6a
            com.mbridge.msdk.click.a.b r0 = (com.mbridge.msdk.click.p414a.RetryUrlRecordData) r0     // Catch: java.lang.Throwable -> L6a
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f55348a     // Catch: java.lang.Throwable -> L49
            r0.remove(r1)     // Catch: java.lang.Throwable -> L49
            int r0 = r2.f55350c     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + (-1)
            r2.f55350c = r0     // Catch: java.lang.Throwable -> L49
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            goto L0
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
        L4c:
            return
        L4d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.Class<com.mbridge.msdk.click.a.c> r1 = com.mbridge.msdk.click.p414a.WaitRetryLruMemoryCache.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6a
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            throw r3     // Catch: java.lang.Throwable -> L6a
        L6a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p414a.WaitRetryLruMemoryCache.m53179a(int):void");
    }

    /* renamed from: a */
    public final Collection<String> m53180a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f55348a.keySet());
        }
        return hashSet;
    }
}
