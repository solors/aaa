package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonGetCacheDirectory.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    @NotNull
    public File invoke(@NotNull File cacheDirectoryBase, @NotNull String cacheDirectoryPath) {
        Intrinsics.checkNotNullParameter(cacheDirectoryBase, "cacheDirectoryBase");
        Intrinsics.checkNotNullParameter(cacheDirectoryPath, "cacheDirectoryPath");
        return new File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
