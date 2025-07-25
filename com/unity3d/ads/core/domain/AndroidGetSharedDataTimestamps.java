package com.unity3d.ads.core.domain;

import android.os.SystemClock;
import com.unity3d.ads.core.extensions.TimestampExtensions;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.p687v1.TimestampsKt;
import gatewayprotocol.p687v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetSharedDataTimestamps.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetSharedDataTimestamps implements GetSharedDataTimestamps {
    @Override // com.unity3d.ads.core.domain.GetSharedDataTimestamps
    @NotNull
    public TimestampsOuterClass.Timestamps invoke() {
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder newBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        TimestampsKt.Dsl _create = companion._create(newBuilder);
        _create.setTimestamp(TimestampExtensions.fromMillis(System.currentTimeMillis()));
        _create.setSessionTimestamp(SystemClock.elapsedRealtime() - SdkProperties.getInitializationTime());
        return _create._build();
    }
}
