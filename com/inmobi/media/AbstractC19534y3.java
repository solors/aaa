package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y3 */
/* loaded from: classes6.dex */
public abstract class AbstractC19534y3 extends AbstractC19518x1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC19534y3(String tableName, String tableSchema) {
        super(tableName, tableSchema);
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
    }

    /* renamed from: a */
    public final void m59559a(List eventIdList) {
        Intrinsics.checkNotNullParameter(eventIdList, "eventIdList");
        if (eventIdList.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = eventIdList.size() - 1;
        for (int i = 0; i < size; i++) {
            sb2.append(eventIdList.get(i));
            sb2.append(",");
        }
        sb2.append(eventIdList.get(eventIdList.size() - 1));
        m59591a("id IN (" + ((Object) sb2) + ')', null);
        Intrinsics.checkNotNullExpressionValue("y3", "TAG");
    }

    /* renamed from: b */
    public final ArrayList m59558b(int i) {
        Intrinsics.checkNotNullExpressionValue("y3", "TAG");
        ArrayList<AbstractC19532y1> m59594a = AbstractC19518x1.m59594a(this, null, null, null, null, "ts ASC", Integer.valueOf(i), 15);
        ArrayList arrayList = new ArrayList();
        for (AbstractC19532y1 abstractC19532y1 : m59594a) {
            if (abstractC19532y1 != null) {
                arrayList.add(abstractC19532y1);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m59560a(long j) {
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "batch_processing_info");
            m59823a.m59619a(this.f48862a + "_last_batch_process", j);
        }
    }

    /* renamed from: a */
    public final void m59561a(int i) {
        ArrayList<AbstractC19532y1> m59594a = AbstractC19518x1.m59594a(this, null, null, null, null, "ts ASC", Integer.valueOf(i), 15);
        ArrayList arrayList = new ArrayList();
        for (AbstractC19532y1 abstractC19532y1 : m59594a) {
            Intrinsics.checkNotNullExpressionValue("y3", "TAG");
            arrayList.add(abstractC19532y1 != null ? Integer.valueOf(abstractC19532y1.f48923c) : null);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                arrayList2.add(num);
            }
        }
        m59559a((List) arrayList2);
    }
}
