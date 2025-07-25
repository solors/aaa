package com.p552ot.pubsub.util;

import android.os.Looper;

/* renamed from: com.ot.pubsub.util.r */
/* loaded from: classes7.dex */
public class C26597r {

    /* renamed from: a */
    private static final String f69811a = "ProcessUtil";

    /* renamed from: a */
    public static boolean m41006a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
