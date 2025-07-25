package sg.bigo.ads.common.p914g.p917c;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p914g.p915a.C43666a;
import sg.bigo.ads.common.p914g.p916b.C43675b;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43840t;

/* renamed from: sg.bigo.ads.common.g.c.b */
/* loaded from: classes10.dex */
public final class C43678b {
    /* renamed from: a */
    public static long m5230a(List<String> list) {
        C43782a.m5010a(0, 3, "StatsDbHelper", "delStatInfo:" + list.size());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        int i = 0;
        while (i < list.size()) {
            sb2.append(i == 0 ? "?" : ",?");
            i++;
        }
        sb2.append(")");
        long m5237b = C43666a.m5237b("tb_stat", sb2.toString(), (String[]) list.toArray(new String[0]));
        C43782a.m5010a(0, 3, "StatsDbHelper", "delStatInfo count = ".concat(String.valueOf(m5237b)));
        return m5237b;
    }

    /* renamed from: a */
    public static List<C43675b> m5231a(int i) {
        Cursor m5240a = C43666a.m5240a("tb_stat", null, null, "mtime DESC", i);
        ArrayList arrayList = new ArrayList();
        if (m5240a == null) {
            return arrayList;
        }
        C43782a.m5010a(0, 3, "StatsDbHelper", "getStatInfoList: count = " + m5240a.getCount());
        while (m5240a.moveToNext()) {
            arrayList.add(new C43675b(m5240a));
            C43840t.m4813a();
        }
        m5240a.close();
        return arrayList;
    }
}
