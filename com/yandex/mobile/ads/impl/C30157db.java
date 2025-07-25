package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.db */
/* loaded from: classes8.dex */
public final class C30157db {
    @NotNull

    /* renamed from: a */
    private final Context f78022a;
    @NotNull

    /* renamed from: b */
    private final C29927ab f78023b;
    @NotNull

    /* renamed from: c */
    private final C30080cb f78024c;

    public C30157db(@NotNull Context context, @NotNull C31101pb adtuneWebView, @NotNull C29927ab adtuneContainerCreator, @NotNull C30080cb adtuneControlsConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneWebView, "adtuneWebView");
        Intrinsics.checkNotNullParameter(adtuneContainerCreator, "adtuneContainerCreator");
        Intrinsics.checkNotNullParameter(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f78022a = context;
        this.f78023b = adtuneContainerCreator;
        this.f78024c = adtuneControlsConfigurator;
    }

    @NotNull
    /* renamed from: a */
    public final Dialog m34978a() {
        Dialog dialog = new Dialog(this.f78022a, C29880R.C29887style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup m35931a = this.f78023b.m35931a();
        this.f78024c.m35321a(m35931a, dialog);
        dialog.setContentView(m35931a);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return dialog;
    }
}
