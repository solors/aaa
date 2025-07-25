package com.unity3d.services.core.p621di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: IServiceProvider.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.IServiceProvider */
/* loaded from: classes7.dex */
public interface IServiceProvider {
    @NotNull
    IServicesRegistry getRegistry();

    @NotNull
    IServicesRegistry initialize();
}
