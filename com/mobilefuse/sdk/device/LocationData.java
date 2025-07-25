package com.mobilefuse.sdk.device;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LocationData.kt */
@Metadata
/* loaded from: classes7.dex */
public final class LocationData {
    @Nullable
    private final Integer accuracy;
    @Nullable
    private final Double altitude;
    private final int lastFixSeconds;
    private final double latitude;
    private final double longitude;

    public LocationData(double d, double d2, @Nullable Double d3, @Nullable Integer num, int i) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.accuracy = num;
        this.lastFixSeconds = i;
    }

    public static /* synthetic */ LocationData copy$default(LocationData locationData, double d, double d2, Double d3, Integer num, int i, int i2, Object obj) {
        double d4;
        double d5;
        Double d6;
        Integer num2;
        int i3;
        if ((i2 & 1) != 0) {
            d4 = locationData.latitude;
        } else {
            d4 = d;
        }
        if ((i2 & 2) != 0) {
            d5 = locationData.longitude;
        } else {
            d5 = d2;
        }
        if ((i2 & 4) != 0) {
            d6 = locationData.altitude;
        } else {
            d6 = d3;
        }
        if ((i2 & 8) != 0) {
            num2 = locationData.accuracy;
        } else {
            num2 = num;
        }
        if ((i2 & 16) != 0) {
            i3 = locationData.lastFixSeconds;
        } else {
            i3 = i;
        }
        return locationData.copy(d4, d5, d6, num2, i3);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    @Nullable
    public final Double component3() {
        return this.altitude;
    }

    @Nullable
    public final Integer component4() {
        return this.accuracy;
    }

    public final int component5() {
        return this.lastFixSeconds;
    }

    @NotNull
    public final LocationData copy(double d, double d2, @Nullable Double d3, @Nullable Integer num, int i) {
        return new LocationData(d, d2, d3, num, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof LocationData) {
                LocationData locationData = (LocationData) obj;
                if (Double.compare(this.latitude, locationData.latitude) != 0 || Double.compare(this.longitude, locationData.longitude) != 0 || !Intrinsics.m17075f(this.altitude, locationData.altitude) || !Intrinsics.m17075f(this.accuracy, locationData.accuracy) || this.lastFixSeconds != locationData.lastFixSeconds) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    public final int getLastFixSeconds() {
        return this.lastFixSeconds;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int i;
        int hashCode = ((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31;
        Double d = this.altitude;
        int i2 = 0;
        if (d != null) {
            i = d.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Integer num = this.accuracy;
        if (num != null) {
            i2 = num.hashCode();
        }
        return ((i3 + i2) * 31) + Integer.hashCode(this.lastFixSeconds);
    }

    @NotNull
    public String toString() {
        return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", accuracy=" + this.accuracy + ", lastFixSeconds=" + this.lastFixSeconds + ")";
    }
}
