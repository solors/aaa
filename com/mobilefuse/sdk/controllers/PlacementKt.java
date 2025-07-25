package com.mobilefuse.sdk.controllers;

import com.mobilefuse.sdk.MobileFuseDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: Placement.kt */
@Metadata
/* loaded from: classes7.dex */
public final class PlacementKt {
    @NotNull
    public static final Placement parsePlacementId(@NotNull String id2) {
        boolean m16624M;
        Intrinsics.checkNotNullParameter(id2, "id");
        m16624M = StringsJVM.m16624M(id2, MobileFuseDefaults.TEST_MODE_PLACEMENT_PREFIX, false, 2, null);
        if (!m16624M) {
            return new Placement(id2, false);
        }
        String substring = id2.substring(5);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return new Placement(substring, true);
    }
}
