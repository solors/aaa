package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dp1 {
    @NotNull

    /* renamed from: a */
    private final ArrayList f78212a;

    public dp1(@NotNull uj0 instreamAdPlaylist) {
        Intrinsics.checkNotNullParameter(instreamAdPlaylist, "instreamAdPlaylist");
        this.f78212a = m34874a(instreamAdPlaylist);
    }

    /* renamed from: a */
    private static ArrayList m34874a(uj0 uj0Var) {
        ArrayList arrayList = new ArrayList();
        C31920yr m28753c = uj0Var.m28753c();
        if (m28753c != null) {
            arrayList.add(new df1(m28753c, 0L));
        }
        arrayList.addAll(uj0Var.m28755a());
        return arrayList;
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m34875a() {
        return this.f78212a;
    }
}
