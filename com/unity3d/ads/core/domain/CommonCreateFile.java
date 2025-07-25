package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonCreateFile.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    @NotNull
    public File invoke(@NotNull File parent, @NotNull String child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    @NotNull
    public File invoke(@NotNull String pathname) {
        Intrinsics.checkNotNullParameter(pathname, "pathname");
        return new File(pathname);
    }
}
