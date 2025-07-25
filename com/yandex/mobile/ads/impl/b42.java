package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b42 {
    @NotNull

    /* renamed from: a */
    private final f42 f77112a;
    @NotNull

    /* renamed from: b */
    private final as1 f77113b;
    @NotNull

    /* renamed from: c */
    private final x52 f77114c;
    @NotNull

    /* renamed from: d */
    private final a42 f77115d;
    @NotNull

    /* renamed from: e */
    private final Context f77116e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b42(android.content.Context r7) {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.f42 r2 = new com.yandex.mobile.ads.impl.f42
            r2.<init>(r7)
            int r0 = com.yandex.mobile.ads.impl.as1.f76895l
            com.yandex.mobile.ads.impl.as1 r3 = com.yandex.mobile.ads.impl.as1.C29962a.m35776a()
            com.yandex.mobile.ads.impl.x52 r4 = new com.yandex.mobile.ads.impl.x52
            r4.<init>()
            com.yandex.mobile.ads.impl.a42 r5 = new com.yandex.mobile.ads.impl.a42
            r5.<init>()
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b42.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m35645a() {
        x52 x52Var = this.f77114c;
        Context context = this.f77116e;
        x52Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30155da.m34982a(context) && this.f77113b.m35777k() && this.f77115d.m35967a(this.f77116e)) {
            this.f77112a.m34222a();
        }
    }

    public b42(@NotNull Context context, @NotNull f42 toastPresenter, @NotNull as1 sdkSettings, @NotNull x52 versionValidationNeedChecker, @NotNull a42 validationErrorIndicatorChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(toastPresenter, "toastPresenter");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(versionValidationNeedChecker, "versionValidationNeedChecker");
        Intrinsics.checkNotNullParameter(validationErrorIndicatorChecker, "validationErrorIndicatorChecker");
        this.f77112a = toastPresenter;
        this.f77113b = sdkSettings;
        this.f77114c = versionValidationNeedChecker;
        this.f77115d = validationErrorIndicatorChecker;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f77116e = applicationContext;
    }
}
