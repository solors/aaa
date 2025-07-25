package com.unity3d.ads.core.data.datasource;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: StoreDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public interface StoreDataSource {
    @NotNull
    List<String> fetchStores(@NotNull List<String> list);
}
