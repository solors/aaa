package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.C7 */
/* loaded from: classes9.dex */
public final class C33813C7 implements AskForPermissionStrategyModuleProvider {

    /* renamed from: a */
    public final C34883sd f92673a = new C34883sd();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f92673a;
    }
}
