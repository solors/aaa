package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class wk0 {
    @NotNull
    /* renamed from: a */
    public static vk0 m27877a(@Nullable yp1 yp1Var) {
        vk0 vk0Var;
        String value;
        vk0 vk0Var2;
        if (yp1Var != null && (value = yp1Var.m26723y()) != null) {
            vk0.f86775c.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            vk0[] values = vk0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    vk0Var2 = values[i];
                    if (Intrinsics.m17075f(vk0Var2.m28293b(), value)) {
                        break;
                    }
                    i++;
                } else {
                    vk0Var2 = null;
                    break;
                }
            }
            if (vk0Var2 != null) {
                return vk0Var2;
            }
        }
        vk0.f86775c.getClass();
        vk0Var = vk0.f86776d;
        return vk0Var;
    }
}
