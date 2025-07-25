package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.C30705k7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class of2 {
    @NotNull

    /* renamed from: a */
    private final gm1 f83479a;

    public /* synthetic */ of2() {
        this(new gm1());
    }

    @NotNull
    /* renamed from: a */
    public final C30705k7 m31036a(@NotNull String adUnitId, @NotNull AdRequest adRequest) {
        fm1 fm1Var;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            this.f83479a.getClass();
            fm1Var = gm1.m33810a(preferredTheme);
        } else {
            fm1Var = null;
        }
        return new C30705k7.C30706a(adUnitId).m32647a(adRequest.getAge()).m32640d(adRequest.getBiddingData()).m32641c(adRequest.getGender()).m32642b(adRequest.getContextQuery()).m32646a(adRequest.getContextTags()).m32649a(adRequest.getLocation()).m32645a(adRequest.getParameters()).m32648a(fm1Var).m32650a();
    }

    public of2(@NotNull gm1 requestedAdThemeFactory) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        this.f83479a = requestedAdThemeFactory;
    }
}
