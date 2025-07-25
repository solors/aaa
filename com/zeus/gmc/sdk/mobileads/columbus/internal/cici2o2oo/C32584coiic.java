package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.IllegalFormatException;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.coiic */
/* loaded from: classes8.dex */
public final class C32584coiic {
    public static final String coi222o222 = "";
    private static final String coo2iico = "Preconditions";

    private C32584coiic() {
    }

    public static void coo2iico(Object obj) {
        coo2iico(obj, true, "Object can not be null.", "");
    }

    public static void coo2iico(Object obj, String str) {
        coo2iico(obj, true, str, "");
    }

    private static boolean coo2iico(Object obj, boolean z, String str, Object... objArr) {
        if (obj != null) {
            return true;
        }
        String coo2iico2 = coo2iico(str, objArr);
        if (!z) {
            MLog.m25889e(coo2iico, coo2iico2);
            return false;
        }
        throw new NullPointerException(coo2iico2);
    }

    private static String coo2iico(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        try {
            return String.format(valueOf, objArr);
        } catch (IllegalFormatException e) {
            MLog.m25889e(coo2iico, "MoPub preconditions had a format exception: " + e.getMessage());
            return valueOf;
        }
    }
}
