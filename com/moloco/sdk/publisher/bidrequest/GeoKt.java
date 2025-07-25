package com.moloco.sdk.publisher.bidrequest;

import com.moloco.sdk.C23907i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class GeoKt {
    @NotNull
    public static final Geo toGeo(@NotNull C23907i.C23923g c23923g) {
        Intrinsics.checkNotNullParameter(c23923g, "<this>");
        return new Geo(c23923g.m47339b(), c23923g.m47337d(), c23923g.m47338c(), c23923g.m47334g(), Float.valueOf(c23923g.m47336e()), Float.valueOf(c23923g.m47335f()));
    }
}
