package bd;

import p642dd.ObjectHelper;
import p746jd.OpenHashSet;

/* renamed from: bd.b */
/* loaded from: classes9.dex */
public final class CompositeDisposable implements Disposable {

    /* renamed from: b */
    volatile boolean f1704b;

    /* renamed from: a */
    public boolean m103805a(Disposable disposable) {
        ObjectHelper.m25661a(disposable, "disposables is null");
        if (this.f1704b) {
            return false;
        }
        synchronized (this) {
            return this.f1704b ? false : false;
        }
    }

    /* renamed from: c */
    public boolean m103803c(Disposable disposable) {
        if (m103805a(disposable)) {
            disposable.dispose();
            return true;
        }
        return false;
    }

    @Override // bd.Disposable
    public void dispose() {
        if (this.f1704b) {
            return;
        }
        synchronized (this) {
            if (this.f1704b) {
                return;
            }
            this.f1704b = true;
            m103804b(null);
        }
    }

    /* renamed from: b */
    void m103804b(OpenHashSet<Disposable> openHashSet) {
    }
}
