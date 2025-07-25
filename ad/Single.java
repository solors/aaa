package ad;

import p642dd.ObjectHelper;
import p703hd.SingleCreate;
import p762kd.RxJavaPlugins;

/* renamed from: ad.m */
/* loaded from: classes9.dex */
public abstract class Single<T> {
    /* renamed from: a */
    public static <T> Single<T> m105772a(SingleOnSubscribe<T> singleOnSubscribe) {
        ObjectHelper.m25661a(singleOnSubscribe, "source is null");
        return RxJavaPlugins.m17726k(new SingleCreate(singleOnSubscribe));
    }
}
