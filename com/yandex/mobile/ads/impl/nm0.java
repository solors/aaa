package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nm0 {
    @NotNull
    /* renamed from: a */
    public static mm0 m31466a(@NotNull z61 nativeValidator, @NotNull List showNotices) {
        int i;
        Integer num;
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        if (!showNotices.isEmpty()) {
            Iterator it = showNotices.iterator();
            if (!it.hasNext()) {
                num = null;
            } else {
                Integer valueOf = Integer.valueOf(((ot1) it.next()).m30885d());
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((ot1) it.next()).m30885d());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            }
            if (num != null) {
                i = num.intValue();
                return new mm0(nativeValidator, i);
            }
        }
        i = 50;
        return new mm0(nativeValidator, i);
    }
}
