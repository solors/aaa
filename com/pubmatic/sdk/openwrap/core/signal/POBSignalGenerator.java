package com.pubmatic.sdk.openwrap.core.signal;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBSignalGenerator.kt */
@Keep
@Metadata
/* loaded from: classes7.dex */
public final class POBSignalGenerator {
    @NotNull
    public static final POBSignalGenerator INSTANCE = new POBSignalGenerator();

    private POBSignalGenerator() {
    }

    @NotNull
    public static final String generateSignal(@NotNull Context context, @NotNull POBBiddingHost biddingHost, @NotNull POBSignalConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biddingHost, "biddingHost");
        Intrinsics.checkNotNullParameter(config, "config");
        return POBSignalGeneratorFactory.getSignalGenerator(biddingHost).generateSignal(context, config);
    }
}
