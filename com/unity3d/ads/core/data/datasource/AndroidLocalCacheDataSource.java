package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidLocalCacheDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    @NotNull
    private final CreateFile createFile;
    @NotNull
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(@NotNull CreateFile createFile, @NotNull GetFileExtensionFromUrl getFileExtensionFromUrl) {
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        Intrinsics.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    @NotNull
    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    @Nullable
    public Object getFile(@NotNull File file, @NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull Continuation<? super CacheResult> continuation) {
        boolean z;
        String invoke;
        String str3;
        String str4;
        int i;
        File invoke2 = this.createFile.invoke(file, str);
        if (invoke2.exists()) {
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                invoke = null;
            } else {
                invoke = this.getFileExtensionFromUrl.invoke(str2);
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (invoke == null) {
                str4 = "";
            } else {
                str4 = invoke;
            }
            long length = invoke2.length();
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            return new CacheResult.Success(new CachedFile("", str3, str, invoke2, str4, length, null, i, 64, null), CacheSource.LOCAL);
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
    }

    @NotNull
    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
