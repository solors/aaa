package com.vungle.ads.internal.downloader;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.downloader.e */
/* loaded from: classes7.dex */
public interface Downloader {

    /* compiled from: Downloader.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.downloader.e$a */
    /* loaded from: classes7.dex */
    public static final class C29191a extends Exception {
        public C29191a(@Nullable String str) {
            super(str);
        }
    }

    void cancel(@Nullable DownloadRequest downloadRequest);

    void cancelAll();

    void download(@Nullable DownloadRequest downloadRequest, @Nullable AssetDownloadListener assetDownloadListener);
}
