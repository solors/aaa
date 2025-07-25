package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class o40 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashSet f83295a = new LinkedHashSet();
    @Nullable

    /* renamed from: b */
    private Player f83296b;

    /* renamed from: a */
    public final void m31182a(@NotNull nh1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83295a.add(listener);
    }

    /* renamed from: b */
    public final boolean m31181b() {
        if (this.f83296b != null) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    public final Player m31184a() {
        return this.f83296b;
    }

    /* renamed from: a */
    public final void m31183a(@Nullable Player player) {
        this.f83296b = player;
        for (ve1 ve1Var : this.f83295a) {
            ve1Var.mo28325a(player);
        }
    }
}
