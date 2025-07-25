package com.smaato.sdk.nativead.model;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.mvvm.model.AdRequest;
import com.smaato.sdk.core.mvvm.model.soma.SomaAdRequest;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.nativead.NativeAdRequest;
import com.smaato.sdk.nativead.model.NativeSomaAdRequest;

/* loaded from: classes7.dex */
public class NativeSomaAdRequest extends SomaAdRequest {
    private final boolean shouldFetchPrivacy;
    private final boolean shouldReturnUrlsForImageAssets;

    public NativeSomaAdRequest(@NonNull AdRequest adRequest, boolean z, boolean z2) {
        super(adRequest);
        this.shouldFetchPrivacy = z;
        this.shouldReturnUrlsForImageAssets = z2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39171a() {
        lambda$buildFrom$1();
    }

    /* renamed from: b */
    public static /* synthetic */ void m39170b() {
        lambda$buildFrom$0();
    }

    public static NativeSomaAdRequest buildFrom(NativeAdRequest nativeAdRequest) {
        return new NativeSomaAdRequest(AdRequest.builder().setAdSpaceId(nativeAdRequest.adSpaceId()).setAdFormat(AdFormat.NATIVE).setMediationAdapterVersion(nativeAdRequest.mediationAdapterVersion()).setMediationNetworkName(nativeAdRequest.mediationNetworkName()).setMediationNetworkSdkVersion(nativeAdRequest.mediationNetworkSdkVersion()).setUBUniqueId(nativeAdRequest.uniqueUBId()).setOnCsmAdClicked(new Runnable() { // from class: w7.a
            @Override // java.lang.Runnable
            public final void run() {
                NativeSomaAdRequest.m39170b();
            }
        }).setOnCsmAdExpired(new Runnable() { // from class: w7.b
            @Override // java.lang.Runnable
            public final void run() {
                NativeSomaAdRequest.m39171a();
            }
        }).build(), nativeAdRequest.shouldFetchPrivacy(), nativeAdRequest.shouldReturnUrlsForImageAssets());
    }

    public boolean shouldFetchPrivacy() {
        return this.shouldFetchPrivacy;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.shouldReturnUrlsForImageAssets;
    }

    public static /* synthetic */ void lambda$buildFrom$0() {
    }

    public static /* synthetic */ void lambda$buildFrom$1() {
    }
}
