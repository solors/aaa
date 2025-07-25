package com.smaato.sdk.core.p568ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.AdContentRating;
import com.smaato.sdk.core.LatLng;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.datacollector.LocationProvider;
import com.smaato.sdk.core.datacollector.SystemInfo;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdData;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.List;
import java.util.Locale;

/* renamed from: com.smaato.sdk.core.ad.RequestInfoProvider */
/* loaded from: classes7.dex */
public final class RequestInfoProvider {
    @NonNull
    private final DataCollector dataCollector;
    @NonNull
    private final SdkConfiguration sdkConfiguration;
    @NonNull
    private final SomaGdprDataSource somaGdprDataSource;
    @NonNull
    private final SomaLgpdDataSource somaLgpdDataSource;
    @NonNull
    private final SystemInfo systemInfo;

    public RequestInfoProvider(@NonNull DataCollector dataCollector, @NonNull SomaGdprDataSource somaGdprDataSource, @NonNull SomaLgpdDataSource somaLgpdDataSource, @NonNull SdkConfiguration sdkConfiguration, @NonNull SystemInfo systemInfo) {
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector);
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource);
        this.somaLgpdDataSource = (SomaLgpdDataSource) Objects.requireNonNull(somaLgpdDataSource);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration);
        this.systemInfo = (SystemInfo) Objects.requireNonNull(systemInfo);
    }

    @NonNull
    public AdContentRating getAdContentRating() {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        AdContentRating adContentRating = this.sdkConfiguration.getAdContentRating();
        if (adContentRating != null && somaGdprData.isUsageAllowedFor(PiiParam.AGE)) {
            return adContentRating;
        }
        return AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED;
    }

    @Nullable
    public GeoInfo getGeoInfo(@Nullable UserInfo userInfo) {
        LatLng latLng;
        GeoType geoType;
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        if (!somaGdprData.isUsageAllowedFor(PiiParam.GPS) || ((somaLgpdData.isLgpdEnabled() && !somaLgpdData.isUsageAllowedFor()) || !this.sdkConfiguration.isGpsEnabled() || this.sdkConfiguration.isCoppaEnabled() || SmaatoSdk.isAgeRestrictedUser())) {
            return null;
        }
        LocationProvider.DetectedLocation locationData = this.dataCollector.getLocationData();
        if (locationData != null) {
            LatLng latLng2 = new LatLng(locationData.getLatitude(), locationData.getLongitude(), locationData.getAccuracy(), locationData.getLastUpdatedMillis());
            if (locationData.getType() == LocationProvider.DetectedLocation.TYPE.GPS) {
                geoType = GeoType.GPS;
            } else {
                geoType = GeoType.IP_ADDRESS;
            }
            return new GeoInfo(latLng2, geoType);
        }
        if (userInfo != null && (latLng = userInfo.getLatLng()) != null) {
            return new GeoInfo(latLng, GeoType.USER_PROVIDED);
        }
        return null;
    }

    @Nullable
    public String getGoogleAdId() {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        if (!somaGdprData.isUsageAllowedFor(PiiParam.GOOGLE_AD_ID)) {
            return null;
        }
        if ((somaLgpdData.isLgpdEnabled() && !somaLgpdData.isUsageAllowedFor()) || this.sdkConfiguration.isCoppaEnabled()) {
            return null;
        }
        return this.systemInfo.getGoogleAdvertisingId();
    }

    @NonNull
    public String getLanguage(@NonNull UserInfo userInfo) {
        final String language = userInfo.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return this.systemInfo.getLanguage();
        }
        List m39343of = Lists.m39343of(Locale.getISOLanguages());
        java.util.Objects.requireNonNull(language);
        if (!Lists.any(m39343of, new Predicate() { // from class: com.smaato.sdk.core.ad.b
            @Override // com.smaato.sdk.core.util.p574fi.Predicate
            public final boolean test(Object obj) {
                return language.equals((String) obj);
            }
        })) {
            return this.systemInfo.getLanguage();
        }
        return language;
    }
}
