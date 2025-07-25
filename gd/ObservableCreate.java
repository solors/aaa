package gd;

import ad.Observable;
import ad.ObservableOnSubscribe;

/* renamed from: gd.b */
/* loaded from: classes9.dex */
public final class ObservableCreate<T> extends Observable<T> {

    /* renamed from: a */
    final ObservableOnSubscribe<T> f90888a;

    public ObservableCreate(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.f90888a = observableOnSubscribe;
    }
}
