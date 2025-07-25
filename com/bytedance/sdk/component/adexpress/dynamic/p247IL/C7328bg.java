package com.bytedance.sdk.component.adexpress.dynamic.p247IL;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.IL.bg */
/* loaded from: classes3.dex */
public class C7328bg {
    /* renamed from: bg */
    public static int m89112bg(C7464iR c7464iR) {
        if (c7464iR == null) {
            return 0;
        }
        String LKE = c7464iR.LKE();
        String kMt = c7464iR.kMt();
        if (TextUtils.isEmpty(kMt) || TextUtils.isEmpty(LKE) || !kMt.equals(Reporting.Key.CREATIVE)) {
            return 0;
        }
        if (LKE.equals("shake")) {
            return 2;
        }
        if (LKE.equals("twist")) {
            return 3;
        }
        if (!LKE.equals("slide")) {
            return 0;
        }
        return 1;
    }
}
