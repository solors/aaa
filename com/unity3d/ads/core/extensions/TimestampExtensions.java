package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.TimestampExtensionsKt */
/* loaded from: classes7.dex */
public final class TimestampExtensions {
    public static final long duration(long j) {
        return System.nanoTime() - j;
    }

    @NotNull
    public static final Timestamp fromMillis(long j) {
        long j2 = 1000;
        Timestamp build = Timestamp.newBuilder().setSeconds(j / j2).setNanos((int) ((j % j2) * 1000000)).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder().setSeconds(…000000).toInt())).build()");
        return build;
    }
}
