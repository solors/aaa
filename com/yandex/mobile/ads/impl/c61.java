package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c61 {
    @NotNull

    /* renamed from: a */
    private final C29932ag f77533a;

    public c61(@NotNull C29932ag assetValueProvider) {
        Intrinsics.checkNotNullParameter(assetValueProvider, "assetValueProvider");
        this.f77533a = assetValueProvider;
    }

    @NotNull
    /* renamed from: a */
    public final b61 m35348a() {
        s81 s81Var;
        o71 o71Var;
        eu0 m35903a = this.f77533a.m35903a();
        o71 o71Var2 = null;
        s81 s81Var2 = null;
        if (m35903a != null) {
            if (m35903a.m34429c() != null) {
                o71Var = new o71();
            } else {
                o71Var = null;
            }
            if (m35903a.m34430b() != null) {
                s81Var2 = new s81();
            }
            s81Var = s81Var2;
            o71Var2 = o71Var;
        } else {
            s81Var = null;
        }
        return new b61(o71Var2, s81Var);
    }
}
