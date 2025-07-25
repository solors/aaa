package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface VastBaseResource {
    @Nullable
    String getContent();

    @NotNull
    VastResourceType getResourceType();
}
