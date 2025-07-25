package com.pubmatic.sdk.openwrap.core.signal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBSignalGeneratorFactory.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBSignalGeneratorFactory {
    @NotNull
    public static final POBSignalGeneratorFactory INSTANCE = new POBSignalGeneratorFactory();

    private POBSignalGeneratorFactory() {
    }

    @NotNull
    public static final POBSignalGeneration getSignalGenerator(@NotNull POBBiddingHost biddingHost) {
        Intrinsics.checkNotNullParameter(biddingHost, "biddingHost");
        return new POBALMAXSignalGenerator();
    }
}
