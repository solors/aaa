package bd;

import cd.Action;
import p746jd.ExceptionHelper;

/* renamed from: bd.a */
/* loaded from: classes9.dex */
final class ActionDisposable extends ReferenceDisposable<Action> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ActionDisposable(Action action) {
        super(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bd.ReferenceDisposable
    /* renamed from: b */
    public void mo103801a(Action action) {
        try {
            action.run();
        } catch (Throwable th) {
            throw ExceptionHelper.m18371a(th);
        }
    }
}
