package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pt */
/* loaded from: classes8.dex */
public final class C31152pt implements pa2 {

    /* renamed from: a */
    final /* synthetic */ C30746kt f84072a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31152pt(C30746kt c30746kt) {
        this.f84072a = c30746kt;
    }

    @Override // com.yandex.mobile.ads.impl.pa2
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> mo26370a() {
        List<i12> list;
        int m17292f;
        int m17154x;
        C30972nt m32444c = this.f84072a.m32444c();
        if (m32444c != null) {
            list = m32444c.m31315c();
        } else {
            list = null;
        }
        if (list == null) {
            list = C37563v.m17166m();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
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
