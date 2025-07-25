package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nd2<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final d11 f82702a;

    public /* synthetic */ nd2() {
        this(new d11());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f82702a.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(C29880R.C29884id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    public nd2(@NotNull d11 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f82702a = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
