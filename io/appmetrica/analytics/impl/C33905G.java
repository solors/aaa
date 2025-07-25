package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.G */
/* loaded from: classes9.dex */
public final class C33905G implements InterfaceC33830D {

    /* renamed from: a */
    public final InterfaceC33830D f92879a;

    public C33905G(@NonNull InterfaceC33830D interfaceC33830D) {
        this.f92879a = interfaceC33830D;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33830D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo22314a(@NonNull Context context) {
        return m22594a(new C33855E(this, context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33830D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo22313a(@NonNull Context context, @NonNull InterfaceC34355Yh interfaceC34355Yh) {
        return m22594a(new C33880F(this, context, interfaceC34355Yh));
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m22594a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !MobileFuseDefaults.ADVERTISING_ID_ZEROS.equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
