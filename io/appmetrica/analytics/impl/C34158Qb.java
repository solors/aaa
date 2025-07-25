package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Qb */
/* loaded from: classes9.dex */
public final class C34158Qb implements LocationReceiverProvider {

    /* renamed from: a */
    public final String f93397a = "Location receiver stub";

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f93397a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    @NotNull
    public final LocationReceiver getLocationReceiver(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new C34181Rb();
    }
}
