package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g9 */
/* loaded from: classes8.dex */
public final class C30370g9 {
    @Nullable

    /* renamed from: a */
    private bf1 f79572a;
    @NotNull

    /* renamed from: b */
    private final LinkedHashMap f79573b = new LinkedHashMap();

    public C30370g9(@Nullable bf1 bf1Var) {
        this.f79572a = bf1Var;
    }

    /* renamed from: a */
    public final void m33909a() {
        this.f79573b.clear();
    }

    /* renamed from: b */
    public final boolean m33905b() {
        Collection values = this.f79573b.values();
        if (!values.contains(ck0.f77651d) && !values.contains(ck0.f77652e)) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: c */
    public final bf1 m33904c() {
        return this.f79572a;
    }

    @NotNull
    /* renamed from: a */
    public final ck0 m33907a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        ck0 ck0Var = (ck0) this.f79573b.get(videoAd);
        return ck0Var == null ? ck0.f77649b : ck0Var;
    }

    /* renamed from: a */
    public final void m33906a(@NotNull kl0 videoAd, @NotNull ck0 instreamAdStatus) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(instreamAdStatus, "instreamAdStatus");
        this.f79573b.put(videoAd, instreamAdStatus);
    }

    /* renamed from: a */
    public final void m33908a(@Nullable bf1 bf1Var) {
        this.f79572a = bf1Var;
    }
}
