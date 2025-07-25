package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.C35101u;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.u */
/* loaded from: classes9.dex */
public class C35101u implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f95764a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f95765b;

    /* renamed from: c */
    public final LocationListener f95766c;

    /* renamed from: d */
    public final String f95767d;

    public C35101u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.f95764a = context;
        this.f95765b = permissionResolutionStrategy;
        this.f95766c = locationListener;
        this.f95767d = str;
    }

    @NotNull
    /* renamed from: a */
    public final Context m20672a() {
        return this.f95764a;
    }

    @NotNull
    /* renamed from: b */
    public final LocationListener m20670b() {
        return this.f95766c;
    }

    @NotNull
    /* renamed from: c */
    public final PermissionResolutionStrategy m20669c() {
        return this.f95765b;
    }

    @NotNull
    /* renamed from: d */
    public final String m20668d() {
        return this.f95767d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f95765b.hasNecessaryPermissions(this.f95764a)) {
            Context context = this.f95764a;
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(context, "location", "getting last known location for provider " + this.f95767d, "location manager", new FunctionWithThrowable() { // from class: vb.c
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return C35101u.m20671a(C35101u.this, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.f95766c.onLocationChanged(location);
            }
        }
    }

    /* renamed from: a */
    public static final Location m20671a(C35101u c35101u, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(c35101u.f95767d);
    }
}
