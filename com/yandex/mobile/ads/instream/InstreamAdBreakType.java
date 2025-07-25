package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public final class InstreamAdBreakType {
    @NotNull
    public static final String INROLL = "inroll";
    @NotNull
    public static final InstreamAdBreakType INSTANCE = new InstreamAdBreakType();
    @NotNull
    public static final String MIDROLL = "midroll";
    @NotNull
    public static final String PAUSEROLL = "pauseroll";
    @NotNull
    public static final String POSTROLL = "postroll";
    @NotNull
    public static final String PREROLL = "preroll";

    private InstreamAdBreakType() {
    }
}
