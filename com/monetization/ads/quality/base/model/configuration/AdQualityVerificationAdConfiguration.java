package com.monetization.ads.quality.base.model.configuration;

import com.yandex.mobile.ads.impl.C31014o3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class AdQualityVerificationAdConfiguration {
    @Nullable
    private final String adContent;
    @Nullable
    private final String adNetworkCreativeId;
    @Nullable
    private final String adNetworkUnitId;
    @NotNull
    private final Object adObject;
    @NotNull
    private final AdQualityVerifierAdType adType;
    @NotNull
    private final String adUnitId;
    @Nullable
    private final Map<String, Object> extraData;
    @Nullable
    private final String mediationId;
    @NotNull
    private final AdQualityVerifiableNetwork verifiableAdNetwork;

    public AdQualityVerificationAdConfiguration(@NotNull AdQualityVerifiableNetwork verifiableAdNetwork, @NotNull String adUnitId, @NotNull Object adObject, @NotNull AdQualityVerifierAdType adType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(verifiableAdNetwork, "verifiableAdNetwork");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.verifiableAdNetwork = verifiableAdNetwork;
        this.adUnitId = adUnitId;
        this.adObject = adObject;
        this.adType = adType;
        this.adContent = str;
        this.adNetworkUnitId = str2;
        this.mediationId = str3;
        this.adNetworkCreativeId = str4;
        this.extraData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdQualityVerificationAdConfiguration copy$default(AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i, Object obj2) {
        AdQualityVerifiableNetwork adQualityVerifiableNetwork2;
        String str6;
        Object obj3;
        AdQualityVerifierAdType adQualityVerifierAdType2;
        String str7;
        String str8;
        String str9;
        String str10;
        Map<String, ? extends Object> map2;
        if ((i & 1) != 0) {
            adQualityVerifiableNetwork2 = adQualityVerificationAdConfiguration.verifiableAdNetwork;
        } else {
            adQualityVerifiableNetwork2 = adQualityVerifiableNetwork;
        }
        if ((i & 2) != 0) {
            str6 = adQualityVerificationAdConfiguration.adUnitId;
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            obj3 = adQualityVerificationAdConfiguration.adObject;
        } else {
            obj3 = obj;
        }
        if ((i & 8) != 0) {
            adQualityVerifierAdType2 = adQualityVerificationAdConfiguration.adType;
        } else {
            adQualityVerifierAdType2 = adQualityVerifierAdType;
        }
        if ((i & 16) != 0) {
            str7 = adQualityVerificationAdConfiguration.adContent;
        } else {
            str7 = str2;
        }
        if ((i & 32) != 0) {
            str8 = adQualityVerificationAdConfiguration.adNetworkUnitId;
        } else {
            str8 = str3;
        }
        if ((i & 64) != 0) {
            str9 = adQualityVerificationAdConfiguration.mediationId;
        } else {
            str9 = str4;
        }
        if ((i & 128) != 0) {
            str10 = adQualityVerificationAdConfiguration.adNetworkCreativeId;
        } else {
            str10 = str5;
        }
        if ((i & 256) != 0) {
            map2 = adQualityVerificationAdConfiguration.extraData;
        } else {
            map2 = map;
        }
        return adQualityVerificationAdConfiguration.copy(adQualityVerifiableNetwork2, str6, obj3, adQualityVerifierAdType2, str7, str8, str9, str10, map2);
    }

    @NotNull
    public final AdQualityVerifiableNetwork component1() {
        return this.verifiableAdNetwork;
    }

    @NotNull
    public final String component2() {
        return this.adUnitId;
    }

    @NotNull
    public final Object component3() {
        return this.adObject;
    }

    @NotNull
    public final AdQualityVerifierAdType component4() {
        return this.adType;
    }

    @Nullable
    public final String component5() {
        return this.adContent;
    }

    @Nullable
    public final String component6() {
        return this.adNetworkUnitId;
    }

    @Nullable
    public final String component7() {
        return this.mediationId;
    }

    @Nullable
    public final String component8() {
        return this.adNetworkCreativeId;
    }

    @Nullable
    public final Map<String, Object> component9() {
        return this.extraData;
    }

    @NotNull
    public final AdQualityVerificationAdConfiguration copy(@NotNull AdQualityVerifiableNetwork verifiableAdNetwork, @NotNull String adUnitId, @NotNull Object adObject, @NotNull AdQualityVerifierAdType adType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(verifiableAdNetwork, "verifiableAdNetwork");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new AdQualityVerificationAdConfiguration(verifiableAdNetwork, adUnitId, adObject, adType, str, str2, str3, str4, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerificationAdConfiguration)) {
            return false;
        }
        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = (AdQualityVerificationAdConfiguration) obj;
        if (this.verifiableAdNetwork == adQualityVerificationAdConfiguration.verifiableAdNetwork && Intrinsics.m17075f(this.adUnitId, adQualityVerificationAdConfiguration.adUnitId) && Intrinsics.m17075f(this.adObject, adQualityVerificationAdConfiguration.adObject) && this.adType == adQualityVerificationAdConfiguration.adType && Intrinsics.m17075f(this.adContent, adQualityVerificationAdConfiguration.adContent) && Intrinsics.m17075f(this.adNetworkUnitId, adQualityVerificationAdConfiguration.adNetworkUnitId) && Intrinsics.m17075f(this.mediationId, adQualityVerificationAdConfiguration.mediationId) && Intrinsics.m17075f(this.adNetworkCreativeId, adQualityVerificationAdConfiguration.adNetworkCreativeId) && Intrinsics.m17075f(this.extraData, adQualityVerificationAdConfiguration.extraData)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getAdContent() {
        return this.adContent;
    }

    @Nullable
    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    @Nullable
    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    @NotNull
    public final Object getAdObject() {
        return this.adObject;
    }

    @NotNull
    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final String getMediationId() {
        return this.mediationId;
    }

    @NotNull
    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.adType.hashCode() + ((this.adObject.hashCode() + C31014o3.m31189a(this.adUnitId, this.verifiableAdNetwork.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.adContent;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str2 = this.adNetworkUnitId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.mediationId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.adNetworkCreativeId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map<String, Object> map = this.extraData;
        if (map != null) {
            i = map.hashCode();
        }
        return i5 + i;
    }

    @NotNull
    public String toString() {
        AdQualityVerifiableNetwork adQualityVerifiableNetwork = this.verifiableAdNetwork;
        String str = this.adUnitId;
        Object obj = this.adObject;
        AdQualityVerifierAdType adQualityVerifierAdType = this.adType;
        String str2 = this.adContent;
        String str3 = this.adNetworkUnitId;
        String str4 = this.mediationId;
        String str5 = this.adNetworkCreativeId;
        Map<String, Object> map = this.extraData;
        return "AdQualityVerificationAdConfiguration(verifiableAdNetwork=" + adQualityVerifiableNetwork + ", adUnitId=" + str + ", adObject=" + obj + ", adType=" + adQualityVerifierAdType + ", adContent=" + str2 + ", adNetworkUnitId=" + str3 + ", mediationId=" + str4 + ", adNetworkCreativeId=" + str5 + ", extraData=" + map + ")";
    }

    public /* synthetic */ AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adQualityVerifiableNetwork, str, obj, adQualityVerifierAdType, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : map);
    }
}
