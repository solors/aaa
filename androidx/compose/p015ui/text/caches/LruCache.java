package androidx.compose.p015ui.text.caches;

import androidx.compose.p015ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p015ui.text.platform.SynchronizedObject;
import com.ironsource.C20517nb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LruCache.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.caches.LruCache */
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    @NotNull
    private final LinkedHashSet<K> keySet;
    @NotNull
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;
    @NotNull
    private final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    public LruCache(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.maxSize = i;
            this.map = new HashMap<>(0, 0.75f);
            this.keySet = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final int safeSizeOf(K k, V v) {
        boolean z;
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k + C20517nb.f52173T + v).toString());
    }

    @Nullable
    protected V create(K k) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.monitor) {
            i = this.createCount;
        }
        return i;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.monitor) {
            i = this.evictionCount;
        }
        return i;
    }

    @Nullable
    public final V get(K k) {
        synchronized (this.monitor) {
            V v = this.map.get(k);
            if (v != null) {
                this.keySet.remove(k);
                this.keySet.add(k);
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V create = create(k);
            if (create == null) {
                return null;
            }
            synchronized (this.monitor) {
                this.createCount++;
                V put = this.map.put(k, create);
                this.keySet.remove(k);
                this.keySet.add(k);
                if (put != null) {
                    this.map.put(k, put);
                    v = put;
                } else {
                    this.size = size() + safeSizeOf(k, create);
                }
                Unit unit = Unit.f99208a;
            }
            if (v != null) {
                entryRemoved(false, k, create, v);
                return v;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.monitor) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.monitor) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.monitor) {
            i = this.missCount;
        }
        return i;
    }

    @Nullable
    public final V put(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this.monitor) {
                this.putCount++;
                this.size = size() + safeSizeOf(k, v);
                put = this.map.put(k, v);
                if (put != null) {
                    this.size = size() - safeSizeOf(k, put);
                }
                if (this.keySet.contains(k)) {
                    this.keySet.remove(k);
                }
                this.keySet.add(k);
            }
            if (put != null) {
                entryRemoved(false, k, put, v);
            }
            trimToSize(this.maxSize);
            return put;
        }
        throw null;
    }

    public final int putCount() {
        int i;
        synchronized (this.monitor) {
            i = this.putCount;
        }
        return i;
    }

    @Nullable
    public final V remove(K k) {
        V remove;
        k.getClass();
        synchronized (this.monitor) {
            remove = this.map.remove(k);
            this.keySet.remove(k);
            if (remove != null) {
                this.size = size() - safeSizeOf(k, remove);
            }
            Unit unit = Unit.f99208a;
        }
        if (remove != null) {
            entryRemoved(false, k, remove, null);
        }
        return remove;
    }

    public void resize(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this.monitor) {
                this.maxSize = i;
                Unit unit = Unit.f99208a;
            }
            trimToSize(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public final int size() {
        int i;
        synchronized (this.monitor) {
            i = this.size;
        }
        return i;
    }

    protected int sizeOf(K k, V v) {
        return 1;
    }

    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.keySet.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v = this.map.get(next);
                Intrinsics.m17074g(v);
                linkedHashMap.put(next, v);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(@NotNull Functions<? extends R> block) {
        R invoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.monitor) {
            try {
                invoke = block.invoke();
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        return invoke;
    }

    @NotNull
    public String toString() {
        int i;
        String str;
        synchronized (this.monitor) {
            int i2 = this.hitCount;
            int i3 = this.missCount + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            if (r1 < 0) goto L89
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L17
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L89
        L17:
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch: java.lang.Throwable -> L91
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != r2) goto L89
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L74
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L74
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch: java.lang.Throwable -> L91
            java.lang.Object r1 = kotlin.collections.C37561t.m17198o0(r1)     // Catch: java.lang.Throwable -> L91
            java.util.HashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L91
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L6c
            java.util.HashMap<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L91
            java.util.Map r5 = kotlin.jvm.internal.TypeIntrinsics.m17007d(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch: java.lang.Throwable -> L91
            java.util.Collection r5 = kotlin.jvm.internal.TypeIntrinsics.m17010a(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L91
            kotlin.jvm.internal.Intrinsics.m17074g(r1)     // Catch: java.lang.Throwable -> L91
            kotlin.jvm.internal.Intrinsics.m17074g(r4)     // Catch: java.lang.Throwable -> L91
            int r6 = r7.safeSizeOf(r1, r4)     // Catch: java.lang.Throwable -> L91
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L91
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L91
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L91
            goto L76
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L74:
            r1 = r3
            r4 = r1
        L76:
            kotlin.Unit r5 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)
            if (r1 != 0) goto L7e
            if (r4 != 0) goto L7e
            return
        L7e:
            kotlin.jvm.internal.Intrinsics.m17074g(r1)
            kotlin.jvm.internal.Intrinsics.m17074g(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L0
        L89:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.caches.LruCache.trimToSize(int):void");
    }

    protected void entryRemoved(boolean z, K k, V v, @Nullable V v2) {
    }
}
