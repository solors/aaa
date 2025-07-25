package com.smaato.sdk.core;

import android.os.SystemClock;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class LatLng {
    private final float accuracy;
    private final double latitude;
    private final double longitude;
    private final long timestamp;

    public LatLng(@FloatRange(from = -90.0d, m105511to = 90.0d) double d, @FloatRange(from = -180.0d, m105511to = 180.0d) double d2, float f, long j) {
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = f;
        this.timestamp = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LatLng.class != obj.getClass()) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0 && Float.compare(latLng.accuracy, this.accuracy) == 0) {
            return true;
        }
        return false;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public float getLocationAccuracy() {
        return this.accuracy;
    }

    public long getLocationTimestamp() {
        return this.timestamp;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public float getTimeSinceLastLocationUpdate() {
        return ((float) SystemClock.elapsedRealtime()) - ((float) this.timestamp);
    }

    public int hashCode() {
        int i;
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i2 = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31;
        float f = this.accuracy;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public boolean isValid() {
        double d = this.latitude;
        if (d > -90.0d && d < 90.0d) {
            double d2 = this.longitude;
            if (d2 > -180.0d && d2 < 180.0d) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String toString() {
        return "LatLng{latitude=" + this.latitude + ", longitude=" + this.longitude + ", accuracy=" + this.accuracy + ", timestamp=" + this.timestamp + '}';
    }
}
