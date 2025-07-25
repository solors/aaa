package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.lt */
/* loaded from: classes8.dex */
public final class C30808lt {
    @NotNull
    /* renamed from: a */
    public static List m32197a(@NotNull C30746kt creative) {
        List<C31034of<?>> list;
        List m17166m;
        so0 m31316b;
        Intrinsics.checkNotNullParameter(creative, "creative");
        C30972nt m32444c = creative.m32444c();
        if (m32444c != null && (m31316b = m32444c.m31316b()) != null) {
            list = m31316b.m29576a();
        } else {
            list = null;
        }
        if (list == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        return list;
    }
}
