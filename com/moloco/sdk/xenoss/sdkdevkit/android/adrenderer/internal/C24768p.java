package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.EnumC24528g;
import com.vungle.ads.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p */
/* loaded from: classes7.dex */
public final class C24768p {
    @NotNull

    /* renamed from: a */
    public static final C24768p f63960a = new C24768p();

    /* renamed from: a */
    public final boolean m45737a(@NotNull String adm) {
        boolean m16596P;
        Intrinsics.checkNotNullParameter(adm, "adm");
        m16596P = C37690r.m16596P(adm, Constants.AD_MRAID_JS_FILE_NAME, true);
        return m16596P;
    }

    /* renamed from: b */
    public final boolean m45736b(@NotNull String adm) {
        boolean m16596P;
        Intrinsics.checkNotNullParameter(adm, "adm");
        m16596P = C37690r.m16596P(adm, "<VAST", true);
        return m16596P;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC24528g m45735c(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        if (m45736b(adm)) {
            return EnumC24528g.VAST;
        }
        if (m45737a(adm)) {
            return EnumC24528g.MRAID;
        }
        return EnumC24528g.STATIC;
    }
}
