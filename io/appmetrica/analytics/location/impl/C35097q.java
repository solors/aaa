package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.q */
/* loaded from: classes9.dex */
public final class C35097q implements LastKnownLocationExtractorProvider, LocationReceiverProvider {

    /* renamed from: a */
    public final String f95755a = "location-passive-provider";

    /* renamed from: b */
    public C35098r f95756b;

    @NotNull
    /* renamed from: a */
    public final C35098r m20678a(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return m20676c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @NotNull
    /* renamed from: b */
    public final C35098r m20677b(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return m20676c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    /* renamed from: c */
    public final synchronized C35098r m20676c(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        C35098r c35098r;
        if (this.f95756b == null) {
            this.f95756b = new C35098r(context, iHandlerExecutor.getLooper(), new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION"), locationListener);
        }
        c35098r = this.f95756b;
        if (c35098r == null) {
            Intrinsics.m17056y("passiveProviderLocationReceiver");
            c35098r = null;
        }
        return c35098r;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m20676c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f95755a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m20676c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}
