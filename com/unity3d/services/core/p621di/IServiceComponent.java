package com.unity3d.services.core.p621di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: IServiceComponent.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.IServiceComponent */
/* loaded from: classes7.dex */
public interface IServiceComponent {

    /* compiled from: IServiceComponent.kt */
    @Metadata
    /* renamed from: com.unity3d.services.core.di.IServiceComponent$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @NotNull
        public static IServiceProvider getServiceProvider(@NotNull IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }

    @NotNull
    IServiceProvider getServiceProvider();
}
