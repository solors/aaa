package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gb */
/* loaded from: classes8.dex */
public final class C30373gb {
    @NotNull

    /* renamed from: a */
    private final Dialog f79590a;
    @NotNull

    /* renamed from: b */
    private final C30616jb f79591b;

    /* renamed from: com.yandex.mobile.ads.impl.gb$a */
    /* loaded from: classes8.dex */
    private final class C30374a implements InterfaceC30779lb {
        public C30374a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30779lb
        /* renamed from: a */
        public final void mo32298a() {
            C31940yz.m26513a(C30373gb.this.f79590a);
        }
    }

    public C30373gb(@NotNull Dialog dialog, @NotNull C30616jb adtuneOptOutWebView) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(adtuneOptOutWebView, "adtuneOptOutWebView");
        this.f79590a = dialog;
        this.f79591b = adtuneOptOutWebView;
    }

    /* renamed from: a */
    public final void m33893a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f79591b.setAdtuneWebViewListener(new C30374a());
        this.f79591b.loadUrl(url);
        this.f79590a.show();
    }
}
