package p657ed;

import ad.Flowable;
import ad.Scheduler;

/* renamed from: ed.e */
/* loaded from: classes9.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: c */
    final Scheduler f90122c;

    /* renamed from: d */
    final boolean f90123d;

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.f90122c = scheduler;
        this.f90123d = z;
    }
}
