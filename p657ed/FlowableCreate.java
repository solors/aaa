package p657ed;

import ad.BackpressureStrategy;
import ad.Flowable;
import ad.FlowableOnSubscribe;

/* renamed from: ed.b */
/* loaded from: classes9.dex */
public final class FlowableCreate<T> extends Flowable<T> {

    /* renamed from: b */
    final FlowableOnSubscribe<T> f90114b;

    /* renamed from: c */
    final BackpressureStrategy f90115c;

    public FlowableCreate(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.f90114b = flowableOnSubscribe;
        this.f90115c = backpressureStrategy;
    }
}
