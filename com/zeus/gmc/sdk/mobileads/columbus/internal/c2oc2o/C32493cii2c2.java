package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.cii2c2 */
/* loaded from: classes8.dex */
public class C32493cii2c2 {
    @SuppressLint({"StaticFieldLeak"})
    private static C32493cii2c2 coi222o222 = new C32493cii2c2();
    private Context coo2iico;

    private C32493cii2c2() {
    }

    public static C32493cii2c2 coi222o222() {
        return coi222o222;
    }

    public Context coo2iico() {
        return this.coo2iico;
    }

    public void coo2iico(Context context) {
        this.coo2iico = context != null ? context.getApplicationContext() : null;
    }
}
