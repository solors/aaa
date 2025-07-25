package com.smaato.sdk.core.datacollector;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.datacollector.m */
/* loaded from: classes7.dex */
public final class LocationDetector {
    @NonNull

    /* renamed from: a */
    private final LocationManager f71466a;
    @NonNull

    /* renamed from: b */
    private final AppMetaData f71467b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationDetector(@NonNull LocationManager locationManager, @NonNull AppMetaData appMetaData) {
        this.f71466a = (LocationManager) Objects.requireNonNull(locationManager);
        this.f71467b = (AppMetaData) Objects.requireNonNull(appMetaData);
    }

    /* renamed from: c */
    private boolean m39646c(@NonNull String str) {
        return this.f71467b.isPermissionGranted(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public Location m39648a() {
        if (!m39646c("android.permission.ACCESS_FINE_LOCATION") || !this.f71466a.isProviderEnabled("gps")) {
            return null;
        }
        return this.f71466a.getLastKnownLocation("gps");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public Location m39647b() {
        if ((!m39646c("android.permission.ACCESS_FINE_LOCATION") && !m39646c("android.permission.ACCESS_COARSE_LOCATION")) || !this.f71466a.isProviderEnabled("network")) {
            return null;
        }
        return this.f71466a.getLastKnownLocation("network");
    }
}
