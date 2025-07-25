package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.c2oc2i */
/* loaded from: classes8.dex */
public class C32574c2oc2i {
    private static final String coo2iico = "Intents";

    private C32574c2oc2i() {
    }

    public static boolean coo2iico(@NonNull Context context, @NonNull Intent intent) {
        try {
            return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Exception", e);
            return false;
        }
    }
}
