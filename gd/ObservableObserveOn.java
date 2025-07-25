package gd;

import ad.ObservableSource;
import ad.Scheduler;

/* renamed from: gd.d */
/* loaded from: classes9.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: b */
    final Scheduler f90891b;

    /* renamed from: c */
    final boolean f90892c;

    /* renamed from: d */
    final int f90893d;

    public ObservableObserveOn(ObservableSource<T> observableSource, Scheduler scheduler, boolean z, int i) {
        super(observableSource);
        this.f90891b = scheduler;
        this.f90892c = z;
        this.f90893d = i;
    }
}
