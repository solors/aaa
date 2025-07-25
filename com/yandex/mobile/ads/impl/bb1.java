package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.monetization.ads.video.models.p550ad.JavaScriptResource;
import com.yandex.mobile.ads.impl.k52;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bb1 {
    @NotNull
    /* renamed from: a */
    public static r52 m35514a(@NotNull j52 verification) throws k52, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(verification, "verification");
        JavaScriptResource m33042b = verification.m33042b();
        if (m33042b != null && Intrinsics.m17075f(m33042b.m44265c(), CampaignEx.KEY_OMID)) {
            try {
                URL url = new URL(m33042b.m44264d());
                String m33040d = verification.m33040d();
                String m33041c = verification.m33041c();
                if (m33041c != null && m33041c.length() != 0) {
                    r52 m30144a = r52.m30144a(m33040d, url, m33041c);
                    Intrinsics.m17074g(m30144a);
                    return m30144a;
                }
                r52 m30143a = r52.m30143a(url);
                Intrinsics.m17074g(m30143a);
                return m30143a;
            } catch (MalformedURLException unused) {
                throw new k52(verification, k52.EnumC30701a.f81280d);
            }
        }
        throw new k52(verification, k52.EnumC30701a.f81279c);
    }
}
