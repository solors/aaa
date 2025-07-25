package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.user.Gender;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MfxBidRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MfxBidRequest {
    @Nullable
    private final Integer accuracy;
    @Nullable
    private final Double altitude;
    @NotNull
    private final String appVersion;
    private final int bannerHeight;
    private final int bannerWidth;
    private final boolean coppa;
    private final int deviceHeight;
    @Nullable
    private final DeviceType deviceType;
    private final int deviceWidth;
    private final boolean dnt;
    @Nullable
    private final String eidSource;
    @NotNull
    private final Map<String, String> eidValues;
    @NotNull
    private final Gender gender;
    @Nullable
    private final String gpp;
    @Nullable
    private final String ifa;
    @Nullable
    private final String lang;
    @Nullable
    private final Integer lastfix;
    @Nullable
    private final Double lat;
    private final boolean lmt;
    @Nullable
    private final Double lon;
    @Nullable
    private final Float pressure;
    @NotNull
    private final String sdkVersion;
    @NotNull
    private final String tagid;
    private final boolean test;
    @Nullable
    private final String usPrivacy;
    @Nullable
    private final String userAgent;
    @Nullable
    private final Integer yearOfBirth;

    public MfxBidRequest(@NotNull String tagid, @NotNull String appVersion, boolean z, @Nullable String str, boolean z2, boolean z3, @Nullable String str2, @Nullable String str3, @Nullable DeviceType deviceType, int i, int i2, @Nullable Double d, @Nullable Double d2, @Nullable Integer num, @Nullable Integer num2, @Nullable Double d3, @Nullable Float f, @NotNull Map<String, String> eidValues, @Nullable String str4, @Nullable Integer num3, @NotNull Gender gender, boolean z4, @Nullable String str5, @Nullable String str6, int i3, int i4, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(tagid, "tagid");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(eidValues, "eidValues");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.tagid = tagid;
        this.appVersion = appVersion;
        this.test = z;
        this.ifa = str;
        this.lmt = z2;
        this.dnt = z3;
        this.userAgent = str2;
        this.lang = str3;
        this.deviceType = deviceType;
        this.deviceWidth = i;
        this.deviceHeight = i2;
        this.lat = d;
        this.lon = d2;
        this.lastfix = num;
        this.accuracy = num2;
        this.altitude = d3;
        this.pressure = f;
        this.eidValues = eidValues;
        this.eidSource = str4;
        this.yearOfBirth = num3;
        this.gender = gender;
        this.coppa = z4;
        this.gpp = str5;
        this.usPrivacy = str6;
        this.bannerWidth = i3;
        this.bannerHeight = i4;
        this.sdkVersion = sdkVersion;
    }

    @NotNull
    public final String component1() {
        return this.tagid;
    }

    public final int component10() {
        return this.deviceWidth;
    }

    public final int component11() {
        return this.deviceHeight;
    }

    @Nullable
    public final Double component12() {
        return this.lat;
    }

    @Nullable
    public final Double component13() {
        return this.lon;
    }

    @Nullable
    public final Integer component14() {
        return this.lastfix;
    }

    @Nullable
    public final Integer component15() {
        return this.accuracy;
    }

    @Nullable
    public final Double component16() {
        return this.altitude;
    }

    @Nullable
    public final Float component17() {
        return this.pressure;
    }

    @NotNull
    public final Map<String, String> component18() {
        return this.eidValues;
    }

    @Nullable
    public final String component19() {
        return this.eidSource;
    }

    @NotNull
    public final String component2() {
        return this.appVersion;
    }

    @Nullable
    public final Integer component20() {
        return this.yearOfBirth;
    }

    @NotNull
    public final Gender component21() {
        return this.gender;
    }

    public final boolean component22() {
        return this.coppa;
    }

    @Nullable
    public final String component23() {
        return this.gpp;
    }

    @Nullable
    public final String component24() {
        return this.usPrivacy;
    }

    public final int component25() {
        return this.bannerWidth;
    }

    public final int component26() {
        return this.bannerHeight;
    }

    @NotNull
    public final String component27() {
        return this.sdkVersion;
    }

    public final boolean component3() {
        return this.test;
    }

    @Nullable
    public final String component4() {
        return this.ifa;
    }

    public final boolean component5() {
        return this.lmt;
    }

    public final boolean component6() {
        return this.dnt;
    }

    @Nullable
    public final String component7() {
        return this.userAgent;
    }

    @Nullable
    public final String component8() {
        return this.lang;
    }

    @Nullable
    public final DeviceType component9() {
        return this.deviceType;
    }

    @NotNull
    public final MfxBidRequest copy(@NotNull String tagid, @NotNull String appVersion, boolean z, @Nullable String str, boolean z2, boolean z3, @Nullable String str2, @Nullable String str3, @Nullable DeviceType deviceType, int i, int i2, @Nullable Double d, @Nullable Double d2, @Nullable Integer num, @Nullable Integer num2, @Nullable Double d3, @Nullable Float f, @NotNull Map<String, String> eidValues, @Nullable String str4, @Nullable Integer num3, @NotNull Gender gender, boolean z4, @Nullable String str5, @Nullable String str6, int i3, int i4, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(tagid, "tagid");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(eidValues, "eidValues");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new MfxBidRequest(tagid, appVersion, z, str, z2, z3, str2, str3, deviceType, i, i2, d, d2, num, num2, d3, f, eidValues, str4, num3, gender, z4, str5, str6, i3, i4, sdkVersion);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof MfxBidRequest) {
                MfxBidRequest mfxBidRequest = (MfxBidRequest) obj;
                if (!Intrinsics.m17075f(this.tagid, mfxBidRequest.tagid) || !Intrinsics.m17075f(this.appVersion, mfxBidRequest.appVersion) || this.test != mfxBidRequest.test || !Intrinsics.m17075f(this.ifa, mfxBidRequest.ifa) || this.lmt != mfxBidRequest.lmt || this.dnt != mfxBidRequest.dnt || !Intrinsics.m17075f(this.userAgent, mfxBidRequest.userAgent) || !Intrinsics.m17075f(this.lang, mfxBidRequest.lang) || !Intrinsics.m17075f(this.deviceType, mfxBidRequest.deviceType) || this.deviceWidth != mfxBidRequest.deviceWidth || this.deviceHeight != mfxBidRequest.deviceHeight || !Intrinsics.m17075f(this.lat, mfxBidRequest.lat) || !Intrinsics.m17075f(this.lon, mfxBidRequest.lon) || !Intrinsics.m17075f(this.lastfix, mfxBidRequest.lastfix) || !Intrinsics.m17075f(this.accuracy, mfxBidRequest.accuracy) || !Intrinsics.m17075f(this.altitude, mfxBidRequest.altitude) || !Intrinsics.m17075f(this.pressure, mfxBidRequest.pressure) || !Intrinsics.m17075f(this.eidValues, mfxBidRequest.eidValues) || !Intrinsics.m17075f(this.eidSource, mfxBidRequest.eidSource) || !Intrinsics.m17075f(this.yearOfBirth, mfxBidRequest.yearOfBirth) || !Intrinsics.m17075f(this.gender, mfxBidRequest.gender) || this.coppa != mfxBidRequest.coppa || !Intrinsics.m17075f(this.gpp, mfxBidRequest.gpp) || !Intrinsics.m17075f(this.usPrivacy, mfxBidRequest.usPrivacy) || this.bannerWidth != mfxBidRequest.bannerWidth || this.bannerHeight != mfxBidRequest.bannerHeight || !Intrinsics.m17075f(this.sdkVersion, mfxBidRequest.sdkVersion)) {
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

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getBannerHeight() {
        return this.bannerHeight;
    }

    public final int getBannerWidth() {
        return this.bannerWidth;
    }

    public final boolean getCoppa() {
        return this.coppa;
    }

    public final int getDeviceHeight() {
        return this.deviceHeight;
    }

    @Nullable
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final int getDeviceWidth() {
        return this.deviceWidth;
    }

    public final boolean getDnt() {
        return this.dnt;
    }

    @Nullable
    public final String getEidSource() {
        return this.eidSource;
    }

    @NotNull
    public final Map<String, String> getEidValues() {
        return this.eidValues;
    }

    @NotNull
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final String getGpp() {
        return this.gpp;
    }

    @Nullable
    public final String getIfa() {
        return this.ifa;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final Integer getLastfix() {
        return this.lastfix;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    public final boolean getLmt() {
        return this.lmt;
    }

    @Nullable
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    public final Float getPressure() {
        return this.pressure;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getTagid() {
        return this.tagid;
    }

    public final boolean getTest() {
        return this.test;
    }

    @Nullable
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    @Nullable
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    public final Integer getYearOfBirth() {
        return this.yearOfBirth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str = this.tagid;
        int i19 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i20 = i * 31;
        String str2 = this.appVersion;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i21 = (i20 + i2) * 31;
        boolean z = this.test;
        int i22 = 1;
        int i23 = z;
        if (z != 0) {
            i23 = 1;
        }
        int i24 = (i21 + i23) * 31;
        String str3 = this.ifa;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i25 = (i24 + i3) * 31;
        boolean z2 = this.lmt;
        int i26 = z2;
        if (z2 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        boolean z3 = this.dnt;
        int i28 = z3;
        if (z3 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        String str4 = this.userAgent;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i30 = (i29 + i4) * 31;
        String str5 = this.lang;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i31 = (i30 + i5) * 31;
        DeviceType deviceType = this.deviceType;
        if (deviceType != null) {
            i6 = deviceType.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode = (((((i31 + i6) * 31) + Integer.hashCode(this.deviceWidth)) * 31) + Integer.hashCode(this.deviceHeight)) * 31;
        Double d = this.lat;
        if (d != null) {
            i7 = d.hashCode();
        } else {
            i7 = 0;
        }
        int i32 = (hashCode + i7) * 31;
        Double d2 = this.lon;
        if (d2 != null) {
            i8 = d2.hashCode();
        } else {
            i8 = 0;
        }
        int i33 = (i32 + i8) * 31;
        Integer num = this.lastfix;
        if (num != null) {
            i9 = num.hashCode();
        } else {
            i9 = 0;
        }
        int i34 = (i33 + i9) * 31;
        Integer num2 = this.accuracy;
        if (num2 != null) {
            i10 = num2.hashCode();
        } else {
            i10 = 0;
        }
        int i35 = (i34 + i10) * 31;
        Double d3 = this.altitude;
        if (d3 != null) {
            i11 = d3.hashCode();
        } else {
            i11 = 0;
        }
        int i36 = (i35 + i11) * 31;
        Float f = this.pressure;
        if (f != null) {
            i12 = f.hashCode();
        } else {
            i12 = 0;
        }
        int i37 = (i36 + i12) * 31;
        Map<String, String> map = this.eidValues;
        if (map != null) {
            i13 = map.hashCode();
        } else {
            i13 = 0;
        }
        int i38 = (i37 + i13) * 31;
        String str6 = this.eidSource;
        if (str6 != null) {
            i14 = str6.hashCode();
        } else {
            i14 = 0;
        }
        int i39 = (i38 + i14) * 31;
        Integer num3 = this.yearOfBirth;
        if (num3 != null) {
            i15 = num3.hashCode();
        } else {
            i15 = 0;
        }
        int i40 = (i39 + i15) * 31;
        Gender gender = this.gender;
        if (gender != null) {
            i16 = gender.hashCode();
        } else {
            i16 = 0;
        }
        int i41 = (i40 + i16) * 31;
        boolean z4 = this.coppa;
        if (!z4) {
            i22 = z4 ? 1 : 0;
        }
        int i42 = (i41 + i22) * 31;
        String str7 = this.gpp;
        if (str7 != null) {
            i17 = str7.hashCode();
        } else {
            i17 = 0;
        }
        int i43 = (i42 + i17) * 31;
        String str8 = this.usPrivacy;
        if (str8 != null) {
            i18 = str8.hashCode();
        } else {
            i18 = 0;
        }
        int hashCode2 = (((((i43 + i18) * 31) + Integer.hashCode(this.bannerWidth)) * 31) + Integer.hashCode(this.bannerHeight)) * 31;
        String str9 = this.sdkVersion;
        if (str9 != null) {
            i19 = str9.hashCode();
        }
        return hashCode2 + i19;
    }

    @NotNull
    public String toString() {
        return "MfxBidRequest(tagid=" + this.tagid + ", appVersion=" + this.appVersion + ", test=" + this.test + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", dnt=" + this.dnt + ", userAgent=" + this.userAgent + ", lang=" + this.lang + ", deviceType=" + this.deviceType + ", deviceWidth=" + this.deviceWidth + ", deviceHeight=" + this.deviceHeight + ", lat=" + this.lat + ", lon=" + this.lon + ", lastfix=" + this.lastfix + ", accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", pressure=" + this.pressure + ", eidValues=" + this.eidValues + ", eidSource=" + this.eidSource + ", yearOfBirth=" + this.yearOfBirth + ", gender=" + this.gender + ", coppa=" + this.coppa + ", gpp=" + this.gpp + ", usPrivacy=" + this.usPrivacy + ", bannerWidth=" + this.bannerWidth + ", bannerHeight=" + this.bannerHeight + ", sdkVersion=" + this.sdkVersion + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ MfxBidRequest(java.lang.String r31, java.lang.String r32, boolean r33, java.lang.String r34, boolean r35, boolean r36, java.lang.String r37, java.lang.String r38, com.mobilefuse.sdk.device.DeviceType r39, int r40, int r41, java.lang.Double r42, java.lang.Double r43, java.lang.Integer r44, java.lang.Integer r45, java.lang.Double r46, java.lang.Float r47, java.util.Map r48, java.lang.String r49, java.lang.Integer r50, com.mobilefuse.sdk.user.Gender r51, boolean r52, java.lang.String r53, java.lang.String r54, int r55, int r56, java.lang.String r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.network.model.MfxBidRequest.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, com.mobilefuse.sdk.device.DeviceType, int, int, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.Double, java.lang.Float, java.util.Map, java.lang.String, java.lang.Integer, com.mobilefuse.sdk.user.Gender, boolean, java.lang.String, java.lang.String, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
