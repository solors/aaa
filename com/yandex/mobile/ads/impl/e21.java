package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.uh0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class e21 implements n30, uh0.InterfaceC31586a {
    @NotNull

    /* renamed from: a */
    private final g21 f78421a;
    @NotNull

    /* renamed from: b */
    private final C30818m0 f78422b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ e21(android.content.Context r7, com.yandex.mobile.ads.impl.C30359g3 r8, com.yandex.mobile.ads.impl.C30149d8 r9) {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.g21 r4 = new com.yandex.mobile.ads.impl.g21
            r4.<init>()
            com.yandex.mobile.ads.impl.m0 r5 = new com.yandex.mobile.ads.impl.m0
            r5.<init>(r7, r8, r9, r4)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e21.<init>(android.content.Context, com.yandex.mobile.ads.impl.g3, com.yandex.mobile.ads.impl.d8):void");
    }

    @Override // com.yandex.mobile.ads.impl.n30
    /* renamed from: a */
    public final void mo31677a() {
        this.f78421a.m33995a();
    }

    /* renamed from: b */
    public final void m34698b() {
        um0.m28728a(new Object[0]);
        this.f78422b.m32171a();
    }

    /* renamed from: c */
    public final void m34697c() {
        this.f78422b.m32165e();
    }

    /* renamed from: d */
    public final void m34696d() {
        this.f78421a.onLeftApplication();
        this.f78422b.m32166d();
    }

    /* renamed from: e */
    public final void m34695e() {
        this.f78421a.onLeftApplication();
        this.f78422b.m32164f();
    }

    /* renamed from: f */
    public final void m34694f() {
        this.f78422b.m32168b();
    }

    /* renamed from: g */
    public final void m34693g() {
        this.f78421a.onLeftApplication();
        this.f78422b.m32167c();
    }

    @Override // com.yandex.mobile.ads.impl.uh0.InterfaceC31586a
    /* renamed from: a */
    public final void mo28775a(@Nullable AdImpressionData adImpressionData) {
        this.f78421a.m33994a(adImpressionData);
    }

    /* renamed from: a */
    public final void m34701a(@Nullable InterfaceC30655js interfaceC30655js) {
        this.f78421a.m33991a(interfaceC30655js);
    }

    public e21(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull C30149d8<?> adResponse, @NotNull g21 nativeAdEventListenerController, @NotNull C30818m0 activityInteractionControllerWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdEventListenerController, "nativeAdEventListenerController");
        Intrinsics.checkNotNullParameter(activityInteractionControllerWrapper, "activityInteractionControllerWrapper");
        this.f78421a = nativeAdEventListenerController;
        this.f78422b = activityInteractionControllerWrapper;
    }

    /* renamed from: a */
    public final void m34700a(@NotNull m41 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f78422b.m32169a(reportParameterManager);
    }

    /* renamed from: a */
    public final void m34699a(@NotNull xo0 link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f78422b.m32170a(link.m27441c());
    }
}
