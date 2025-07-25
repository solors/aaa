package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import com.google.common.util.concurrent.Striped;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class Striped<L> {

    /* loaded from: classes4.dex */
    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {

        /* renamed from: b */
        private final Object[] f41951b;

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            return (L) this.f41951b[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f41951b.length;
        }

        private CompactStriped(int i, Supplier<L> supplier) {
            super(i);
            int i2 = 0;
            Preconditions.checkArgument(i <= 1073741824, "Stripes must be <= 2^30)");
            this.f41951b = new Object[this.f41955a + 1];
            while (true) {
                Object[] objArr = this.f41951b;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = supplier.get();
                i2++;
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {

        /* renamed from: b */
        final ConcurrentMap<Integer, L> f41952b;

        /* renamed from: c */
        final Supplier<L> f41953c;

        /* renamed from: d */
        final int f41954d;

        LargeLazyStriped(int i, Supplier<L> supplier) {
            super(i);
            int i2;
            int i3 = this.f41955a;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f41954d = i2;
            this.f41953c = supplier;
            this.f41952b = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.f41954d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            L l = this.f41952b.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.f41953c.get();
            return (L) MoreObjects.firstNonNull(this.f41952b.putIfAbsent(Integer.valueOf(i), l2), l2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f41954d;
        }
    }

    /* loaded from: classes4.dex */
    public static class PaddedLock extends ReentrantLock {
        public PaddedLock() {
            super(false);
        }
    }

    /* loaded from: classes4.dex */
    public static class PaddedSemaphore extends Semaphore {
        PaddedSemaphore(int i) {
            super(i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {

        /* renamed from: a */
        final int f41955a;

        PowerOfTwoStriped(int i) {
            super();
            boolean z;
            int m67462f;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Stripes must be positive");
            if (i > 1073741824) {
                m67462f = -1;
            } else {
                m67462f = Striped.m67462f(i) - 1;
            }
            this.f41955a = m67462f;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(mo67455h(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        /* renamed from: h */
        final int mo67455h(Object obj) {
            return Striped.m67456m(obj.hashCode()) & this.f41955a;
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {

        /* renamed from: b */
        final AtomicReferenceArray<ArrayReference<? extends L>> f41956b;

        /* renamed from: c */
        final Supplier<L> f41957c;

        /* renamed from: d */
        final int f41958d;

        /* renamed from: e */
        final ReferenceQueue<L> f41959e;

        /* loaded from: classes4.dex */
        public static final class ArrayReference<L> extends WeakReference<L> {

            /* renamed from: a */
            final int f41960a;

            ArrayReference(L l, int i, ReferenceQueue<L> referenceQueue) {
                super(l, referenceQueue);
                this.f41960a = i;
            }
        }

        SmallLazyStriped(int i, Supplier<L> supplier) {
            super(i);
            int i2;
            this.f41959e = new ReferenceQueue<>();
            int i3 = this.f41955a;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f41958d = i2;
            this.f41956b = new AtomicReferenceArray<>(i2);
            this.f41957c = supplier;
        }

        /* renamed from: n */
        private void m67454n() {
            while (true) {
                Reference<? extends L> poll = this.f41959e.poll();
                if (poll != null) {
                    ArrayReference arrayReference = (ArrayReference) poll;
                    C17170p.m67426a(this.f41956b, arrayReference.f41960a, arrayReference, null);
                } else {
                    return;
                }
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            L l;
            L l2;
            if (this.f41958d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            ArrayReference<? extends L> arrayReference = this.f41956b.get(i);
            if (arrayReference == null) {
                l = null;
            } else {
                l = arrayReference.get();
            }
            if (l != null) {
                return l;
            }
            L l3 = this.f41957c.get();
            ArrayReference arrayReference2 = new ArrayReference(l3, i, this.f41959e);
            while (!C17170p.m67426a(this.f41956b, i, arrayReference, arrayReference2)) {
                arrayReference = this.f41956b.get(i);
                if (arrayReference == null) {
                    l2 = null;
                    continue;
                } else {
                    l2 = arrayReference.get();
                    continue;
                }
                if (l2 != null) {
                    return l2;
                }
            }
            m67454n();
            return l3;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f41958d;
        }
    }

    /* loaded from: classes4.dex */
    private static final class WeakSafeCondition extends ForwardingCondition {

        /* renamed from: a */
        private final Condition f41961a;

        /* renamed from: b */
        private final WeakSafeReadWriteLock f41962b;

        WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f41961a = condition;
            this.f41962b = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        /* renamed from: a */
        Condition mo67453a() {
            return this.f41961a;
        }
    }

    /* loaded from: classes4.dex */
    private static final class WeakSafeLock extends ForwardingLock {

        /* renamed from: b */
        private final Lock f41963b;

        /* renamed from: c */
        private final WeakSafeReadWriteLock f41964c;

        WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f41963b = lock;
            this.f41964c = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        /* renamed from: a */
        Lock mo67452a() {
            return this.f41963b;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.f41963b.newCondition(), this.f41964c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class WeakSafeReadWriteLock implements ReadWriteLock {

        /* renamed from: b */
        private final ReadWriteLock f41965b = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.f41965b.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.f41965b.writeLock(), this);
        }
    }

    private Striped() {
    }

    /* renamed from: f */
    public static int m67462f(int i) {
        return 1 << IntMath.log2(i, RoundingMode.CEILING);
    }

    /* renamed from: g */
    static <L> Striped<L> m67461g(int i, Supplier<L> supplier) {
        return new CompactStriped(i, supplier);
    }

    /* renamed from: i */
    public static /* synthetic */ Lock m67460i() {
        return new ReentrantLock(false);
    }

    /* renamed from: j */
    public static /* synthetic */ Semaphore m67459j(int i) {
        return new Semaphore(i, false);
    }

    /* renamed from: k */
    public static /* synthetic */ Semaphore m67458k(int i) {
        return new PaddedSemaphore(i);
    }

    /* renamed from: l */
    private static <L> Striped<L> m67457l(int i, Supplier<L> supplier) {
        if (i < 1024) {
            return new SmallLazyStriped(i, supplier);
        }
        return new LargeLazyStriped(i, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i) {
        return m67457l(i, new Supplier() { // from class: com.google.common.util.concurrent.n
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Lock m67460i;
                m67460i = Striped.m67460i();
                return m67460i;
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i) {
        return m67457l(i, new Supplier() { // from class: com.google.common.util.concurrent.l
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.WeakSafeReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i, final int i2) {
        return m67457l(i, new Supplier() { // from class: com.google.common.util.concurrent.k
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Semaphore m67459j;
                m67459j = Striped.m67459j(i2);
                return m67459j;
            }
        });
    }

    public static Striped<Lock> lock(int i) {
        return m67461g(i, new Supplier() { // from class: com.google.common.util.concurrent.o
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    /* renamed from: m */
    public static int m67456m(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public static Striped<ReadWriteLock> readWriteLock(int i) {
        return m67461g(i, new Supplier() { // from class: com.google.common.util.concurrent.m
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> semaphore(int i, final int i2) {
        return m67461g(i, new Supplier() { // from class: com.google.common.util.concurrent.j
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Semaphore m67458k;
                m67458k = Striped.m67458k(i2);
                return m67458k;
            }
        });
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList newArrayList = Lists.newArrayList(iterable);
        if (newArrayList.isEmpty()) {
            return ImmutableList.m69424of();
        }
        int[] iArr = new int[newArrayList.size()];
        for (int i = 0; i < newArrayList.size(); i++) {
            iArr[i] = mo67455h(newArrayList.get(i));
        }
        Arrays.sort(iArr);
        int i2 = iArr[0];
        newArrayList.set(0, getAt(i2));
        for (int i3 = 1; i3 < newArrayList.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                newArrayList.set(i3, newArrayList.get(i3 - 1));
            } else {
                newArrayList.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return Collections.unmodifiableList(newArrayList);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i);

    /* renamed from: h */
    abstract int mo67455h(Object obj);

    public abstract int size();
}
