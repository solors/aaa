package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.S7 */
/* loaded from: classes9.dex */
public final class C34201S7 implements IAppSetIdRetriever {
    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public final void retrieveAppSetId(@NotNull Context context, @NotNull AppSetIdListener appSetIdListener) {
        appSetIdListener.onFailure(new IllegalStateException("No App Set ID library"));
    }
}
