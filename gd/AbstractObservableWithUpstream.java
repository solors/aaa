package gd;

import ad.Observable;
import ad.ObservableSource;

/* renamed from: gd.a */
/* loaded from: classes9.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> {

    /* renamed from: a */
    protected final ObservableSource<T> f90887a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractObservableWithUpstream(ObservableSource<T> observableSource) {
        this.f90887a = observableSource;
    }
}
