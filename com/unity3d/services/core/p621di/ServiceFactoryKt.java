package com.unity3d.services.core.p621di;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;

/* compiled from: ServiceFactory.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.ServiceFactoryKt */
/* loaded from: classes7.dex */
public final class ServiceFactoryKt {
    @NotNull
    public static final <T> InterfaceC38501j<T> factoryOf(@NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new ServiceFactory(initializer);
    }
}
