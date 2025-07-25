package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheResult;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CacheDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public interface CacheDataSource {

    /* compiled from: CacheDataSource.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                String str3 = str2;
                if ((i & 8) != 0) {
                    num = Integer.MAX_VALUE;
                }
                return cacheDataSource.getFile(file, str, str3, num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    @Nullable
    Object getFile(@NotNull File file, @NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull Continuation<? super CacheResult> continuation);
}
