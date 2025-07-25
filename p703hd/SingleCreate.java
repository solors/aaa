package p703hd;

import ad.Single;
import ad.SingleOnSubscribe;

/* renamed from: hd.a */
/* loaded from: classes9.dex */
public final class SingleCreate<T> extends Single<T> {

    /* renamed from: a */
    final SingleOnSubscribe<T> f91460a;

    public SingleCreate(SingleOnSubscribe<T> singleOnSubscribe) {
        this.f91460a = singleOnSubscribe;
    }
}
