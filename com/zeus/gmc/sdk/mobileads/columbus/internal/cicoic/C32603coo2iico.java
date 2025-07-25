package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

import android.content.Context;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.coo2iico */
/* loaded from: classes8.dex */
public class C32603coo2iico {
    private static final String coi222o222 = "xml_video_cache";
    private static final String coo2iico = "DiskCacheUtils";

    private C32603coo2iico() {
    }

    public static String coo2iico(Context context) {
        if (context == null) {
            return "";
        }
        try {
            File file = new File(context.getCacheDir().getAbsolutePath(), coi222o222);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath();
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "get root dir exception: ", e);
            return "";
        }
    }
}
