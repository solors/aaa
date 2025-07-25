package ad;

import cd.Function;
import p642dd.ObjectHelper;
import p657ed.FlowableCreate;
import p657ed.FlowableFlatMapMaybe;
import p657ed.FlowableObserveOn;
import p657ed.FlowableSubscribeOn;
import p657ed.FlowableUnsubscribeOn;
import p762kd.RxJavaPlugins;

/* renamed from: ad.c */
/* loaded from: classes9.dex */
public abstract class Flowable<T> {

    /* renamed from: a */
    static final int f158a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: a */
    public static int m105792a() {
        return f158a;
    }

    /* renamed from: b */
    public static <T> Flowable<T> m105791b(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        ObjectHelper.m25661a(flowableOnSubscribe, "source is null");
        ObjectHelper.m25661a(backpressureStrategy, "mode is null");
        return RxJavaPlugins.m17729h(new FlowableCreate(flowableOnSubscribe, backpressureStrategy));
    }

    /* renamed from: c */
    public final <R> Flowable<R> m105790c(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return m105789d(function, false, Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public final <R> Flowable<R> m105789d(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
        ObjectHelper.m25661a(function, "mapper is null");
        ObjectHelper.m25660b(i, "maxConcurrency");
        return RxJavaPlugins.m17729h(new FlowableFlatMapMaybe(this, function, z, i));
    }

    /* renamed from: e */
    public final Flowable<T> m105788e(Scheduler scheduler) {
        return m105787f(scheduler, false, m105792a());
    }

    /* renamed from: f */
    public final Flowable<T> m105787f(Scheduler scheduler, boolean z, int i) {
        ObjectHelper.m25661a(scheduler, "scheduler is null");
        ObjectHelper.m25660b(i, "bufferSize");
        return RxJavaPlugins.m17729h(new FlowableObserveOn(this, scheduler, z, i));
    }

    /* renamed from: g */
    public final Flowable<T> m105786g(Scheduler scheduler) {
        ObjectHelper.m25661a(scheduler, "scheduler is null");
        return m105785h(scheduler, !(this instanceof FlowableCreate));
    }

    /* renamed from: h */
    public final Flowable<T> m105785h(Scheduler scheduler, boolean z) {
        ObjectHelper.m25661a(scheduler, "scheduler is null");
        return RxJavaPlugins.m17729h(new FlowableSubscribeOn(this, scheduler, z));
    }

    /* renamed from: i */
    public final Flowable<T> m105784i(Scheduler scheduler) {
        ObjectHelper.m25661a(scheduler, "scheduler is null");
        return RxJavaPlugins.m17729h(new FlowableUnsubscribeOn(this, scheduler));
    }
}
