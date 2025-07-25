package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.f4 */
/* loaded from: classes3.dex */
public abstract class AbstractC9845f4 {
    /* renamed from: a */
    public static final File m81714a(C9827e4 c9827e4, File file) {
        Intrinsics.checkNotNullParameter(c9827e4, "<this>");
        return new File(file, c9827e4.m81751b());
    }

    /* renamed from: a */
    public static final C9827e4 m81713a(Download download) {
        Intrinsics.checkNotNullParameter(download, "<this>");
        return new C9827e4(download);
    }

    /* renamed from: a */
    public static final String m81715a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    return "UNKNOWN STATE " + i;
                                }
                                return "STATE_RESTARTING";
                            }
                            return "STATE_REMOVING";
                        }
                        return "STATE_FAILED";
                    }
                    return "STATE_COMPLETED";
                }
                return "STATE_DOWNLOADING";
            }
            return "STATE_STOPPED";
        }
        return "STATE_QUEUED";
    }
}
