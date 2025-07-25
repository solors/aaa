package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdObject.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdObject {
    @Nullable
    private final AdPlayer adPlayer;
    @NotNull
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isScarAd;
    @NotNull
    private final UnityAdsLoadOptions loadOptions;
    @NotNull
    private final ByteString opportunityId;
    @NotNull
    private final String placementId;
    @Nullable
    private String playerServerId;
    @Nullable
    private String scarAdString;
    @Nullable
    private String scarAdUnitId;
    @Nullable
    private String scarQueryId;
    @NotNull
    private ByteString trackingToken;

    public AdObject(@NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable AdPlayer adPlayer, @Nullable String str4, @NotNull UnityAdsLoadOptions loadOptions, boolean z2, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.adPlayer = adPlayer;
        this.playerServerId = str4;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z2;
        this.adType = adType;
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, int i, Object obj) {
        ByteString byteString3;
        String str6;
        ByteString byteString4;
        boolean z3;
        String str7;
        String str8;
        String str9;
        AdPlayer adPlayer2;
        String str10;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        if ((i & 1) != 0) {
            byteString3 = adObject.opportunityId;
        } else {
            byteString3 = byteString;
        }
        if ((i & 2) != 0) {
            str6 = adObject.placementId;
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            byteString4 = adObject.trackingToken;
        } else {
            byteString4 = byteString2;
        }
        if ((i & 8) != 0) {
            z3 = adObject.isScarAd;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            str7 = adObject.scarQueryId;
        } else {
            str7 = str2;
        }
        if ((i & 32) != 0) {
            str8 = adObject.scarAdUnitId;
        } else {
            str8 = str3;
        }
        if ((i & 64) != 0) {
            str9 = adObject.scarAdString;
        } else {
            str9 = str4;
        }
        if ((i & 128) != 0) {
            adPlayer2 = adObject.adPlayer;
        } else {
            adPlayer2 = adPlayer;
        }
        if ((i & 256) != 0) {
            str10 = adObject.playerServerId;
        } else {
            str10 = str5;
        }
        if ((i & 512) != 0) {
            unityAdsLoadOptions2 = adObject.loadOptions;
        } else {
            unityAdsLoadOptions2 = unityAdsLoadOptions;
        }
        if ((i & 1024) != 0) {
            z4 = adObject.isHeaderBidding;
        } else {
            z4 = z2;
        }
        if ((i & 2048) != 0) {
            diagnosticAdType2 = adObject.adType;
        } else {
            diagnosticAdType2 = diagnosticAdType;
        }
        return adObject.copy(byteString3, str6, byteString4, z3, str7, str8, str9, adPlayer2, str10, unityAdsLoadOptions2, z4, diagnosticAdType2);
    }

    @NotNull
    public final ByteString component1() {
        return this.opportunityId;
    }

    @NotNull
    public final UnityAdsLoadOptions component10() {
        return this.loadOptions;
    }

    public final boolean component11() {
        return this.isHeaderBidding;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component12() {
        return this.adType;
    }

    @NotNull
    public final String component2() {
        return this.placementId;
    }

    @NotNull
    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    @Nullable
    public final String component5() {
        return this.scarQueryId;
    }

    @Nullable
    public final String component6() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String component7() {
        return this.scarAdString;
    }

    @Nullable
    public final AdPlayer component8() {
        return this.adPlayer;
    }

    @Nullable
    public final String component9() {
        return this.playerServerId;
    }

    @NotNull
    public final AdObject copy(@NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable AdPlayer adPlayer, @Nullable String str4, @NotNull UnityAdsLoadOptions loadOptions, boolean z2, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new AdObject(opportunityId, placementId, trackingToken, z, str, str2, str3, adPlayer, str4, loadOptions, z2, adType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        if (Intrinsics.m17075f(this.opportunityId, adObject.opportunityId) && Intrinsics.m17075f(this.placementId, adObject.placementId) && Intrinsics.m17075f(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && Intrinsics.m17075f(this.scarQueryId, adObject.scarQueryId) && Intrinsics.m17075f(this.scarAdUnitId, adObject.scarAdUnitId) && Intrinsics.m17075f(this.scarAdString, adObject.scarAdString) && Intrinsics.m17075f(this.adPlayer, adObject.adPlayer) && Intrinsics.m17075f(this.playerServerId, adObject.playerServerId) && Intrinsics.m17075f(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType) {
            return true;
        }
        return false;
    }

    @Nullable
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @NotNull
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @Nullable
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @Nullable
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @NotNull
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z = this.isScarAd;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode5 + i2) * 31;
        String str = this.scarQueryId;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        String str2 = this.scarAdUnitId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str3 = this.scarAdString;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        AdPlayer adPlayer = this.adPlayer;
        if (adPlayer == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = adPlayer.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        String str4 = this.playerServerId;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        int hashCode6 = (((i8 + i4) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z2 = this.isHeaderBidding;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((hashCode6 + i) * 31) + this.adType.hashCode();
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setPlayerServerId(@Nullable String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z) {
        this.isScarAd = z;
    }

    public final void setScarAdString(@Nullable String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(@Nullable String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(@Nullable String str) {
        this.scarQueryId = str;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    @NotNull
    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteString, str, byteString2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : adPlayer, (i & 256) != 0 ? null : str5, unityAdsLoadOptions, z2, diagnosticAdType);
    }
}
