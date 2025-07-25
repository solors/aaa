package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.core.model.C8963iR;
import com.ironsource.C21114v8;

/* renamed from: com.bytedance.sdk.openadsdk.utils.eqN */
/* loaded from: classes3.dex */
public class C9555eqN {
    /* renamed from: bg */
    public static String m82413bg(String str) {
        if (!C7741PX.eqN()) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C8963iR c8963iR = new C8963iR(C8840WR.m84734IL().m84723Ta());
        StringBuilder sb2 = new StringBuilder(str);
        for (String str2 : c8963iR.m84188IL()) {
            if (sb2.toString().contains(str2)) {
                if (sb2.toString().contains("?")) {
                    sb2.append(C21114v8.C21123i.f54135c);
                    sb2.append(c8963iR.m84187bg());
                } else {
                    sb2.append("?");
                    sb2.append(c8963iR.m84187bg());
                }
            }
        }
        return sb2.toString();
    }
}
