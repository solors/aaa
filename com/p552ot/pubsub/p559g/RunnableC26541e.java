package com.p552ot.pubsub.p559g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.p552ot.pubsub.p559g.C26538c;
import com.p552ot.pubsub.util.C26586j;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.g.e */
/* loaded from: classes7.dex */
public class RunnableC26541e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26538c f69491a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26541e(C26538c c26538c) {
        this.f69491a = c26538c;
    }

    @Override // java.lang.Runnable
    public void run() {
        C26538c.C26539a c26539a;
        C26538c.C26539a c26539a2;
        C26538c.C26539a c26539a3;
        c26539a = this.f69491a.f69473c;
        if (c26539a != null) {
            c26539a2 = this.f69491a.f69473c;
            synchronized (c26539a2) {
                Cursor cursor = null;
                try {
                    try {
                        c26539a3 = this.f69491a.f69473c;
                        SQLiteDatabase writableDatabase = c26539a3.getWritableDatabase();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(6, calendar.get(6) - 7);
                        boolean z = false;
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        String[] strArr = {Long.toString(calendar.getTimeInMillis())};
                        cursor = writableDatabase.query(C26538c.C26539a.f69475b, new String[]{"timestamp"}, "timestamp < ? ", strArr, null, null, "timestamp ASC");
                        if (cursor.getCount() != 0) {
                            C26586j.m41080a("MessageManager", "*** deleted obsolete item count=" + writableDatabase.delete(C26538c.C26539a.f69475b, "timestamp < ? ", strArr));
                        }
                        long m41266f = C26538c.m41280a().m41266f();
                        C26538c c26538c = this.f69491a;
                        if (m41266f == 0) {
                            z = true;
                        }
                        c26538c.m41274a(z);
                        C26586j.m41080a("MessageManager", "after delete obsolete record remains=" + m41266f);
                        cursor.close();
                    } catch (Exception e) {
                        C26586j.m41066d("MessageManager", "remove obsolete messages failed with " + e);
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
