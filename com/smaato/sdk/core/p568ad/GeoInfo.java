package com.smaato.sdk.core.p568ad;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.LatLng;
import com.smaato.sdk.core.util.Objects;
import java.util.Locale;

/* renamed from: com.smaato.sdk.core.ad.GeoInfo */
/* loaded from: classes7.dex */
public final class GeoInfo {
    @NonNull
    private final GeoType geoType;
    @NonNull
    private final LatLng latLng;

    public GeoInfo(@NonNull LatLng latLng, @NonNull GeoType geoType) {
        this.latLng = (LatLng) Objects.requireNonNull(latLng);
        this.geoType = (GeoType) Objects.requireNonNull(geoType);
    }

    @NonNull
    private String format(double d) {
        return String.format(Locale.US, "%.6f", Double.valueOf(d));
    }

    @NonNull
    public String getFormattedLatitude() {
        return format(this.latLng.getLatitude());
    }

    @NonNull
    public String getFormattedLongitude() {
        return format(this.latLng.getLongitude());
    }

    @NonNull
    public GeoType getGeoType() {
        return this.geoType;
    }

    @NonNull
    public LatLng getLatLng() {
        return this.latLng;
    }
}
