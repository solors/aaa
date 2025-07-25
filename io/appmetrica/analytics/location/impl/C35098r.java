package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.C35098r;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.r */
/* loaded from: classes9.dex */
public final class C35098r extends C35101u implements LocationReceiver {

    /* renamed from: e */
    public final Looper f95757e;

    /* renamed from: f */
    public final long f95758f;

    public C35098r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f95757e = looper;
        this.f95758f = TimeUnit.SECONDS.toMillis(1L);
    }

    /* renamed from: a */
    public static final Unit m20675a(C35098r c35098r, LocationManager locationManager) {
        locationManager.requestLocationUpdates(c35098r.f95767d, c35098r.f95758f, 0.0f, c35098r.f95766c, c35098r.f95757e);
        return Unit.f99208a;
    }

    /* renamed from: b */
    public static final Unit m20674b(C35098r c35098r, LocationManager locationManager) {
        locationManager.removeUpdates(c35098r.f95766c);
        return Unit.f99208a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f95765b.hasNecessaryPermissions(this.f95764a)) {
            Context context = this.f95764a;
            SystemServiceUtils.accessSystemServiceByNameSafely(context, "location", "request location updates for " + this.f95767d + " provider", "location manager", new FunctionWithThrowable() { // from class: vb.a
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return C35098r.m20675a(C35098r.this, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f95764a, "location", "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: vb.b
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C35098r.m20674b(C35098r.this, (LocationManager) obj);
            }
        });
    }
}
