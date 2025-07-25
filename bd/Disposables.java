package bd;

import cd.Action;
import p642dd.ObjectHelper;

/* renamed from: bd.d */
/* loaded from: classes9.dex */
public final class Disposables {
    /* renamed from: a */
    public static Disposable m103802a(Action action) {
        ObjectHelper.m25661a(action, "run is null");
        return new ActionDisposable(action);
    }
}
