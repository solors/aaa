package com.vungle.ads.internal.presenter;

import com.vungle.ads.AbstractC29537l2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdPlayCallback.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.presenter.c */
/* loaded from: classes7.dex */
public class C29395c implements AdPlayCallback {
    @NotNull
    private final AdPlayCallback adPlayCallback;

    public C29395c(@NotNull AdPlayCallback adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.adPlayCallback = adPlayCallback;
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(@Nullable String str) {
        this.adPlayCallback.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(@Nullable String str) {
        this.adPlayCallback.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(@Nullable String str) {
        this.adPlayCallback.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(@Nullable String str) {
        this.adPlayCallback.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(@Nullable String str) {
        this.adPlayCallback.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(@Nullable String str) {
        this.adPlayCallback.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(@NotNull AbstractC29537l2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.adPlayCallback.onFailure(error);
    }
}
