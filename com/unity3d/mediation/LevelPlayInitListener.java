package com.unity3d.mediation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface LevelPlayInitListener {
    void onInitFailed(@NotNull LevelPlayInitError levelPlayInitError);

    void onInitSuccess(@NotNull LevelPlayConfiguration levelPlayConfiguration);
}
