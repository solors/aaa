package com.unity3d.services.core.p621di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ServiceKey.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.ServiceKey */
/* loaded from: classes7.dex */
public final class ServiceKey {
    @NotNull
    private final KClass<?> instanceClass;
    @NotNull
    private final String named;

    public ServiceKey(@NotNull String named, @NotNull KClass<?> instanceClass) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, KClass kClass, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i & 2) != 0) {
            kClass = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, kClass);
    }

    @NotNull
    public final String component1() {
        return this.named;
    }

    @NotNull
    public final KClass<?> component2() {
        return this.instanceClass;
    }

    @NotNull
    public final ServiceKey copy(@NotNull String named, @NotNull KClass<?> instanceClass) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        return new ServiceKey(named, instanceClass);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        if (Intrinsics.m17075f(this.named, serviceKey.named) && Intrinsics.m17075f(this.instanceClass, serviceKey.instanceClass)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final KClass<?> getInstanceClass() {
        return this.instanceClass;
    }

    @NotNull
    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    @NotNull
    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, KClass kClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, kClass);
    }
}
