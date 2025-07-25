package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CreateFile.kt */
@Metadata
/* loaded from: classes7.dex */
public interface CreateFile {
    @NotNull
    File invoke(@NotNull File file, @NotNull String str);

    @NotNull
    File invoke(@NotNull String str);
}
