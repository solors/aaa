package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.f5 */
/* loaded from: classes6.dex */
public final class C19270f5 extends AbstractC19256e5 {

    /* renamed from: a */
    public final InterstitialAdEventListener f48199a;

    public C19270f5(InterstitialAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f48199a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdClicked(Object obj, Map params) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f48199a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdFetchSuccessful(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f48199a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdImpression(Object obj) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f48199a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdLoadFailed(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f48199a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdLoadSucceeded(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f48199a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onImraidLog(Object obj, String data) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f48199a, ad2, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onRequestPayloadCreated(byte[] bArr) {
        this.f48199a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f48199a.onRequestPayloadCreationFailed(status);
    }
}
