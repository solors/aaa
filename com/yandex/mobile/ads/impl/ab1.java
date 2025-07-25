package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ab1 {
    @NotNull
    /* renamed from: a */
    public static x42 m35930a(@Nullable x72 x72Var, @NotNull j72 videoAdPosition) {
        nf1 nf1Var;
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        int ordinal = videoAdPosition.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        nf1Var = nf1.f82752f;
                    } else {
                        nf1Var = nf1.f82752f;
                    }
                } else {
                    nf1Var = nf1.f82751e;
                }
            } else {
                nf1Var = nf1.f82750d;
            }
        } else {
            nf1Var = nf1.f82749c;
        }
        if (x72Var != null) {
            x42 m27662a = x42.m27662a(((float) x72Var.m27626a()) / ((float) 1000), nf1Var);
            Intrinsics.m17074g(m27662a);
            return m27662a;
        }
        x42 m27661a = x42.m27661a(nf1Var);
        Intrinsics.m17074g(m27661a);
        return m27661a;
    }
}
