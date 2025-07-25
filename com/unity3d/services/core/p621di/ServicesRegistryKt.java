package com.unity3d.services.core.p621di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ServicesRegistry.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.ServicesRegistryKt */
/* loaded from: classes7.dex */
public final class ServicesRegistryKt {
    @NotNull
    public static final ServicesRegistry registry(@NotNull Function1<? super ServicesRegistry, Unit> registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
