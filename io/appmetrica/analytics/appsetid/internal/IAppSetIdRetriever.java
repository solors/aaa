package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface IAppSetIdRetriever {
    void retrieveAppSetId(@NotNull Context context, @NotNull AppSetIdListener appSetIdListener) throws Throwable;
}
