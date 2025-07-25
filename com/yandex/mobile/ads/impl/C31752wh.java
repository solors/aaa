package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wh */
/* loaded from: classes8.dex */
public final class C31752wh {
    @Nullable
    /* renamed from: a */
    public static String m27901a(@NotNull RectF viewRect, @NotNull bh0 imageValue) {
        C31896yh m35753a;
        sv1 m35752b;
        float width;
        int m29526c;
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        aw1 m35471e = imageValue.m35471e();
        if (m35471e == null || (m35753a = m35471e.m35753a()) == null || (m35752b = imageValue.m35471e().m35752b()) == null) {
            return null;
        }
        float width2 = viewRect.width();
        float height = viewRect.height();
        float m35469g = imageValue.m35469g();
        float m35475a = imageValue.m35475a();
        float m29526c2 = m35752b.m29526c();
        float m29527b = m35752b.m29527b();
        if (width2 == 0.0f || height == 0.0f || m35469g == 0.0f || m35475a == 0.0f || m29526c2 == 0.0f || m29527b == 0.0f) {
            return null;
        }
        if (viewRect.width() / viewRect.height() > m35752b.m29526c() / m35752b.m29527b()) {
            width = viewRect.height();
            m29526c = m35752b.m29527b();
        } else {
            width = viewRect.width();
            m29526c = m35752b.m29526c();
        }
        if (width / m29526c <= 1.0f) {
            if (width2 / height > m29526c2 / m29527b) {
                if (!Intrinsics.m17075f(m35753a.m26910c(), m35753a.m26911b())) {
                    return null;
                }
                return m35753a.m26910c();
            } else if (!Intrinsics.m17075f(m35753a.m26909d(), m35753a.m26912a())) {
                return null;
            } else {
                return m35753a.m26909d();
            }
        } else if (width2 / height > m35469g / m35475a) {
            if (!Intrinsics.m17075f(m35753a.m26910c(), m35753a.m26911b())) {
                return null;
            }
            return m35753a.m26910c();
        } else if (!Intrinsics.m17075f(m35753a.m26909d(), m35753a.m26912a())) {
            return null;
        } else {
            return m35753a.m26909d();
        }
    }
}
