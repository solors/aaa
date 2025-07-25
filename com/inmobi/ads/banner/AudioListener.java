package com.inmobi.ads.banner;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiBanner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes6.dex */
public interface AudioListener {
    void onAudioStatusChanged(@NotNull InMobiBanner inMobiBanner, @NotNull AudioStatus audioStatus);
}
