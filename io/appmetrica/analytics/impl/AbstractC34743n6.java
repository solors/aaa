package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.n6 */
/* loaded from: classes9.dex */
public abstract class AbstractC34743n6 implements InterfaceC33841Da {

    /* renamed from: a */
    public final InterfaceC34716m6 f94975a;

    /* renamed from: b */
    public final ICrashTransformer f94976b;

    /* renamed from: c */
    public final C34012K9 f94977c;

    public AbstractC34743n6(InterfaceC34716m6 interfaceC34716m6, ICrashTransformer iCrashTransformer, C34012K9 c34012k9) {
        this.f94975a = interfaceC34716m6;
        this.f94976b = iCrashTransformer;
        this.f94977c = c34012k9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33841Da
    /* renamed from: a */
    public final void mo21231a(@Nullable Throwable th, @NonNull C34217T c34217t) {
        if (this.f94975a.mo20729a(th)) {
            ICrashTransformer iCrashTransformer = this.f94976b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                C34145Pm m22243a = AbstractC34216Sm.m22243a(th, c34217t, null, (String) this.f94977c.f93125a.m22168a(), (Boolean) this.f94977c.f93126b.m22168a());
                C34253Ub c34253Ub = (C34253Ub) ((C34306Wg) this).f93655d;
                c34253Ub.f93623a.mo20848a().mo22340b(c34253Ub.f93570b).mo21175a(m22243a);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public final InterfaceC34716m6 m21311b() {
        return this.f94975a;
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    public final ICrashTransformer m21312a() {
        return this.f94976b;
    }
}
