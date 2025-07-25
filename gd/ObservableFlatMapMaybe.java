package gd;

import ad.MaybeSource;
import ad.ObservableSource;
import cd.Function;

/* renamed from: gd.c */
/* loaded from: classes9.dex */
public final class ObservableFlatMapMaybe<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* renamed from: b */
    final Function<? super T, ? extends MaybeSource<? extends R>> f90889b;

    /* renamed from: c */
    final boolean f90890c;

    public ObservableFlatMapMaybe(ObservableSource<T> observableSource, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.f90889b = function;
        this.f90890c = z;
    }
}
