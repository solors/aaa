package ad;

import cd.Function;
import gd.ObservableCreate;
import gd.ObservableFlatMapMaybe;
import gd.ObservableObserveOn;
import gd.ObservableSubscribeOn;
import gd.ObservableUnsubscribeOn;
import p642dd.ObjectHelper;
import p762kd.RxJavaPlugins;

/* renamed from: ad.h */
/* loaded from: classes9.dex */
public abstract class Observable<T> implements ObservableSource<T> {
    /* renamed from: a */
    public static int m105781a() {
        return Flowable.m105792a();
    }

    /* renamed from: b */
    public static <T> Observable<T> m105780b(ObservableOnSubscribe<T> observableOnSubscribe) {
        ObjectHelper.m25661a(observableOnSubscribe, "source is null");
        return RxJavaPlugins.m17727j(new ObservableCreate(observableOnSubscribe));
    }

    /* renamed from: c */
    public final <R> Observable<R> m105779c(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return m105778d(function, false);
    }

    /* renamed from: d */
    public final <R> Observable<R> m105778d(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        ObjectHelper.m25661a(function, "mapper is null");
        return RxJavaPlugins.m17727j(new ObservableFlatMapMaybe(this, function, z));
    }

    /* renamed from: e */
    public final Observable<T> m105777e(Scheduler scheduler) {
        return m105776f(scheduler, false, m105781a());
    }

    /* renamed from: f */
    public final Observable<T> m105776f(Scheduler scheduler, boolean z, int i) {
        ObjectHelper.m25661a(scheduler, "scheduler is null");
        ObjectHelper.m25660b(i, "bufferSize");
        return RxJavaPlugins.m17727j(new ObservableObserveOn(this, scheduler, z, i));
    }

    /* renamed from: g */
    public final Observable<T> m105775g(Scheduler scheduler) {
        ObjectHelper.m25661a(scheduler, "scheduler is null");
        return RxJavaPlugins.m17727j(new ObservableSubscribeOn(this, scheduler));
    }

    /* renamed from: h */
    public final Observable<T> m105774h(Scheduler scheduler) {
        ObjectHelper.m25661a(scheduler, "scheduler is null");
        return RxJavaPlugins.m17727j(new ObservableUnsubscribeOn(this, scheduler));
    }
}
