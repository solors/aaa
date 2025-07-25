package com.mobilefuse.sdk.internal;

import android.content.Context;
import com.ironsource.C19577ad;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.mfx.MfxRequestAd;
import com.mobilefuse.sdk.network.model.MfxBidRequestToMap;
import com.mobilefuse.sdk.service.MobileFuseServices;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider_getTokenDataKt */
/* loaded from: classes7.dex */
public final class MobileFuseBiddingTokenProvider_getTokenData {

    @Metadata
    /* renamed from: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider_getTokenDataKt$WhenMappings */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Partner.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Partner.NIMBUS.ordinal()] = 1;
        }
    }

    private static final void alterPartnerParams(IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest, Map<String, String> map) {
        Set<String> paramsToRemoveForNimbus;
        if (!(iMobileFuseBiddingTokenRequest instanceof MobileFuseBiddingPartnerTokenRequest)) {
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[((MobileFuseBiddingPartnerTokenRequest) iMobileFuseBiddingTokenRequest).getPartner().ordinal()] != 1) {
            paramsToRemoveForNimbus = C37572z0.m17123f();
        } else {
            paramsToRemoveForNimbus = getParamsToRemoveForNimbus();
        }
        for (String str : paramsToRemoveForNimbus) {
            map.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> buildTokenWithRequest(IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest) {
        Map<String, String> m17285D;
        m17285D = C37559r0.m17285D(MfxBidRequestToMap.toStringMap(MfxRequestAd.createBidRequest("", 0, 0, new C23571xc8c5dade(MobileFuseBiddingTokenProvider.Companion.mergePrivacyPreferences$mobilefuse_sdk_core_release(iMobileFuseBiddingTokenRequest.getPrivacyPreferences())), iMobileFuseBiddingTokenRequest.isTestMode())));
        m17285D.put("v", "2");
        m17285D.remove("tagid");
        alterPartnerParams(iMobileFuseBiddingTokenRequest, m17285D);
        return m17285D;
    }

    public static final void getBiddingTokenData(@NotNull IMobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull TokenDataListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MobileFuseServices.requireAllServices(new C23572xeb17482a(request, listener));
    }

    private static final Set<String> getParamsToRemoveForNimbus() {
        Set<String> m17119j;
        m17119j = C37572z0.m17119j(Constants.KEY_TEST, "app_version", EidRequestBuilder.REQUEST_FIELD_IFA, "ua", "lang", CommonUrlParts.DEVICE_TYPE, "device_w", "device_h", EidRequestBuilder.REQUEST_FIELD_LMT, C19577ad.f49134q, "lon", "altitude", "pressure", "coppa", "gpp", "us_privacy", "banner_width", "banner_height");
        return m17119j;
    }
}
