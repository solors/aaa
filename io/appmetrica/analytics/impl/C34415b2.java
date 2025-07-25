package io.appmetrica.analytics.impl;

import androidx.annotation.MainThread;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.b2 */
/* loaded from: classes9.dex */
public final class C34415b2 implements AppSetIdListener {

    /* renamed from: a */
    public final /* synthetic */ C34442c2 f94005a;

    public C34415b2(C34442c2 c34442c2) {
        this.f94005a = c34442c2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onAppSetIdRetrieved(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        this.f94005a.f94053c = new AppSetId(str, appSetIdScope);
        this.f94005a.f94054d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onFailure(@Nullable Throwable th) {
        this.f94005a.f94054d.countDown();
    }
}
