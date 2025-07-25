package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.Q5 */
/* loaded from: classes9.dex */
public final class C34152Q5 extends BaseRequestConfig.DataSource {
    @NonNull

    /* renamed from: a */
    public final C34650jl f93387a;
    @NonNull

    /* renamed from: b */
    public final SdkEnvironmentProvider f93388b;

    public C34152Q5(@NonNull C34650jl c34650jl, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c34650jl.m21496e(), c34650jl.m21500a(), c34650jl.m21499b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f93387a = c34650jl;
        this.f93388b = sdkEnvironmentProvider;
    }
}
