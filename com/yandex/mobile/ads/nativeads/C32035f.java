package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.C30705k7;
import com.yandex.mobile.ads.impl.fm1;
import com.yandex.mobile.ads.impl.gm1;
import com.yandex.mobile.ads.impl.l31;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.nativeads.f */
/* loaded from: classes8.dex */
public final class C32035f {
    @NotNull

    /* renamed from: a */
    private final gm1 f89240a;
    @NotNull

    /* renamed from: b */
    private final l31 f89241b;

    public C32035f(@NotNull gm1 requestedAdThemeFactory, @NotNull l31 adRequestReadyResponseProvider) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        Intrinsics.checkNotNullParameter(adRequestReadyResponseProvider, "adRequestReadyResponseProvider");
        this.f89240a = requestedAdThemeFactory;
        this.f89241b = adRequestReadyResponseProvider;
    }

    @NotNull
    /* renamed from: a */
    public final C30705k7 m25938a(@NotNull NativeAdRequestConfiguration adRequestConfiguration) {
        fm1 fm1Var;
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "nativeAdConfiguration");
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.f89240a.getClass();
            fm1Var = gm1.m33810a(preferredTheme);
        } else {
            fm1Var = null;
        }
        this.f89241b.getClass();
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        return new C30705k7.C30706a(adRequestConfiguration.getAdUnitId()).m32647a(adRequestConfiguration.getAge()).m32640d(adRequestConfiguration.getBiddingData()).m32641c(adRequestConfiguration.getGender()).m32642b(adRequestConfiguration.getContextQuery()).m32646a(adRequestConfiguration.getContextTags()).m32649a(adRequestConfiguration.getLocation()).m32645a(adRequestConfiguration.getParameters()).m32648a(fm1Var).m32644a(adRequestConfiguration.getShouldLoadImagesAutomatically()).m32643b().m32650a();
    }

    public /* synthetic */ C32035f() {
        this(new gm1(), new l31());
    }
}
