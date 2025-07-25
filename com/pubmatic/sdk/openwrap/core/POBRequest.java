package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class POBRequest {

    /* renamed from: a */
    private final POBImpression[] f70640a;

    /* renamed from: b */
    private final int f70641b;
    @NonNull

    /* renamed from: c */
    private final String f70642c;

    /* renamed from: d */
    private int f70643d = 5;

    /* renamed from: e */
    private boolean f70644e;
    @Nullable

    /* renamed from: f */
    private Integer f70645f;

    /* renamed from: g */
    private boolean f70646g;
    @NonNull

    /* renamed from: h */
    private final POBAdFormat f70647h;
    @Nullable

    /* renamed from: i */
    private Boolean f70648i;
    @Nullable

    /* renamed from: j */
    private String f70649j;

    /* loaded from: classes7.dex */
    public enum API {
        VPAID1(1),
        VPAID2(2),
        MRAID1(3),
        ORMMA(4),
        MRAID2(5),
        MRAID3(6),
        OMSDK(7);
        

        /* renamed from: b */
        private final int f70651b;

        API(int i) {
            this.f70651b = i;
        }

        public int getValue() {
            return this.f70651b;
        }
    }

    /* loaded from: classes7.dex */
    public enum AdPosition {
        UNKNOWN(0),
        ABOVE_THE_FOLD(1),
        BELOW_THE_FOLD(3),
        HEADER(4),
        FOOTER(5),
        SIDEBAR(6),
        FULL_SCREEN(7);
        

        /* renamed from: b */
        private final int f70653b;

        AdPosition(int i) {
            this.f70653b = i;
        }

        public int getValue() {
            return this.f70653b;
        }
    }

    private POBRequest(@NonNull String str, int i, @NonNull POBAdFormat pOBAdFormat, @NonNull POBImpression... pOBImpressionArr) {
        this.f70642c = str;
        this.f70641b = i;
        this.f70647h = pOBAdFormat;
        this.f70640a = pOBImpressionArr;
    }

    @Nullable
    public static POBRequest createInstance(@NonNull String str, int i, @NonNull POBAdFormat pOBAdFormat, @NonNull POBImpression... pOBImpressionArr) {
        if (!POBUtils.isNullOrEmpty(str) && !POBUtils.isNull(pOBImpressionArr) && pOBImpressionArr.length > 0) {
            return new POBRequest(str, i, pOBAdFormat, pOBImpressionArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m40292a() {
        return this.f70644e;
    }

    public void enableDebugState(boolean z) {
        this.f70646g = z;
    }

    public void enableReturnAllBidStatus(boolean z) {
        this.f70644e = z;
    }

    public void enableTestMode(boolean z) {
        this.f70648i = Boolean.valueOf(z);
    }

    @Nullable
    public String getAdServerUrl() {
        return this.f70649j;
    }

    @NonNull
    public String getAdUnitId() {
        POBImpression[] impressions = getImpressions();
        if (impressions != null && impressions.length > 0) {
            return impressions[0].getAdUnitId();
        }
        return "";
    }

    @Nullable
    public POBImpression[] getImpressions() {
        POBImpression[] pOBImpressionArr = this.f70640a;
        if (pOBImpressionArr != null && pOBImpressionArr.length > 0) {
            return (POBImpression[]) Arrays.copyOf(pOBImpressionArr, pOBImpressionArr.length);
        }
        return null;
    }

    public int getNetworkTimeout() {
        return this.f70643d;
    }

    @NonNull
    public POBAdFormat getPlacementType() {
        return this.f70647h;
    }

    public int getProfileId() {
        return this.f70641b;
    }

    @NonNull
    public String getPubId() {
        return this.f70642c;
    }

    @Nullable
    public Boolean getTestMode() {
        return this.f70648i;
    }

    @Nullable
    public Integer getVersionId() {
        return this.f70645f;
    }

    public boolean isDebugStateEnabled() {
        return this.f70646g;
    }

    public void setAdServerUrl(@Nullable String str) {
        this.f70649j = str;
    }

    public void setNetworkTimeout(int i) {
        if (i > 0) {
            this.f70643d = i;
        }
    }

    public void setVersionId(@Nullable Integer num) {
        this.f70645f = num;
    }
}
