package sg.bigo.ads.common.p914g.p917c;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p914g.p915a.C43666a;
import sg.bigo.ads.common.p914g.p916b.AbstractC43676c;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.g.c.c */
/* loaded from: classes10.dex */
public final class C43679c {
    /* renamed from: a */
    public static long m5228a(String str) {
        C43782a.m5010a(0, 3, "TrackerDbHelper", "delete:".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return m5227a(arrayList);
    }

    /* renamed from: b */
    public static long m5224b(long j) {
        C43782a.m5010a(0, 3, "TrackerDbHelper", "clearTrackerInfo");
        long m5237b = C43666a.m5237b("tb_tracker", "ctime < ".concat(String.valueOf(j)), null);
        C43782a.m5010a(0, 3, "TrackerDbHelper", "clearTrackerInfo count = ".concat(String.valueOf(m5237b)));
        return m5237b;
    }

    /* renamed from: c */
    public static boolean m5222c(AbstractC43676c abstractC43676c) {
        C43782a.m5010a(0, 3, "TrackerDbHelper", "exist:" + abstractC43676c.toString());
        Cursor m5241a = C43666a.m5241a("tb_tracker", m5225a(new String[]{"_id"}), new String[]{String.valueOf(abstractC43676c.f114327a)});
        if (m5241a == null) {
            return false;
        }
        boolean moveToNext = m5241a.moveToNext();
        m5241a.close();
        return moveToNext;
    }

    /* renamed from: d */
    private static ContentValues m5221d(AbstractC43676c abstractC43676c) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ad_data", abstractC43676c.m5234a());
        contentValues.put("tracker_imp", abstractC43676c.mo3762b());
        contentValues.put("tracker_cli", abstractC43676c.mo3760c());
        contentValues.put("tracker_nurl", abstractC43676c.mo3758d());
        contentValues.put("tracker_lurl", abstractC43676c.mo3756e());
        contentValues.put("last_retry_ts", Long.valueOf(abstractC43676c.mo3755f()));
        contentValues.put("ext", abstractC43676c.f114331e);
        long j = abstractC43676c.f114332f;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(j));
        long j2 = abstractC43676c.f114333g;
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(j2));
        return contentValues;
    }

    /* renamed from: a */
    private static long m5227a(List<String> list) {
        C43782a.m5010a(0, 3, "TrackerDbHelper", "delete:" + list.size());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        int i = 0;
        while (i < list.size()) {
            sb2.append(i == 0 ? "?" : ",?");
            i++;
        }
        sb2.append(")");
        long m5237b = C43666a.m5237b("tb_tracker", sb2.toString(), (String[]) list.toArray(new String[0]));
        C43782a.m5010a(0, 3, "TrackerDbHelper", "delTrackerInfo count = ".concat(String.valueOf(m5237b)));
        return m5237b;
    }

    /* renamed from: b */
    public static long m5223b(AbstractC43676c abstractC43676c) {
        C43782a.m5010a(0, 3, "TrackerDbHelper", "update: " + abstractC43676c.toString());
        abstractC43676c.f114333g = System.currentTimeMillis();
        return C43666a.m5242a("tb_tracker", m5221d(abstractC43676c), m5225a(new String[]{"_id"}), new String[]{String.valueOf(abstractC43676c.f114327a)});
    }

    /* renamed from: a */
    public static long m5226a(AbstractC43676c abstractC43676c) {
        C43782a.m5010a(0, 3, "TrackerDbHelper", "insert:" + abstractC43676c.toString());
        return C43666a.m5243a("tb_tracker", m5221d(abstractC43676c));
    }

    /* renamed from: a */
    public static Cursor m5229a(long j) {
        return C43666a.m5240a("tb_tracker", "last_retry_ts < " + (System.currentTimeMillis() - j), null, "last_retry_ts", 10);
    }

    /* renamed from: a */
    private static String m5225a(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            sb2.append(strArr[0]);
            sb2.append("=? ");
        }
        return sb2.toString();
    }
}
