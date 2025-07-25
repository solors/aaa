package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cq0 {
    @NotNull

    /* renamed from: a */
    private final yp0 f77725a = new yp0();

    @Nullable
    /* renamed from: a */
    public final Location m35180a(@NotNull List<? extends Location> locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Location location = null;
        for (Location location2 : locations) {
            this.f77725a.getClass();
            if (yp0.m26797a(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
