package com.pubmatic.sdk.openwrap.core.signal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBSignalGeneration.kt */
@Metadata
/* loaded from: classes7.dex */
public interface POBSignalGeneration {
    @NotNull
    String generateSignal(@NotNull Context context, @NotNull POBSignalConfig pOBSignalConfig);
}
