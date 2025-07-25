package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdTheme;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class gm1 {

    /* renamed from: com.yandex.mobile.ads.impl.gm1$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C30404a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f79704a;

        static {
            int[] iArr = new int[AdTheme.values().length];
            try {
                iArr[AdTheme.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdTheme.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79704a = iArr;
        }
    }

    @NotNull
    /* renamed from: a */
    public static fm1 m33810a(@NotNull AdTheme adTheme) {
        Intrinsics.checkNotNullParameter(adTheme, "adTheme");
        int i = C30404a.f79704a[adTheme.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return fm1.f79175c;
            }
            throw new NoWhenBranchMatchedException();
        }
        return fm1.f79176d;
    }
}
