package com.pgl.ssdk;

import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* renamed from: com.pgl.ssdk.v0 */
/* loaded from: classes7.dex */
public class C26670v0 {
    /* renamed from: a */
    public static String m40733a(String str) {
        try {
            return (String) Class.forName(KiwiConstants.f2713ar).getDeclaredMethod(KiwiConstants.f2714as, String.class).invoke(null, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
