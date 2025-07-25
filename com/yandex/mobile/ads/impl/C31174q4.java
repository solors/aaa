package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.q4 */
/* loaded from: classes8.dex */
public final class C31174q4 {
    @NotNull

    /* renamed from: a */
    private static final String f84223a = "yandex_ad_info";

    @Nullable
    /* renamed from: a */
    public static String m30477a(@NotNull h62 videoAdExtensions) {
        Object obj;
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Iterator<T> it = videoAdExtensions.m33606a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.m17075f(((i50) obj).m33365a(), f84223a)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        i50 i50Var = (i50) obj;
        if (i50Var == null) {
            return null;
        }
        return i50Var.m33364b();
    }
}
