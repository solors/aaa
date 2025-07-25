package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class bg0 {
    @NotNull

    /* renamed from: a */
    private final C30723ke f77284a;
    @NotNull

    /* renamed from: b */
    private final String f77285b;
    @NotNull

    /* renamed from: c */
    private final gg0 f77286c;

    public bg0(@NotNull C30723ke appMetricaIdentifiers, @NotNull String mauid, @NotNull gg0 identifiersType) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        Intrinsics.checkNotNullParameter(mauid, "mauid");
        Intrinsics.checkNotNullParameter(identifiersType, "identifiersType");
        this.f77284a = appMetricaIdentifiers;
        this.f77285b = mauid;
        this.f77286c = identifiersType;
    }

    @NotNull
    /* renamed from: a */
    public final C30723ke m35480a() {
        return this.f77284a;
    }

    @NotNull
    /* renamed from: b */
    public final gg0 m35479b() {
        return this.f77286c;
    }

    @NotNull
    /* renamed from: c */
    public final String m35478c() {
        return this.f77285b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj;
        if (Intrinsics.m17075f(this.f77284a, bg0Var.f77284a) && Intrinsics.m17075f(this.f77285b, bg0Var.f77285b) && this.f77286c == bg0Var.f77286c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f77286c.hashCode() + C31014o3.m31189a(this.f77285b, this.f77284a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        C30723ke c30723ke = this.f77284a;
        String str = this.f77285b;
        gg0 gg0Var = this.f77286c;
        return "Identifiers(appMetricaIdentifiers=" + c30723ke + ", mauid=" + str + ", identifiersType=" + gg0Var + ")";
    }
}
