package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dr0 {
    @NotNull
    /* renamed from: a */
    public static final LinkedHashMap m34864a(@NotNull Map map) {
        int m17292f;
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m17292f = MapsJVM.m17292f(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m17292f);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), new WeakReference(entry2.getValue()));
        }
        return linkedHashMap2;
    }
}
