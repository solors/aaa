package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: com.bytedance.sdk.component.utils.Ta */
/* loaded from: classes3.dex */
public class C7742Ta {
    /* renamed from: bg */
    public static long m87868bg() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
