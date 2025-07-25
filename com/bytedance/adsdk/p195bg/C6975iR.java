package com.bytedance.adsdk.p195bg;

import android.text.TextUtils;
import com.bytedance.adsdk.p195bg.p196IL.p201bg.C6951bg;

/* renamed from: com.bytedance.adsdk.bg.iR */
/* loaded from: classes3.dex */
public class C6975iR {
    /* renamed from: bg */
    public static Object m90394bg(C6951bg c6951bg) {
        InterfaceC6977zx m90393bg;
        if (c6951bg == null || (m90393bg = m90393bg(c6951bg.m90456bg())) == null) {
            return null;
        }
        return m90393bg.mo90392bg(null, c6951bg.m90457IL());
    }

    /* renamed from: bg */
    public static InterfaceC6977zx m90393bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3143097:
                if (str.equals("find")) {
                    c = 0;
                    break;
                }
                break;
            case 96955127:
                if (str.equals("exist")) {
                    c = 1;
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c = 2;
                    break;
                }
                break;
            case 2056988195:
                if (str.equals("isDigit")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C6969bX();
            case 1:
                return new C6911IL();
            case 2:
                return new C6976ldr();
            case 3:
                return new C6974eqN();
            default:
                return null;
        }
    }
}
