package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.m4 */
/* loaded from: classes9.dex */
public final class C34714m4 implements ModuleServiceConfig {

    /* renamed from: a */
    public final SdkIdentifiers f94895a;

    /* renamed from: b */
    public final Object f94896b;

    public C34714m4(@NotNull SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f94895a = sdkIdentifiers;
        this.f94896b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f94896b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f94895a;
    }
}
