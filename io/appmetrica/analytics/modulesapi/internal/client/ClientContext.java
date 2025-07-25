package io.appmetrica.analytics.modulesapi.internal.client;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ClientContext {
    @NotNull
    ClientStorageProvider getClientStorageProvider();

    @NotNull
    Context getContext();

    @NotNull
    ModuleAdRevenueContext getModuleAdRevenueContext();
}
