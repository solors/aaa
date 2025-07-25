package com.smaato.sdk.core.datacollector;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.smaato.sdk.core.util.Clock;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class LocationProvider {
    @NonNull
    private final Clock clock;
    @Nullable
    private DetectedLocation lastKnownLocation;
    @NonNull
    private final LocationDetector locationDetector;
    private long locationRefreshTimeMillis;

    /* loaded from: classes7.dex */
    public static final class DetectedLocation {
        private final long lastUpdatedMillis;
        @NonNull
        @VisibleForTesting
        final Location location;
        @NonNull
        private final TYPE type;

        /* loaded from: classes7.dex */
        public enum TYPE {
            GPS,
            NETWORK
        }

        public float getAccuracy() {
            return this.location.getAccuracy();
        }

        public long getLastUpdatedMillis() {
            return this.lastUpdatedMillis;
        }

        public double getLatitude() {
            return this.location.getLatitude();
        }

        public double getLongitude() {
            return this.location.getLongitude();
        }

        @NonNull
        public TYPE getType() {
            return this.type;
        }

        private DetectedLocation(@NonNull Location location, @NonNull TYPE type, long j) {
            this.location = location;
            this.type = type;
            this.lastUpdatedMillis = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationProvider(@NonNull LocationDetector locationDetector, @NonNull Clock clock, long j) {
        this.locationDetector = (LocationDetector) Objects.requireNonNull(locationDetector);
        this.clock = (Clock) Objects.requireNonNull(clock);
        this.locationRefreshTimeMillis = j;
    }

    @Nullable
    private DetectedLocation detectLocation() {
        DetectedLocation gpsProvidedLocation = getGpsProvidedLocation();
        if (gpsProvidedLocation == null) {
            return getNetworkProvidedLocation();
        }
        return gpsProvidedLocation;
    }

    @Nullable
    private DetectedLocation getGpsProvidedLocation() {
        Location m39648a = this.locationDetector.m39648a();
        if (m39648a == null) {
            return null;
        }
        return new DetectedLocation(m39648a, DetectedLocation.TYPE.GPS, this.clock.elapsedRealtime());
    }

    @Nullable
    private DetectedLocation getNetworkProvidedLocation() {
        Location m39647b = this.locationDetector.m39647b();
        if (m39647b == null) {
            return null;
        }
        return new DetectedLocation(m39647b, DetectedLocation.TYPE.NETWORK, this.clock.elapsedRealtime());
    }

    private boolean isLocationFresh() {
        if (this.lastKnownLocation == null || this.clock.elapsedRealtime() - this.lastKnownLocation.lastUpdatedMillis > this.locationRefreshTimeMillis) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public DetectedLocation getLocationData() {
        if (isLocationFresh()) {
            return this.lastKnownLocation;
        }
        DetectedLocation detectLocation = detectLocation();
        this.lastKnownLocation = detectLocation;
        return detectLocation;
    }
}
