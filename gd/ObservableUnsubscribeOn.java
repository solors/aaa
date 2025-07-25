package gd;

import ad.ObservableSource;
import ad.Scheduler;

/* renamed from: gd.f */
/* loaded from: classes9.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: b */
    final Scheduler f90895b;

    public ObservableUnsubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f90895b = scheduler;
    }
}
