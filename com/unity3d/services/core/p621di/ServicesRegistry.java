package com.unity3d.services.core.p621di;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: ServicesRegistry.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.ServicesRegistry */
/* loaded from: classes7.dex */
public final class ServicesRegistry implements IServicesRegistry {
    @NotNull
    private final ConcurrentHashMap<ServiceKey, InterfaceC38501j<?>> _services = new ConcurrentHashMap<>();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, Functions instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.m17067n(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.m17042b(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.m17067n(4, "T");
        return servicesRegistry.resolveService(new ServiceKey(named, Reflection.m17042b(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.m17067n(4, "T");
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(named, Reflection.m17042b(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String named, Functions instance, int i, Object obj) {
        InterfaceC38501j m14554a;
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.m17067n(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.m17042b(Object.class));
        m14554a = LazyJVM.m14554a(instance);
        servicesRegistry.updateService(serviceKey, m14554a);
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String named, Functions<? extends T> instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.m17067n(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.m17042b(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.m17067n(4, "T");
        return (T) resolveService(new ServiceKey(named, Reflection.m17042b(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.m17067n(4, "T");
        return (T) resolveServiceOrNull(new ServiceKey(named, Reflection.m17042b(Object.class)));
    }

    @Override // com.unity3d.services.core.p621di.IServicesRegistry
    public <T> T getService(@NotNull String named, @NotNull KClass<?> instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.p621di.IServicesRegistry
    @NotNull
    public Map<ServiceKey, InterfaceC38501j<?>> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.p621di.IServicesRegistry
    public <T> T resolveService(@NotNull ServiceKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC38501j<?> interfaceC38501j = getServices().get(key);
        if (interfaceC38501j != null) {
            return (T) interfaceC38501j.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.p621di.IServicesRegistry
    @Nullable
    public <T> T resolveServiceOrNull(@NotNull ServiceKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC38501j<?> interfaceC38501j = getServices().get(key);
        if (interfaceC38501j == null) {
            return null;
        }
        return (T) interfaceC38501j.getValue();
    }

    public final /* synthetic */ <T> ServiceKey single(String named, Functions<? extends T> instance) {
        InterfaceC38501j<? extends T> m14554a;
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.m17067n(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.m17042b(Object.class));
        m14554a = LazyJVM.m14554a(instance);
        updateService(serviceKey, m14554a);
        return serviceKey;
    }

    @Override // com.unity3d.services.core.p621di.IServicesRegistry
    public <T> void updateService(@NotNull ServiceKey key, @NotNull InterfaceC38501j<? extends T> instance) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
            return;
        }
        throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
    }
}
