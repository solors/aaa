package net.pubnative.lite.sdk.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.PNPermissionUtil;

@SuppressLint({"MissingPermission"})
/* loaded from: classes10.dex */
public class HyBidLocationManager implements LocationListener {
    private static final int LOCATION_UPDATE_TIMEOUT = 10000;
    private static final String TAG = "HyBidLocationManager";
    private static final int TWO_MINUTES = 120000;
    private final Context mContext;
    private Location mCurrentBestLocation;
    private final LocationManager mManager;
    private final Runnable mStopUpdatesRunnable = new Runnable() { // from class: net.pubnative.lite.sdk.location.b
        {
            HyBidLocationManager.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HyBidLocationManager.this.stopLocationUpdates();
        }
    };

    public HyBidLocationManager(Context context) {
        this.mManager = (LocationManager) context.getSystemService("location");
        this.mContext = context;
    }

    private Location getLastKnownNetworkLocation() {
        if (hasNetworkProvider()) {
            return this.mManager.getLastKnownLocation("network");
        }
        return null;
    }

    private Location getLocationFromProviders() {
        Location location;
        if (hasCoarsePermission()) {
            location = getLastKnownNetworkLocation();
        } else {
            location = null;
        }
        if (location == null) {
            return null;
        }
        return location;
    }

    private boolean hasCoarsePermission() {
        return PNPermissionUtil.hasPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION");
    }

    private boolean hasNetworkProvider() {
        LocationManager locationManager = this.mManager;
        if (locationManager != null && locationManager.getProvider("network") != null) {
            return true;
        }
        return false;
    }

    private boolean hasPermission() {
        return hasCoarsePermission();
    }

    private boolean isSameProvider(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    public /* synthetic */ void lambda$startLocationUpdates$0() {
        this.mManager.requestLocationUpdates("network", 0L, 0.0f, this);
    }

    public Location getUserLocation() {
        if (hasPermission()) {
            Location locationFromProviders = getLocationFromProviders();
            if (locationFromProviders != null && isBetterLocation(locationFromProviders, this.mCurrentBestLocation)) {
                this.mCurrentBestLocation = locationFromProviders;
            }
            Location location = this.mCurrentBestLocation;
            if (HyBid.isLocationTrackingEnabled() && HyBid.areLocationUpdatesEnabled()) {
                startLocationUpdates();
                return location;
            }
            return location;
        }
        return null;
    }

    protected boolean isBetterLocation(Location location, Location location2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        if (time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            z = true;
        } else {
            z = false;
        }
        if (time < -120000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (time > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        if (accuracy > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (accuracy < 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (accuracy > 200) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean isSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (z3 && !z4) {
            return true;
        }
        if (z3 && !z6 && isSameProvider) {
            return true;
        }
        return false;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (isBetterLocation(location, this.mCurrentBestLocation)) {
            this.mCurrentBestLocation = location;
            stopLocationUpdates();
        }
    }

    public void startLocationUpdates() {
        Handler handler = new Handler(Looper.getMainLooper());
        try {
            if (hasCoarsePermission() && hasNetworkProvider()) {
                handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.location.a
                    {
                        HyBidLocationManager.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HyBidLocationManager.this.lambda$startLocationUpdates$0();
                    }
                });
            }
        } catch (Exception e) {
            Logger.m14227e(TAG, "Can't request location updates: ".concat(String.valueOf(e.getMessage())));
        }
        handler.postDelayed(this.mStopUpdatesRunnable, 10000L);
    }

    public void stopLocationUpdates() {
        LocationManager locationManager = this.mManager;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
