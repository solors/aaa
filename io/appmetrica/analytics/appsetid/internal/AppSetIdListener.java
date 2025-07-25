package io.appmetrica.analytics.appsetid.internal;

import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface AppSetIdListener {
    void onAppSetIdRetrieved(@Nullable String str, @NotNull AppSetIdScope appSetIdScope);

    void onFailure(@Nullable Throwable th);
}
