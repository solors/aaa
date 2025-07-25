package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32462ciiio2o;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.cicc2iiccc */
/* loaded from: classes8.dex */
public class C32594cicc2iiccc {
    private static final String coo2iico = "UtilsDownload";

    private C32594cicc2iiccc() {
    }

    private static String coi222o222(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            lastIndexOf = str.lastIndexOf(47);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getFileType Exception: ", e);
        }
        if (lastIndexOf == -1) {
            return str;
        }
        int length = str.length();
        int i = lastIndexOf + 1;
        if (i < length) {
            return "." + str.substring(i, length);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String coo2iico(String str) {
        return C32462ciiio2o.coo2iico(str);
    }

    public static String coo2iico(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String coi222o222 = coi222o222(str2);
        int lastIndexOf = str.lastIndexOf(46);
        int length = str.length();
        return (lastIndexOf == -1 || length - lastIndexOf >= 8) ? coi222o222 : str.substring(lastIndexOf, length);
    }
}
