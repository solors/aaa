package p657ed;

import ad.Flowable;
import ad.Scheduler;

/* renamed from: ed.d */
/* loaded from: classes9.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: c */
    final Scheduler f90119c;

    /* renamed from: d */
    final boolean f90120d;

    /* renamed from: e */
    final int f90121e;

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z, int i) {
        super(flowable);
        this.f90119c = scheduler;
        this.f90120d = z;
        this.f90121e = i;
    }
}
