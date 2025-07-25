package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pj1 {
    @NotNull

    /* renamed from: a */
    private final dp1 f84000a;
    @NotNull

    /* renamed from: b */
    private final C31253r2 f84001b;

    public pj1(@NotNull dp1 schedulePlaylistItemsProvider, @NotNull C31253r2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(schedulePlaylistItemsProvider, "schedulePlaylistItemsProvider");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f84000a = schedulePlaylistItemsProvider;
        this.f84001b = adBreakStatusController;
    }

    @Nullable
    /* renamed from: a */
    public final C31920yr m30625a(long j) {
        boolean z;
        boolean z2;
        ArrayList m34875a = this.f84000a.m34875a();
        int size = m34875a.size();
        for (int i = 0; i < size; i++) {
            C31920yr m34949a = ((df1) m34875a.get(i)).m34949a();
            if (i <= 0 ? j >= 0 : j > ((df1) m34875a.get(i - 1)).m34948b()) {
                if (j <= ((df1) m34875a.get(i)).m34948b()) {
                    z = false;
                    z2 = true ^ z;
                    EnumC31169q2 m30167a = this.f84001b.m30167a(m34949a);
                    if (!z2 && EnumC31169q2.f84154b == m30167a) {
                        return m34949a;
                    }
                }
            }
            z = true;
            z2 = true ^ z;
            EnumC31169q2 m30167a2 = this.f84001b.m30167a(m34949a);
            if (!z2) {
            }
        }
        return null;
    }
}
