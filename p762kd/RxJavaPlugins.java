package p762kd;

import ad.Flowable;
import ad.Maybe;
import ad.Observable;
import ad.Scheduler;
import ad.Single;
import cd.Function;
import java.util.concurrent.Callable;
import p642dd.ObjectHelper;
import p746jd.ExceptionHelper;

/* renamed from: kd.a */
/* loaded from: classes9.dex */
public final class RxJavaPlugins {

    /* renamed from: a */
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f99114a;

    /* renamed from: b */
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f99115b;

    /* renamed from: c */
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f99116c;

    /* renamed from: d */
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f99117d;

    /* renamed from: e */
    static volatile Function<? super Scheduler, ? extends Scheduler> f99118e;

    /* renamed from: f */
    static volatile Function<? super Flowable, ? extends Flowable> f99119f;

    /* renamed from: g */
    static volatile Function<? super Observable, ? extends Observable> f99120g;

    /* renamed from: h */
    static volatile Function<? super Maybe, ? extends Maybe> f99121h;

    /* renamed from: i */
    static volatile Function<? super Single, ? extends Single> f99122i;

    /* renamed from: a */
    static <T, R> R m17736a(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Throwable th) {
            throw ExceptionHelper.m18371a(th);
        }
    }

    /* renamed from: b */
    static Scheduler m17735b(Function<? super Callable<Scheduler>, ? extends Scheduler> function, Callable<Scheduler> callable) {
        return (Scheduler) ObjectHelper.m25661a(m17736a(function, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: c */
    static Scheduler m17734c(Callable<Scheduler> callable) {
        try {
            return (Scheduler) ObjectHelper.m25661a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw ExceptionHelper.m18371a(th);
        }
    }

    /* renamed from: d */
    public static Scheduler m17733d(Callable<Scheduler> callable) {
        ObjectHelper.m25661a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f99114a;
        if (function == null) {
            return m17734c(callable);
        }
        return m17735b(function, callable);
    }

    /* renamed from: e */
    public static Scheduler m17732e(Callable<Scheduler> callable) {
        ObjectHelper.m25661a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f99116c;
        if (function == null) {
            return m17734c(callable);
        }
        return m17735b(function, callable);
    }

    /* renamed from: f */
    public static Scheduler m17731f(Callable<Scheduler> callable) {
        ObjectHelper.m25661a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f99117d;
        if (function == null) {
            return m17734c(callable);
        }
        return m17735b(function, callable);
    }

    /* renamed from: g */
    public static Scheduler m17730g(Callable<Scheduler> callable) {
        ObjectHelper.m25661a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f99115b;
        if (function == null) {
            return m17734c(callable);
        }
        return m17735b(function, callable);
    }

    /* renamed from: h */
    public static <T> Flowable<T> m17729h(Flowable<T> flowable) {
        Function<? super Flowable, ? extends Flowable> function = f99119f;
        if (function != null) {
            return (Flowable) m17736a(function, flowable);
        }
        return flowable;
    }

    /* renamed from: i */
    public static <T> Maybe<T> m17728i(Maybe<T> maybe) {
        Function<? super Maybe, ? extends Maybe> function = f99121h;
        if (function != null) {
            return (Maybe) m17736a(function, maybe);
        }
        return maybe;
    }

    /* renamed from: j */
    public static <T> Observable<T> m17727j(Observable<T> observable) {
        Function<? super Observable, ? extends Observable> function = f99120g;
        if (function != null) {
            return (Observable) m17736a(function, observable);
        }
        return observable;
    }

    /* renamed from: k */
    public static <T> Single<T> m17726k(Single<T> single) {
        Function<? super Single, ? extends Single> function = f99122i;
        if (function != null) {
            return (Single) m17736a(function, single);
        }
        return single;
    }

    /* renamed from: l */
    public static Scheduler m17725l(Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = f99118e;
        if (function == null) {
            return scheduler;
        }
        return (Scheduler) m17736a(function, scheduler);
    }
}
