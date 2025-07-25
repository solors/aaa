package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadCursor;
import com.google.android.exoplayer2.offline.DownloadManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.db */
/* loaded from: classes3.dex */
public abstract class AbstractC9817db {
    /* renamed from: a */
    public static final List m81777a(DownloadCursor downloadCursor) {
        Intrinsics.checkNotNullParameter(downloadCursor, "<this>");
        ArrayList arrayList = new ArrayList();
        while (downloadCursor.moveToNext()) {
            Download download = downloadCursor.getDownload();
            Intrinsics.checkNotNullExpressionValue(download, "getDownload(...)");
            arrayList.add(AbstractC9845f4.m81713a(download));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final C9827e4 m81775a(DownloadManager downloadManager, String id2) {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        Download download = downloadManager.getDownloadIndex().getDownload(id2);
        if (download != null) {
            return AbstractC9845f4.m81713a(download);
        }
        return null;
    }

    /* renamed from: a */
    public static final List m81776a(DownloadManager downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        DownloadCursor downloads = downloadManager.getDownloadIndex().getDownloads(new int[0]);
        Intrinsics.checkNotNullExpressionValue(downloads, "getDownloads(...)");
        return m81777a(downloads);
    }
}
