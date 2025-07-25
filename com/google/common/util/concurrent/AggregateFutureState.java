package com.google.common.util.concurrent;

import androidx.concurrent.futures.C1074a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: classes4.dex */
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {

    /* renamed from: l */
    private static final AtomicHelper f41700l;

    /* renamed from: m */
    private static final Logger f41701m = Logger.getLogger(AggregateFutureState.class.getName());

    /* renamed from: j */
    private volatile Set<Throwable> f41702j = null;

    /* renamed from: k */
    private volatile int f41703k;

    /* loaded from: classes4.dex */
    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        /* renamed from: a */
        abstract void mo67691a(AggregateFutureState<?> aggregateFutureState, Set<Throwable> set, Set<Throwable> set2);

        /* renamed from: b */
        abstract int mo67690b(AggregateFutureState<?> aggregateFutureState);
    }

    /* loaded from: classes4.dex */
    private static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<AggregateFutureState<?>, Set<Throwable>> f41704a;

        /* renamed from: b */
        final AtomicIntegerFieldUpdater<AggregateFutureState<?>> f41705b;

        SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f41704a = atomicReferenceFieldUpdater;
            this.f41705b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        /* renamed from: a */
        void mo67691a(AggregateFutureState<?> aggregateFutureState, Set<Throwable> set, Set<Throwable> set2) {
            C1074a.m105283a(this.f41704a, aggregateFutureState, set, set2);
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        /* renamed from: b */
        int mo67690b(AggregateFutureState<?> aggregateFutureState) {
            return this.f41705b.decrementAndGet(aggregateFutureState);
        }
    }

    /* loaded from: classes4.dex */
    private static final class SynchronizedAtomicHelper extends AtomicHelper {
        private SynchronizedAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        /* renamed from: a */
        void mo67691a(AggregateFutureState<?> aggregateFutureState, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (aggregateFutureState) {
                if (((AggregateFutureState) aggregateFutureState).f41702j == set) {
                    ((AggregateFutureState) aggregateFutureState).f41702j = set2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        /* renamed from: b */
        int mo67690b(AggregateFutureState<?> aggregateFutureState) {
            int m67696E;
            synchronized (aggregateFutureState) {
                m67696E = AggregateFutureState.m67696E(aggregateFutureState);
            }
            return m67696E;
        }
    }

    static {
        AtomicHelper synchronizedAtomicHelper;
        Throwable th = null;
        try {
            synchronizedAtomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, "j"), AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "k"));
        } catch (Throwable th2) {
            synchronizedAtomicHelper = new SynchronizedAtomicHelper();
            th = th2;
        }
        f41700l = synchronizedAtomicHelper;
        if (th != null) {
            f41701m.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AggregateFutureState(int i) {
        this.f41703k = i;
    }

    /* renamed from: E */
    static /* synthetic */ int m67696E(AggregateFutureState aggregateFutureState) {
        int i = aggregateFutureState.f41703k - 1;
        aggregateFutureState.f41703k = i;
        return i;
    }

    /* renamed from: F */
    abstract void mo67695F(Set<Throwable> set);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final void m67694G() {
        this.f41702j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final int m67693H() {
        return f41700l.mo67690b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final Set<Throwable> m67692I() {
        Set<Throwable> set = this.f41702j;
        if (set == null) {
            Set<Throwable> newConcurrentHashSet = Sets.newConcurrentHashSet();
            mo67695F(newConcurrentHashSet);
            f41700l.mo67691a(this, null, newConcurrentHashSet);
            Set<Throwable> set2 = this.f41702j;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }
}
