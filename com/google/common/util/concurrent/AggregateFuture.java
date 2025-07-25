package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {

    /* renamed from: q */
    private static final Logger f41695q = Logger.getLogger(AggregateFuture.class.getName());

    /* renamed from: n */
    private ImmutableCollection<? extends ListenableFuture<? extends InputT>> f41696n;

    /* renamed from: o */
    private final boolean f41697o;

    /* renamed from: p */
    private final boolean f41698p;

    /* loaded from: classes4.dex */
    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AggregateFuture(ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z, boolean z2) {
        super(immutableCollection.size());
        this.f41696n = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.f41697o = z;
        this.f41698p = z2;
    }

    /* renamed from: L */
    private static boolean m67708L(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m67707N(int i, Future<? extends InputT> future) {
        try {
            mo67633M(i, Futures.getDone(future));
        } catch (ExecutionException e) {
            m67705Q(e.getCause());
        } catch (Throwable th) {
            m67705Q(th);
        }
    }

    /* renamed from: O */
    public void m67702T(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        boolean z;
        int m67693H = m67693H();
        if (m67693H >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Less than 0 remaining futures");
        if (m67693H == 0) {
            m67700V(immutableCollection);
        }
    }

    /* renamed from: Q */
    private void m67705Q(Throwable th) {
        Preconditions.checkNotNull(th);
        if (this.f41697o && !setException(th) && m67708L(m67692I(), th)) {
            m67701U(th);
        } else if (th instanceof Error) {
            m67701U(th);
        }
    }

    /* renamed from: S */
    public /* synthetic */ void m67703S(ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f41696n = null;
                cancel(false);
            } else {
                m67707N(i, listenableFuture);
            }
        } finally {
            m67702T(null);
        }
    }

    /* renamed from: U */
    private static void m67701U(Throwable th) {
        String str;
        if (th instanceof Error) {
            str = "Input Future failed with Error";
        } else {
            str = "Got more than one input Future failure. Logging failures after the first";
        }
        f41695q.log(Level.SEVERE, str, th);
    }

    /* renamed from: V */
    private void m67700V(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator<? extends Future<? extends InputT>> it = immutableCollection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    m67707N(i, next);
                }
                i++;
            }
        }
        m67694G();
        mo67632P();
        mo67631W(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    /* renamed from: F */
    final void mo67695F(Set<Throwable> set) {
        Preconditions.checkNotNull(set);
        if (!isCancelled()) {
            Throwable mo67427a = mo67427a();
            Objects.requireNonNull(mo67427a);
            m67708L(set, mo67427a);
        }
    }

    /* renamed from: M */
    abstract void mo67633M(int i, @ParametricNullness InputT inputt);

    /* renamed from: P */
    abstract void mo67632P();

    /* renamed from: R */
    public final void m67704R() {
        final ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection;
        Objects.requireNonNull(this.f41696n);
        if (this.f41696n.isEmpty()) {
            mo67632P();
        } else if (this.f41697o) {
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = this.f41696n.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture<? extends InputT> next = it.next();
                next.addListener(new Runnable() { // from class: com.google.common.util.concurrent.a
                    {
                        AggregateFuture.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AggregateFuture.this.m67703S(next, i);
                    }
                }, MoreExecutors.directExecutor());
                i++;
            }
        } else {
            if (this.f41698p) {
                immutableCollection = this.f41696n;
            } else {
                immutableCollection = null;
            }
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.b
                {
                    AggregateFuture.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AggregateFuture.this.m67702T(immutableCollection);
                }
            };
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it2 = this.f41696n.iterator();
            while (it2.hasNext()) {
                it2.next().addListener(runnable, MoreExecutors.directExecutor());
            }
        }
    }

    @ForOverride
    @OverridingMethodsMustInvokeSuper
    /* renamed from: W */
    public void mo67631W(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.f41696n = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: m */
    public final void mo67441m() {
        boolean z;
        super.mo67441m();
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.f41696n;
        mo67631W(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        boolean isCancelled = isCancelled();
        if (immutableCollection != null) {
            z = true;
        } else {
            z = false;
        }
        if (isCancelled & z) {
            boolean m67790B = m67790B();
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(m67790B);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: y */
    public final String mo67440y() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.f41696n;
        if (immutableCollection != null) {
            String valueOf = String.valueOf(immutableCollection);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("futures=");
            sb2.append(valueOf);
            return sb2.toString();
        }
        return super.mo67440y();
    }
}
