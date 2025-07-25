package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.f */
/* loaded from: classes9.dex */
public final class C35086f implements InterfaceC35099s {
    @Override // io.appmetrica.analytics.location.impl.InterfaceC35099s
    @NotNull
    /* renamed from: a */
    public final PermissionResolutionStrategy mo20673a(@NotNull PermissionExtractor permissionExtractor) {
        return new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
