package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTcfRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidTcfRepository implements TcfRepository {
    @NotNull
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(@NotNull TcfDataSource tcfDataSource) {
        Intrinsics.checkNotNullParameter(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    @NotNull
    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    @Nullable
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}
