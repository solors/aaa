package io.appmetrica.analytics.coreapi.internal.identifiers;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface SimpleAdvertisingIdGetter {
    @NotNull
    AdvertisingIdsHolder getIdentifiers(@NotNull Context context);
}
