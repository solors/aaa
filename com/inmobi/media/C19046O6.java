package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.O6 */
/* loaded from: classes6.dex */
public final class C19046O6 extends AbstractC19033N6 {

    /* renamed from: a */
    public final NativeAdEventListener f47578a;

    public C19046O6(NativeAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f47578a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdClicked(Object obj, Map params) {
        InMobiNative ad2 = (InMobiNative) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f47578a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdFetchSuccessful(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f47578a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdImpression(Object obj) {
        InMobiNative ad2 = (InMobiNative) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f47578a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdLoadFailed(Object obj, InMobiAdRequestStatus status) {
        InMobiNative ad2 = (InMobiNative) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f47578a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onAdLoadSucceeded(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f47578a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onImraidLog(Object obj, String data) {
        InMobiNative ad2 = (InMobiNative) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", NativeAdEventListener.class, InMobiNative.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f47578a, ad2, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onRequestPayloadCreated(byte[] bArr) {
        this.f47578a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.AbstractC19460t
    public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f47578a.onRequestPayloadCreationFailed(status);
    }
}
