package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadRequest;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.z4 */
/* loaded from: classes3.dex */
public final class C10400z4 {

    /* renamed from: a */
    public final InterfaceC10213t4 f23667a;

    public C10400z4(InterfaceC10213t4 downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        this.f23667a = downloadManager;
    }

    /* renamed from: a */
    public final MediaItem m79810a(C9967ib asset) {
        Download m81752a;
        DownloadRequest downloadRequest;
        Intrinsics.checkNotNullParameter(asset, "asset");
        C9827e4 mo80283b = this.f23667a.mo80283b(asset.m81365d());
        if (mo80283b != null && (m81752a = mo80283b.m81752a()) != null && (downloadRequest = m81752a.request) != null) {
            return downloadRequest.toMediaItem();
        }
        return null;
    }
}
