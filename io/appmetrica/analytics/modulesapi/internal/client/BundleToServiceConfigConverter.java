package io.appmetrica.analytics.modulesapi.internal.client;

import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface BundleToServiceConfigConverter<T> {
    T fromBundle(@NotNull Bundle bundle);
}
