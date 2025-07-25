package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pm */
/* loaded from: classes8.dex */
public final class C31141pm<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final d11 f84014a;
    @NotNull

    /* renamed from: b */
    private final C31052om f84015b;

    public C31141pm(@NotNull Context context, @NotNull d11 nativeAdAssetViewProvider, @NotNull C31052om callToActionAnimationController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        Intrinsics.checkNotNullParameter(callToActionAnimationController, "callToActionAnimationController");
        this.f84014a = nativeAdAssetViewProvider;
        this.f84015b = callToActionAnimationController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f84014a.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(C29880R.C29884id.call_to_action);
        if (textView != null) {
            this.f84015b.m30958a(textView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
        this.f84015b.m30959a();
    }
}
