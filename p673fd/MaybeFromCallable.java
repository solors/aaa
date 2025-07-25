package p673fd;

import ad.Maybe;
import java.util.concurrent.Callable;

/* renamed from: fd.a */
/* loaded from: classes9.dex */
public final class MaybeFromCallable<T> extends Maybe<T> implements Callable<T> {

    /* renamed from: b */
    final Callable<? extends T> f90422b;

    public MaybeFromCallable(Callable<? extends T> callable) {
        this.f90422b = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f90422b.call();
    }
}
