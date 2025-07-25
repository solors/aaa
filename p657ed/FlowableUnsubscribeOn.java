package p657ed;

import ad.Flowable;
import ad.Scheduler;

/* renamed from: ed.f */
/* loaded from: classes9.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: c */
    final Scheduler f90124c;

    public FlowableUnsubscribeOn(Flowable<T> flowable, Scheduler scheduler) {
        super(flowable);
        this.f90124c = scheduler;
    }
}
