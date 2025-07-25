package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j62 implements pa2 {

    /* renamed from: a */
    final /* synthetic */ z52 f80769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j62(z52 z52Var) {
        this.f80769a = z52Var;
    }

    @Override // com.yandex.mobile.ads.impl.pa2
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> mo26370a() {
        int m17292f;
        int m17154x;
        List<i12> m33605b = this.f80769a.m26359l().m33605b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m33605b) {
            String m33392a = ((i12) obj).m33392a();
            Object obj2 = linkedHashMap.get(m33392a);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m33392a, obj2);
            }
            ((List) obj2).add(obj);
        }
        m17292f = MapsJVM.m17292f(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m17292f);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable<i12> iterable = (Iterable) entry.getValue();
            m17154x = C37566w.m17154x(iterable, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (i12 i12Var : iterable) {
                arrayList.add(i12Var.m33390c());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
