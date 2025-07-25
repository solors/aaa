package com.apm.insight.p122e.p123a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.AppDataCenter;
import com.apm.insight.p121d.DartCrash;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.apm.insight.e.a.b */
/* loaded from: classes2.dex */
public final class DuplicateLogDAO extends AbsDAO<DartCrash> {
    public DuplicateLogDAO() {
        super("duplicatelog");
    }

    @Override // com.apm.insight.p122e.p123a.AbsDAO
    /* renamed from: a */
    protected final /* synthetic */ ContentValues mo101985a(DartCrash dartCrash) {
        DartCrash dartCrash2 = dartCrash;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", dartCrash2.f3703a);
        contentValues.put("insert_time", Long.valueOf(dartCrash2.f3704b));
        return contentValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m101986a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L2e
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto La
            goto L2e
        La:
            r1 = 1
            java.lang.String r3 = r10.f3733a     // Catch: java.lang.Throwable -> L26
            r4 = 0
            java.lang.String r5 = "path=?"
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L26
            r6[r0] = r12     // Catch: java.lang.Throwable -> L26
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L26
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L26
            r11.close()     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r11 = move-exception
            goto L28
        L26:
            r11 = move-exception
            r12 = r0
        L28:
            com.apm.insight.AppDataCenter.m102158b(r11)
        L2b:
            if (r12 <= 0) goto L2e
            return r1
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p122e.p123a.DuplicateLogDAO.m101986a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    @Override // com.apm.insight.p122e.p123a.AbsDAO
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void mo101987a(SQLiteDatabase sQLiteDatabase, DartCrash dartCrash) {
        if (dartCrash == null || m101986a(sQLiteDatabase, dartCrash.f3703a)) {
            return;
        }
        super.mo101987a(sQLiteDatabase, (SQLiteDatabase) dartCrash);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f3733a + " where _id in (select _id from " + this.f3733a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e) {
            AppDataCenter.m102158b((Throwable) e);
        }
    }

    @Override // com.apm.insight.p122e.p123a.AbsDAO
    /* renamed from: a */
    protected final HashMap<String, String> mo101989a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("path", "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }
}
