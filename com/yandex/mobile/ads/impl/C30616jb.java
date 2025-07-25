package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.jb */
/* loaded from: classes8.dex */
public final class C30616jb extends ac1 {
    @NotNull

    /* renamed from: j */
    private final C30715kb f80859j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30616jb(@NotNull Context context) {
        this(context, new cr0());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.ac1, com.yandex.mobile.ads.impl.je0
    /* renamed from: a */
    public final void mo30793a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f80859j.m32606a(url);
    }

    public final void setAdtuneWebViewListener(@NotNull InterfaceC30779lb adtuneOptOutWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebViewListener, "adtuneOptOutWebViewListener");
        this.f80859j.m32607a(adtuneOptOutWebViewListener);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C30616jb(android.content.Context r3, com.yandex.mobile.ads.impl.cr0 r4) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.jb1 r0 = new com.yandex.mobile.ads.impl.jb1
            r0.<init>(r3)
            com.yandex.mobile.ads.impl.kb r1 = new com.yandex.mobile.ads.impl.kb
            r1.<init>(r0)
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30616jb.<init>(android.content.Context, com.yandex.mobile.ads.impl.cr0):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30616jb(@NotNull Context context, @NotNull cr0 manufacturerChecker, @NotNull jb1 optOutRepository, @NotNull C30715kb adtuneOptOutWebViewController) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manufacturerChecker, "manufacturerChecker");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(adtuneOptOutWebViewController, "adtuneOptOutWebViewController");
        this.f80859j = adtuneOptOutWebViewController;
        if (manufacturerChecker.m35176a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(adtuneOptOutWebViewController);
    }

    @Override // com.yandex.mobile.ads.impl.ac1
    /* renamed from: h */
    protected final void mo28770h() {
    }
}
