package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hb */
/* loaded from: classes8.dex */
public final class C30453hb {
    @NotNull

    /* renamed from: a */
    private final Context f80014a;
    @NotNull

    /* renamed from: b */
    private final C30303fb f80015b;
    @NotNull

    /* renamed from: c */
    private final C30080cb f80016c;

    public C30453hb(@NotNull C30616jb adtuneOptOutWebView, @NotNull Context context, @NotNull C30303fb adtuneOptOutContainerCreator, @NotNull C30080cb adtuneControlsConfigurator) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebView, "adtuneOptOutWebView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneOptOutContainerCreator, "adtuneOptOutContainerCreator");
        Intrinsics.checkNotNullParameter(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f80014a = context;
        this.f80015b = adtuneOptOutContainerCreator;
        this.f80016c = adtuneControlsConfigurator;
    }

    @NotNull
    /* renamed from: a */
    public final Dialog m33586a() {
        Dialog dialog = new Dialog(this.f80014a, C29880R.C29887style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup m34181a = this.f80015b.m34181a();
        this.f80016c.m35321a(m34181a, dialog);
        dialog.setContentView(m34181a);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return dialog;
    }
}
