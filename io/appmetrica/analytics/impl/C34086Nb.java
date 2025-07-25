package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Nb */
/* loaded from: classes9.dex */
public final class C34086Nb implements PermissionStrategy, LocationControllerObserver {
    @NotNull

    /* renamed from: b */
    public static final C34062Mb f93271b = new C34062Mb();

    /* renamed from: c */
    public static final List f93272c;

    /* renamed from: a */
    public volatile boolean f93273a;

    static {
        List m17163p;
        m17163p = C37563v.m17163p("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        f93272c = m17163p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        if (f93272c.contains(str)) {
            return !this.f93273a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f93273a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f93273a = false;
    }

    @NotNull
    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f93273a + ", locationPermissions=" + f93272c + ')';
    }
}
