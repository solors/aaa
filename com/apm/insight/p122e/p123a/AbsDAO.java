package com.apm.insight.p122e.p123a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.AppDataCenter;
import com.apm.insight.Ensure;
import com.apm.insight.runtime.MonitorCrashInner;
import java.util.HashMap;

/* renamed from: com.apm.insight.e.a.a */
/* loaded from: classes2.dex */
public abstract class AbsDAO<T> {

    /* renamed from: a */
    protected final String f3733a;

    /* renamed from: b */
    private String f3734b = "_id";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsDAO(String str) {
        this.f3733a = str;
    }

    /* renamed from: a */
    protected abstract ContentValues mo101985a(T t);

    /* renamed from: a */
    protected abstract HashMap<String, String> mo101989a();

    /* renamed from: a */
    public final void m101990a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(this.f3733a);
            sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> mo101989a = mo101989a();
            for (String str : mo101989a.keySet()) {
                sb2.append(str);
                sb2.append(" ");
                sb2.append(mo101989a.get(str));
                sb2.append(",");
            }
            sb2.delete(sb2.length() - 1, sb2.length());
            sb2.append(")");
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (Throwable th) {
            Ensure.m102051a();
            MonitorCrashInner.m101391a(th, "NPTH_CATCH");
        }
    }

    /* renamed from: a */
    public void mo101987a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase == null || t == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f3733a, null, mo101985a((AbsDAO<T>) t));
        } catch (Throwable th) {
            AppDataCenter.m102158b(th);
        }
    }
}
