package ad;

import java.util.concurrent.Callable;
import p642dd.ObjectHelper;
import p673fd.MaybeFromCallable;
import p762kd.RxJavaPlugins;

/* renamed from: ad.f */
/* loaded from: classes9.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    /* renamed from: a */
    public static <T> Maybe<T> m105782a(Callable<? extends T> callable) {
        ObjectHelper.m25661a(callable, "callable is null");
        return RxJavaPlugins.m17728i(new MaybeFromCallable(callable));
    }
}
