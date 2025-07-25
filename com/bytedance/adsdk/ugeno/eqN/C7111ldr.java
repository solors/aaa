package com.bytedance.adsdk.ugeno.eqN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.ldr */
/* loaded from: classes3.dex */
public class C7111ldr {

    /* renamed from: bg */
    private static Map<String, C7094bX> f15279bg = new HashMap();

    /* renamed from: bg */
    public static void m90024bg(List<C7094bX> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C7094bX c7094bX : list) {
            if (c7094bX != null) {
                f15279bg.put(c7094bX.m90042bg(), c7094bX);
            }
        }
    }

    /* renamed from: bg */
    public static C7094bX m90025bg(String str) {
        return f15279bg.get(str);
    }
}
