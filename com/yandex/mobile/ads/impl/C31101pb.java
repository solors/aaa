package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.pb */
/* loaded from: classes8.dex */
public final class C31101pb extends ac1 {
    @NotNull

    /* renamed from: j */
    private final C31187qb f83790j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31101pb(@NotNull Context context) {
        this(context, new cr0());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.ac1, com.yandex.mobile.ads.impl.je0
    /* renamed from: a */
    public final void mo30793a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f83790j.m30423a(url);
    }

    public final void setAdtuneWebViewListener(@NotNull InterfaceC31345sb adtuneWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneWebViewListener, "adtuneWebViewListener");
        this.f83790j.m30424a(adtuneWebViewListener);
    }

    public final void setOptOutUrl(@Nullable String str) {
        this.f83790j.m30421b(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C31101pb(android.content.Context r3, com.yandex.mobile.ads.impl.cr0 r4) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.ib r0 = new com.yandex.mobile.ads.impl.ib
            r0.<init>(r3)
            com.yandex.mobile.ads.impl.qb r1 = new com.yandex.mobile.ads.impl.qb
            r1.<init>(r0)
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31101pb.<init>(android.content.Context, com.yandex.mobile.ads.impl.cr0):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31101pb(@NotNull Context context, @NotNull cr0 manufacturerChecker, @NotNull C30541ib optOutRenderer, @NotNull C31187qb adtuneWebViewController) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manufacturerChecker, "manufacturerChecker");
        Intrinsics.checkNotNullParameter(optOutRenderer, "optOutRenderer");
        Intrinsics.checkNotNullParameter(adtuneWebViewController, "adtuneWebViewController");
        this.f83790j = adtuneWebViewController;
        if (manufacturerChecker.m35176a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(adtuneWebViewController);
    }

    @Override // com.yandex.mobile.ads.impl.ac1
    /* renamed from: h */
    protected final void mo28770h() {
    }
}
