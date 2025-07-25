package gd;

import ad.ObservableSource;
import ad.Scheduler;

/* renamed from: gd.e */
/* loaded from: classes9.dex */
public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: b */
    final Scheduler f90894b;

    public ObservableSubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f90894b = scheduler;
    }
}
