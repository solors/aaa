package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class oj1 {
    @NotNull

    /* renamed from: a */
    private final dp1 f83540a;
    @NotNull

    /* renamed from: b */
    private final C31253r2 f83541b;

    public oj1(@NotNull dp1 schedulePlaylistItemsProvider, @NotNull C31253r2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(schedulePlaylistItemsProvider, "schedulePlaylistItemsProvider");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f83540a = schedulePlaylistItemsProvider;
        this.f83541b = adBreakStatusController;
    }

    @Nullable
    /* renamed from: a */
    public final C31920yr m30974a(long j) {
        boolean z;
        Iterator it = this.f83540a.m34875a().iterator();
        while (it.hasNext()) {
            df1 df1Var = (df1) it.next();
            C31920yr m34949a = df1Var.m34949a();
            if (Math.abs(df1Var.m34948b() - j) < 200) {
                z = true;
            } else {
                z = false;
            }
            EnumC31169q2 m30167a = this.f83541b.m30167a(m34949a);
            if (z && EnumC31169q2.f84156d == m30167a) {
                return m34949a;
            }
        }
        return null;
    }
}
