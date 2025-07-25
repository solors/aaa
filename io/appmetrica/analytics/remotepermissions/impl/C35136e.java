package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import kotlin.collections.C37572z0;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.e */
/* loaded from: classes9.dex */
public final class C35136e implements PermissionStrategy {

    /* renamed from: a */
    public Set f95953a;

    public C35136e() {
        Set m17123f;
        m17123f = C37572z0.m17123f();
        this.f95953a = m17123f;
    }

    /* renamed from: a */
    public final synchronized void m20646a(@NotNull Set<String> set) {
        this.f95953a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@NotNull String str) {
        return !this.f95953a.contains(str);
    }
}
