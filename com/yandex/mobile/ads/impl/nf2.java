package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.C30705k7;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nf2 {
    @NotNull

    /* renamed from: a */
    private final gm1 f82755a;

    public /* synthetic */ nf2() {
        this(new gm1());
    }

    @NotNull
    /* renamed from: a */
    public final C30705k7 m31528a(@NotNull AdRequestConfiguration adRequestConfiguration) {
        boolean m16635B;
        boolean m16635B2;
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        String age = adRequestConfiguration.getAge();
        String gender = adRequestConfiguration.getGender();
        String contextQuery = adRequestConfiguration.getContextQuery();
        List<String> contextTags = adRequestConfiguration.getContextTags();
        Location location = adRequestConfiguration.getLocation();
        Map<String, String> parameters = adRequestConfiguration.getParameters();
        String biddingData = adRequestConfiguration.getBiddingData();
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        C30705k7.C30706a c30706a = new C30705k7.C30706a(adRequestConfiguration.getAdUnitId());
        if (age != null) {
            m16635B2 = StringsJVM.m16635B(age);
            if (!(!m16635B2)) {
                age = null;
            }
            if (age != null) {
                c30706a.m32647a(age);
            }
        }
        if (gender != null) {
            m16635B = StringsJVM.m16635B(gender);
            if (!(!m16635B)) {
                gender = null;
            }
            if (gender != null) {
                c30706a.m32641c(gender);
            }
        }
        if (contextQuery != null) {
            c30706a = c30706a.m32642b(contextQuery);
        }
        if (contextTags != null) {
            c30706a = c30706a.m32646a(contextTags);
        }
        if (location != null) {
            c30706a = c30706a.m32649a(location);
        }
        if (parameters != null) {
            c30706a = c30706a.m32645a(parameters);
        }
        if (biddingData != null) {
            c30706a = c30706a.m32640d(biddingData);
        }
        if (preferredTheme != null) {
            this.f82755a.getClass();
            c30706a = c30706a.m32648a(gm1.m33810a(preferredTheme));
        }
        return c30706a.m32650a();
    }

    public nf2(@NotNull gm1 requestedAdThemeFactory) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        this.f82755a = requestedAdThemeFactory;
    }
}
