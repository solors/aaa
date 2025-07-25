package p657ed;

import ad.Flowable;
import ad.MaybeSource;
import cd.Function;

/* renamed from: ed.c */
/* loaded from: classes9.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* renamed from: c */
    final Function<? super T, ? extends MaybeSource<? extends R>> f90116c;

    /* renamed from: d */
    final boolean f90117d;

    /* renamed from: e */
    final int f90118e;

    public FlowableFlatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.f90116c = function;
        this.f90117d = z;
        this.f90118e = i;
    }
}
