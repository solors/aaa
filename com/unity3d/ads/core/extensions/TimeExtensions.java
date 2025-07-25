package com.unity3d.ads.core.extensions;

import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.TimeExtensionsKt */
/* loaded from: classes7.dex */
public final class TimeExtensions {
    public static final double elapsedMillis(@NotNull TimeSource timeSource) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        return Duration.m16506G(timeSource.mo16435b(), DurationUnitJvm.f90129f);
    }
}
