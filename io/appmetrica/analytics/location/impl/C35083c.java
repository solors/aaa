package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.c */
/* loaded from: classes9.dex */
public final class C35083c implements LastKnownLocationExtractorProvider {

    /* renamed from: a */
    public final String f95722a;

    public C35083c(@NotNull String str) {
        this.f95722a = str;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @NotNull
    public final LastKnownLocationExtractor getExtractor(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new C35082b(context, new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION"), locationListener, iHandlerExecutor);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f95722a;
    }
}
