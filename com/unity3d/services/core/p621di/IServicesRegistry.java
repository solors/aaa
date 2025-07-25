package com.unity3d.services.core.p621di;

import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;

/* compiled from: IServicesRegistry.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.IServicesRegistry */
/* loaded from: classes7.dex */
public interface IServicesRegistry {

    /* compiled from: IServicesRegistry.kt */
    @Metadata
    /* renamed from: com.unity3d.services.core.di.IServicesRegistry$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, KClass kClass, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return iServicesRegistry.getService(str, kClass);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
        }
    }

    <T> T getService(@NotNull String str, @NotNull KClass<?> kClass);

    @NotNull
    Map<ServiceKey, InterfaceC38501j<?>> getServices();

    <T> T resolveService(@NotNull ServiceKey serviceKey);

    @Nullable
    <T> T resolveServiceOrNull(@NotNull ServiceKey serviceKey);

    <T> void updateService(@NotNull ServiceKey serviceKey, @NotNull InterfaceC38501j<? extends T> interfaceC38501j);
}
