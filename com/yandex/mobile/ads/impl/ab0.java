package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class ab0 extends ee0 {
    @NotNull

    /* renamed from: n */
    private final zd2 f76751n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(@NotNull Context context, @NotNull C30149d8<?> adResponse, @NotNull C30359g3 adConfiguration) {
        super(context, adResponse, adConfiguration);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f76751n = new zd2(this);
    }

    @Override // com.yandex.mobile.ads.impl.ee0
    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    protected final void mo28772a(@NotNull Context context, @NotNull C30359g3 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        addJavascriptInterface(m34635b(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.ac1
    /* renamed from: h */
    public final void mo28770h() {
        this.f76751n.m26254a(m34632k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.mobile.ads.impl.ac1
    /* renamed from: a */
    public final void mo35923a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.mo35923a(context);
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setDatabasePath(getContext().getDatabasePath("com.monetization.ads.db").getAbsolutePath());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
    }
}
