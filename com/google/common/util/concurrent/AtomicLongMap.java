package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class AtomicLongMap<K> implements Serializable {

    /* renamed from: b */
    private final ConcurrentHashMap<K, AtomicLong> f41708b;

    /* renamed from: c */
    private transient Map<K, Long> f41709c;

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.f41708b = (ConcurrentHashMap) Preconditions.checkNotNull(concurrentHashMap);
    }

    /* renamed from: a */
    private Map<K, Long> m67689a() {
        return Collections.unmodifiableMap(Maps.transformValues(this.f41708b, new Function<AtomicLong, Long>(this) { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.f41708b.get(k);
            if (atomicLong == null && (atomicLong = this.f41708b.putIfAbsent(k, new AtomicLong(j))) == null) {
                return j;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 == 0) {
                    break;
                }
                long j3 = j2 + j;
                if (atomicLong.compareAndSet(j2, j3)) {
                    return j3;
                }
            }
        } while (!this.f41708b.replace(k, atomicLong, new AtomicLong(j)));
        return j;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.f41709c;
        if (map == null) {
            Map<K, Long> m67689a = m67689a();
            this.f41709c = m67689a;
            return m67689a;
        }
        return map;
    }

    /* renamed from: b */
    boolean m67688b(K k, long j) {
        AtomicLong atomicLong = this.f41708b.get(k);
        if (atomicLong == null) {
            return false;
        }
        long j2 = atomicLong.get();
        if (j2 != j) {
            return false;
        }
        if (j2 != 0 && !atomicLong.compareAndSet(j2, 0L)) {
            return false;
        }
        this.f41708b.remove(k, atomicLong);
        return true;
    }

    public void clear() {
        this.f41708b.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f41708b.containsKey(obj);
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k) {
        return addAndGet(k, -1L);
    }

    public long get(K k) {
        AtomicLong atomicLong = this.f41708b.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.f41708b.get(k);
            if (atomicLong == null && (atomicLong = this.f41708b.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 == 0) {
                    break;
                } else if (atomicLong.compareAndSet(j2, j2 + j)) {
                    return j2;
                }
            }
        } while (!this.f41708b.replace(k, atomicLong, new AtomicLong(j)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k) {
        return getAndAdd(k, -1L);
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k) {
        return getAndAdd(k, 1L);
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k) {
        return addAndGet(k, 1L);
    }

    public boolean isEmpty() {
        return this.f41708b.isEmpty();
    }

    @CanIgnoreReturnValue
    public long put(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.f41708b.get(k);
            if (atomicLong == null && (atomicLong = this.f41708b.putIfAbsent(k, new AtomicLong(j))) == null) {
                return 0L;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 == 0) {
                    break;
                } else if (atomicLong.compareAndSet(j2, j)) {
                    return j2;
                }
            }
        } while (!this.f41708b.replace(k, atomicLong, new AtomicLong(j)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    @CanIgnoreReturnValue
    public long remove(K k) {
        long j;
        AtomicLong atomicLong = this.f41708b.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0L));
        this.f41708b.remove(k, atomicLong);
        return j;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.f41708b.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @CanIgnoreReturnValue
    @Beta
    public boolean removeIfZero(K k) {
        return m67688b(k, 0L);
    }

    public int size() {
        return this.f41708b.size();
    }

    public long sum() {
        long j = 0;
        for (AtomicLong atomicLong : this.f41708b.values()) {
            j += atomicLong.get();
        }
        return j;
    }

    public String toString() {
        return this.f41708b.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> create = create();
        create.putAll(map);
        return create;
    }
}
