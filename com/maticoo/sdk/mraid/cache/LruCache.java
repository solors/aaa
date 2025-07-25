package com.maticoo.sdk.mraid.cache;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.maticoo.sdk.mraid.utils.Utils;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public class LruCache implements Cache {
    private int evictionCount;
    private int hitCount;
    final LinkedHashMap<String, Bitmap> map;
    private final int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(@NonNull Context context) {
        this(Util.calculateMemoryCacheSize(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void trimToSize(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.size     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.map     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r3.size     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r3.size     // Catch: java.lang.Throwable -> L71
            if (r0 <= r4) goto L50
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.map     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.map     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.map     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r1 = r3.size     // Catch: java.lang.Throwable -> L71
            int r0 = com.maticoo.sdk.mraid.utils.Utils.getBitmapBytes(r0)     // Catch: java.lang.Throwable -> L71
            int r1 = r1 - r0
            r3.size = r1     // Catch: java.lang.Throwable -> L71
            int r0 = r3.evictionCount     // Catch: java.lang.Throwable -> L71
            int r0 = r0 + 1
            r3.evictionCount = r0     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L0
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r4     // Catch: java.lang.Throwable -> L71
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maticoo.sdk.mraid.cache.LruCache.trimToSize(int):void");
    }

    @Override // com.maticoo.sdk.mraid.cache.Cache
    public final synchronized void clear() {
        evictAll();
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    @Override // com.maticoo.sdk.mraid.cache.Cache
    public Bitmap get(@NonNull String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.map.get(str);
                if (bitmap != null) {
                    this.hitCount++;
                    return bitmap;
                }
                this.missCount++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    @Override // com.maticoo.sdk.mraid.cache.Cache
    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    @Override // com.maticoo.sdk.mraid.cache.Cache
    public void set(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int bitmapBytes = Utils.getBitmapBytes(bitmap);
            if (bitmapBytes > this.maxSize) {
                return;
            }
            synchronized (this) {
                this.putCount++;
                this.size += bitmapBytes;
                Bitmap put = this.map.put(str, bitmap);
                if (put != null) {
                    this.size -= Utils.getBitmapBytes(put);
                }
            }
            trimToSize(this.maxSize);
            return;
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // com.maticoo.sdk.mraid.cache.Cache
    public final synchronized int size() {
        return this.size;
    }

    public LruCache(int i) {
        if (i > 0) {
            this.maxSize = i;
            this.map = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    @Override // com.maticoo.sdk.mraid.cache.Cache
    public void clearKeyUri(String str) {
    }
}
