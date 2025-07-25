package bd;

import java.util.concurrent.atomic.AtomicReference;
import p642dd.ObjectHelper;

/* renamed from: bd.e */
/* loaded from: classes9.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ReferenceDisposable(T t) {
        super(ObjectHelper.m25661a(t, "value is null"));
    }

    /* renamed from: a */
    protected abstract void mo103801a(T t);

    @Override // bd.Disposable
    public final void dispose() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            mo103801a(andSet);
        }
    }
}
