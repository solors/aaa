package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.ugeno.core.eqN */
/* loaded from: classes3.dex */
public class C7078eqN {

    /* renamed from: bg */
    private static Map<String, C7056IL> f15218bg = new HashMap();

    /* renamed from: bg */
    public static void m90092bg(List<C7056IL> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C7056IL c7056il : list) {
            if (c7056il != null) {
                f15218bg.put(c7056il.m90173bg(), c7056il);
            }
        }
    }

    /* renamed from: bg */
    public static C7056IL m90093bg(String str) {
        return f15218bg.get(str);
    }
}
