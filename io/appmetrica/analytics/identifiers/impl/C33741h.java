package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.identifiers.impl.h */
/* loaded from: classes9.dex */
public final class C33741h implements InterfaceC33735b {
    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC33735b
    @NotNull
    /* renamed from: a */
    public final C33736c mo22788a(@NotNull Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new C33736c(IdentifierStatus.OK, new C33734a(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new C33736c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        } catch (Throwable th) {
            IdentifierStatus identifierStatus = IdentifierStatus.UNKNOWN;
            return new C33736c(identifierStatus, null, "exception while fetching google adv_id: " + th.getMessage(), 2);
        }
    }
}
