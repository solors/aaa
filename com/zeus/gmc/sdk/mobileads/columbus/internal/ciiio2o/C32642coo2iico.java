package com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o;

import android.content.Context;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.coo2iico */
/* loaded from: classes8.dex */
public class C32642coo2iico {
    private static final String coo2iico = "AppEnv";

    private C32642coo2iico() {
    }

    public static String coi222o222(Context context) {
        String str = "";
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                externalFilesDir = context.getFilesDir();
            }
            str = externalFilesDir.getPath();
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "GetSdRootDir exception", e);
        }
        return str + File.separator;
    }

    public static String coo2iico(Context context) {
        String str = coi222o222(context) + Reporting.EventType.CACHE + File.separator;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    public static String coo2iico(Context context, String str) {
        String str2 = coi222o222(context) + str + File.separator;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        return str2;
    }
}
