package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37734i;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import sd.C42688d;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    @NotNull
    private final CreateFile createFile;
    @NotNull
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    @NotNull
    private final HttpClient httpClient;
    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    public AndroidRemoteCacheDataSource(@NotNull CoroutineDispatcher ioDispatcher, @NotNull CreateFile createFile, @NotNull GetFileExtensionFromUrl getFileExtensionFromUrl, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        Intrinsics.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClient = httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadFile(String str, Integer num, Continuation<? super HttpResponse> continuation) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        return this.httpClient.execute(new HttpRequest(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, i, 65534, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveToCache(File file, Object obj, Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m16317g = C37734i.m16317g(this.ioDispatcher, new AndroidRemoteCacheDataSource$saveToCache$2(obj, file, null), continuation);
        m6959e = C42688d.m6959e();
        if (m16317g == m6959e) {
            return m16317g;
        }
        return Unit.f99208a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFile(@org.jetbrains.annotations.NotNull java.io.File r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.Nullable java.lang.Integer r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> r20) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.d):java.lang.Object");
    }
}
