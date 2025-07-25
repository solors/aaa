package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class p40 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashSet f83715a = new LinkedHashSet();
    @Nullable

    /* renamed from: b */
    private Player f83716b;

    /* renamed from: a */
    public final void m30839a(@NotNull oh1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83715a.add(listener);
    }

    /* renamed from: b */
    public final boolean m30838b() {
        if (this.f83716b != null) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    public final Player m30841a() {
        return this.f83716b;
    }

    /* renamed from: a */
    public final void m30840a(@Nullable Player player) {
        this.f83716b = player;
        for (we1 we1Var : this.f83715a) {
            we1Var.mo27925a(player);
        }
    }
}
