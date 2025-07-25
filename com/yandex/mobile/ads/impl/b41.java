package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.g42;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b41 implements InterfaceC30372ga {
    @NotNull

    /* renamed from: a */
    private final Context f77108a;
    @NotNull

    /* renamed from: b */
    private final p41 f77109b;
    @NotNull

    /* renamed from: c */
    private final l41 f77110c;
    @NotNull

    /* renamed from: d */
    private final as1 f77111d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b41(Context context, h11 h11Var, l41 l41Var) {
        this(context, h11Var, l41Var, as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30372ga
    /* renamed from: a */
    public final boolean mo26257a() {
        boolean z;
        this.f77110c.getClass();
        yp1 m35796a = this.f77111d.m35796a(this.f77108a);
        if (m35796a != null && m35796a.m26739p0()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f77109b.mo30835a(false).m31179b() == g42.EnumC30362a.f79483c) {
            return true;
        }
        return false;
    }

    public b41(@NotNull Context context, @NotNull h11 nativeAssetsValidator, @NotNull l41 nativeAdsConfiguration, @NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAssetsValidator, "nativeAssetsValidator");
        Intrinsics.checkNotNullParameter(nativeAdsConfiguration, "nativeAdsConfiguration");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f77108a = context;
        this.f77109b = nativeAssetsValidator;
        this.f77110c = nativeAdsConfiguration;
        this.f77111d = sdkSettings;
    }
}
