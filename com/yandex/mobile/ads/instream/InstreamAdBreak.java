package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public interface InstreamAdBreak {
    @NotNull
    InstreamAdBreakPosition getAdBreakPosition();

    @NotNull
    String getType();
}
