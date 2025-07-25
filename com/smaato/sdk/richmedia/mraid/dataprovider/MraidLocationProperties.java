package com.smaato.sdk.richmedia.mraid.dataprovider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.LatLng;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.p568ad.GeoInfo;
import com.smaato.sdk.core.p568ad.RequestInfoMapper;
import com.smaato.sdk.core.p568ad.RequestInfoProvider;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class MraidLocationProperties {
    @Nullable
    public final LatLng latLng;
    @Nullable
    public final Integer locationServiceType;

    private MraidLocationProperties(@Nullable LatLng latLng, @Nullable Integer num) {
        this.latLng = latLng;
        this.locationServiceType = num;
    }

    @NonNull
    public static MraidLocationProperties create(@NonNull RequestInfoProvider requestInfoProvider, @NonNull SdkConfiguration sdkConfiguration, @NonNull RequestInfoMapper requestInfoMapper) {
        GeoInfo geoInfo = requestInfoProvider.getGeoInfo(sdkConfiguration.getUserInfo());
        if (geoInfo == null) {
            return new MraidLocationProperties(null, null);
        }
        return new MraidLocationProperties(geoInfo.getLatLng(), requestInfoMapper.mapToApiValue(geoInfo.getGeoType()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MraidLocationProperties.class != obj.getClass()) {
            return false;
        }
        MraidLocationProperties mraidLocationProperties = (MraidLocationProperties) obj;
        if (Objects.equals(this.latLng, mraidLocationProperties.latLng) && Objects.equals(this.locationServiceType, mraidLocationProperties.locationServiceType)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.latLng, this.locationServiceType);
    }
}
