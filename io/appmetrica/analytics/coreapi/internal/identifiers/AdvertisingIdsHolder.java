package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a */
    private final AdTrackingInfoResult f92342a;

    /* renamed from: b */
    private final AdTrackingInfoResult f92343b;

    /* renamed from: c */
    private final AdTrackingInfoResult f92344c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f92342a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f92343b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f92344c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f92342a + ", mHuawei=" + this.f92343b + ", yandex=" + this.f92344c + '}';
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f92342a = adTrackingInfoResult;
        this.f92343b = adTrackingInfoResult2;
        this.f92344c = adTrackingInfoResult3;
    }
}
