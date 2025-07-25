package com.mobilefuse.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.Nullable;

@SuppressLint({"MissingPermission"})
/* loaded from: classes7.dex */
public class LocationService {
    private static boolean enabled = true;
    @Nullable
    private static Location lastLocation = null;
    private static long lastLocationRefreshTimestamp = 0;
    private static final long locationValidTime = 900000;

    @Nullable
    public static synchronized Location getLastKnownLocation() throws Throwable {
        Location location;
        synchronized (LocationService.class) {
            Context globalContext = AppLifecycleHelper.getGlobalContext();
            if (!enabled) {
                return null;
            }
            if (AppLifecycleHelper.getCurrentActivity() == null) {
                return null;
            }
            if (!AppLifecycleHelper.isAppInForeground()) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastLocationRefreshTimestamp <= 900000 && (location = lastLocation) != null) {
                return location;
            }
            LocationManager locationManager = (LocationManager) globalContext.getSystemService("location");
            Location locationFromGpsProvider = getLocationFromGpsProvider(globalContext, locationManager);
            if (locationFromGpsProvider == null) {
                locationFromGpsProvider = getLocationFromNetworkProvider(globalContext, locationManager);
            }
            if (locationFromGpsProvider == null) {
                return null;
            }
            lastLocation = locationFromGpsProvider;
            lastLocationRefreshTimestamp = currentTimeMillis;
            return locationFromGpsProvider;
        }
    }

    private static Location getLocationFromGpsProvider(Context context, LocationManager locationManager) throws Throwable {
        if (!Utils.hasManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        }
        return locationManager.getLastKnownLocation("gps");
    }

    private static Location getLocationFromNetworkProvider(Context context, LocationManager locationManager) throws Throwable {
        boolean hasManifestPermission = Utils.hasManifestPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!hasManifestPermission) {
            hasManifestPermission = Utils.hasManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        }
        if (!hasManifestPermission) {
            return null;
        }
        return locationManager.getLastKnownLocation("network");
    }

    static boolean isEnabled() {
        return enabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setEnabled(boolean z) {
        enabled = z;
        if (!z) {
            lastLocation = null;
            lastLocationRefreshTimestamp = 0L;
        }
    }
}
