package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.bytedance.sdk.component.utils.C7759rri;
import com.ironsource.C20747r8;

/* renamed from: com.bytedance.sdk.openadsdk.utils.tC */
/* loaded from: classes3.dex */
public class C9562tC {
    /* renamed from: bg */
    public static String m82392bg(Context context) {
        int m87808bg = C7759rri.m87808bg(context, 0L);
        if (m87808bg != 2) {
            if (m87808bg != 3) {
                if (m87808bg != 4) {
                    if (m87808bg != 5) {
                        if (m87808bg != 6) {
                            return DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY;
                        }
                        return "5g";
                    }
                    return "4g";
                }
                return C20747r8.f52730b;
            }
            return C20747r8.f52729a;
        }
        return "2g";
    }
}
