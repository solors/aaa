package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.text.TextUtils;
import android.util.Log;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coo2iico.C32728c2oc2i;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.cioccoiococ */
/* loaded from: classes8.dex */
public final class C32612cioccoiococ {
    public static void coi222o222(String str) {
        if (C32728c2oc2i.coo2iico.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.w("OMIDLIB", str);
        }
    }

    public static void coo2iico(String str) {
        if (!C32728c2oc2i.coo2iico.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void coo2iico(String str, Exception exc) {
        if ((!C32728c2oc2i.coo2iico.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
