package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg;

import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.iR */
/* loaded from: classes3.dex */
public class C7691iR {

    /* renamed from: bg */
    public static String f16826bg = "com.bytedance.openadsdk";

    /* renamed from: IL */
    public static String f16825IL = "content://" + f16826bg + ".TTMultiProvider";

    static {
        m88033bg();
    }

    /* renamed from: bg */
    public static void m88033bg() {
        if (C7659Kg.m88154iR().ldr() != null) {
            f16826bg = C7659Kg.m88154iR().ldr().getPackageName();
            f16825IL = "content://" + f16826bg + ".TTMultiProvider";
        }
    }
}
