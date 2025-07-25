package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class AdQualityResult {
    @NotNull
    private final String beaconUrl;
    @Nullable
    private String extras;
    @NotNull
    private String imageLocation;
    @Nullable
    private String sdkModelResult;

    public AdQualityResult(@NotNull String imageLocation, @Nullable String str, @NotNull String beaconUrl, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.imageLocation;
    }

    @Nullable
    public final String component2() {
        return this.sdkModelResult;
    }

    @NotNull
    public final String component3() {
        return this.beaconUrl;
    }

    @Nullable
    public final String component4() {
        return this.extras;
    }

    @NotNull
    public final AdQualityResult copy(@NotNull String imageLocation, @Nullable String str, @NotNull String beaconUrl, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        return new AdQualityResult(imageLocation, str, beaconUrl, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) obj;
        if (Intrinsics.m17075f(this.imageLocation, adQualityResult.imageLocation) && Intrinsics.m17075f(this.sdkModelResult, adQualityResult.sdkModelResult) && Intrinsics.m17075f(this.beaconUrl, adQualityResult.beaconUrl) && Intrinsics.m17075f(this.extras, adQualityResult.extras)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (this.beaconUrl.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        String str2 = this.extras;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setExtras(@Nullable String str) {
        this.extras = str;
    }

    public final void setImageLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(@Nullable String str) {
        this.sdkModelResult = str;
    }

    @NotNull
    public String toString() {
        return "AdQualityResult(imageLocation=" + this.imageLocation + ", sdkModelResult=" + this.sdkModelResult + ", beaconUrl=" + this.beaconUrl + ", extras=" + this.extras + ')';
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
