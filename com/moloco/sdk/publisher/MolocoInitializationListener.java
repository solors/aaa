package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface MolocoInitializationListener {
    void onMolocoInitializationStatus(@NotNull MolocoInitStatus molocoInitStatus);
}
