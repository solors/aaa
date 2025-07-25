package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonCacheFile.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonCacheFile implements CacheFile {
    @NotNull
    private final CacheRepository cacheRepository;
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCacheFile(@NotNull CacheRepository cacheRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.AdObject r20, @org.jetbrains.annotations.Nullable org.json.JSONArray r21, int r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> r23) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonCacheFile.invoke(java.lang.String, com.unity3d.ads.core.data.model.AdObject, org.json.JSONArray, int, kotlin.coroutines.d):java.lang.Object");
    }
}
