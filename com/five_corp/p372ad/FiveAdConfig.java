package com.five_corp.p372ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.EnumSet;
import java.util.Objects;

/* renamed from: com.five_corp.ad.FiveAdConfig */
/* loaded from: classes4.dex */
public class FiveAdConfig {
    public final String appId;
    @Nullable
    public FiveAdAgeRating fiveAdAgeRating;
    @Nullable
    public NeedChildDirectedTreatment needChildDirectedTreatment;
    @Nullable
    public NeedGdprNonPersonalizedAdsTreatment needGdprNonPersonalizedAdsTreatment;
    @Deprecated
    public EnumSet<FiveAdFormat> formats = EnumSet.noneOf(FiveAdFormat.class);
    public boolean isTest = false;

    /* renamed from: a */
    public int f24994a = 1;

    public FiveAdConfig(@NonNull String str) {
        this.appId = str;
    }

    /* renamed from: a */
    public final int m78561a() {
        return this.f24994a;
    }

    public FiveAdConfig deepCopy() {
        FiveAdConfig fiveAdConfig = new FiveAdConfig(this.appId);
        fiveAdConfig.isTest = this.isTest;
        fiveAdConfig.needGdprNonPersonalizedAdsTreatment = getNeedGdprNonPersonalizedAdsTreatment();
        fiveAdConfig.needChildDirectedTreatment = getNeedChildDirectedTreatment();
        fiveAdConfig.fiveAdAgeRating = getFiveAdAgeRating();
        fiveAdConfig.f24994a = this.f24994a;
        return fiveAdConfig;
    }

    public void enableSoundByDefault(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 3;
        }
        this.f24994a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FiveAdConfig fiveAdConfig = (FiveAdConfig) obj;
        if (this.isTest != fiveAdConfig.isTest) {
            return false;
        }
        return Objects.equals(this.appId, fiveAdConfig.appId);
    }

    @NonNull
    public FiveAdAgeRating getFiveAdAgeRating() {
        FiveAdAgeRating fiveAdAgeRating = this.fiveAdAgeRating;
        if (fiveAdAgeRating == null) {
            return FiveAdAgeRating.UNSPECIFIED;
        }
        return fiveAdAgeRating;
    }

    @NonNull
    public NeedChildDirectedTreatment getNeedChildDirectedTreatment() {
        NeedChildDirectedTreatment needChildDirectedTreatment = this.needChildDirectedTreatment;
        if (needChildDirectedTreatment == null) {
            return NeedChildDirectedTreatment.UNSPECIFIED;
        }
        return needChildDirectedTreatment;
    }

    @NonNull
    public NeedGdprNonPersonalizedAdsTreatment getNeedGdprNonPersonalizedAdsTreatment() {
        NeedGdprNonPersonalizedAdsTreatment needGdprNonPersonalizedAdsTreatment = this.needGdprNonPersonalizedAdsTreatment;
        if (needGdprNonPersonalizedAdsTreatment == null) {
            return NeedGdprNonPersonalizedAdsTreatment.UNSPECIFIED;
        }
        return needGdprNonPersonalizedAdsTreatment;
    }

    public int hashCode() {
        int i;
        String str = this.appId;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + (this.isTest ? 1 : 0);
    }
}
