package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.C9095yDt;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9351bg;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.IL */
/* loaded from: classes3.dex */
public class C9307IL {

    /* renamed from: bg */
    public static Boolean f20805bg;

    /* renamed from: IL */
    public static void m83089IL() {
        f20805bg = Boolean.FALSE;
        BinderPoolService.f20812bg = true;
    }

    /* renamed from: bX */
    public static boolean m83088bX() {
        Boolean bool = f20805bg;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!C9095yDt.m83545zx()) {
            return false;
        }
        if (f20805bg == null) {
            f20805bg = Boolean.valueOf(C9351bg.m82986bg("sp_multi_info", "is_support_multi_process", false));
        }
        return f20805bg.booleanValue();
    }

    /* renamed from: bg */
    public static void m83087bg() {
        Boolean bool = Boolean.TRUE;
        f20805bg = bool;
        C9351bg.m82991bg("sp_multi_info", "is_support_multi_process", bool);
    }
}
