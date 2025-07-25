package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: CacheRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface CacheRepository {

    /* compiled from: CacheRepository.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, String str2, JSONArray jSONArray, int i, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    jSONArray = null;
                }
                JSONArray jSONArray2 = jSONArray;
                if ((i2 & 8) != 0) {
                    i = 0;
                }
                return cacheRepository.getFile(str, str2, jSONArray2, i, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    @Nullable
    Object clearCache(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object doesFileExist(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object getCacheSize(@NotNull Continuation<? super Long> continuation);

    @Nullable
    Object getFile(@NotNull String str, @NotNull String str2, @Nullable JSONArray jSONArray, int i, @NotNull Continuation<? super CacheResult> continuation);

    boolean removeFile(@NotNull CachedFile cachedFile);

    @NotNull
    CacheResult retrieveFile(@NotNull String str);
}
