package com.bytedance.sdk.component.p257iR.eqN;

import android.content.Context;
import com.bytedance.sdk.component.p257iR.p259bX.C7617Kg;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.sdk.component.iR.eqN.eqN */
/* loaded from: classes3.dex */
public class C7640eqN {
    /* renamed from: bg */
    public static void m88297bg(Context context, int i, String str, int i2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(m88299bg(i2), str);
            }
            if (C7617Kg.m88372bg().m88371bg(i2).eqN() != null) {
                C7617Kg.m88372bg().m88371bg(i2).eqN().mo82326bg(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m88298bg(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L6
            goto L29
        L6:
            com.bytedance.sdk.component.iR.bX.Kg r3 = com.bytedance.sdk.component.p257iR.p259bX.C7617Kg.m88372bg()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.iR.bX.ldr r3 = r3.m88371bg(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.iR.bX.IL r3 = r3.eqN()     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L29
            com.bytedance.sdk.component.iR.bX.Kg r3 = com.bytedance.sdk.component.p257iR.p259bX.C7617Kg.m88372bg()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.iR.bX.ldr r3 = r3.m88371bg(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.iR.bX.IL r3 = r3.eqN()     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = m88299bg(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r3.mo82327bg(r2, r4, r0)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r2 = r0
        L2a:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L32
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p257iR.eqN.C7640eqN.m88298bg(android.content.Context, int, int):java.lang.String");
    }

    /* renamed from: bg */
    private static String m88299bg(int i) {
        return "tnc_config".concat(String.valueOf(i));
    }
}
