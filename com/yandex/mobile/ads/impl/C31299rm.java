package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.rm */
/* loaded from: classes8.dex */
public final class C31299rm<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final f31 f84823a;
    @NotNull

    /* renamed from: b */
    private final d11 f84824b;

    public C31299rm(@NotNull f31 nativeAd, @NotNull d11 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f84823a = nativeAd;
        this.f84824b = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f84824b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(C29880R.C29884id.call_to_action);
        xm1 adType = this.f84823a.getAdType();
        if ((textView instanceof CallToActionView) && adType != xm1.f87745d) {
            ((CallToActionView) textView).m44295a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
