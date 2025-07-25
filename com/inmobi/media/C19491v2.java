package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Tuples;
import kotlin.collections.C37563v;
import p804nd.C38513v;

/* renamed from: com.inmobi.media.v2 */
/* loaded from: classes6.dex */
public final class C19491v2 {
    /* renamed from: a */
    public static final Tuples m59824a(TreeMap treeMap) {
        List m17166m;
        List m17166m2;
        if (treeMap.isEmpty()) {
            m17166m = C37563v.m17166m();
            m17166m2 = C37563v.m17166m();
            return C38513v.m14532a(m17166m, m17166m2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C19407p2 c19407p2 = new C19407p2();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            long m59977a = c19407p2.m59977a(str, ((Config) entry.getValue()).getAccountId$media_release());
            arrayList.add(str);
            arrayList2.add(Long.valueOf(m59977a));
        }
        return C38513v.m14532a(arrayList, arrayList2);
    }
}
