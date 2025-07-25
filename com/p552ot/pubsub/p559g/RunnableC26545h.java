package com.p552ot.pubsub.p559g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.p552ot.pubsub.p559g.C26542f;
import com.p552ot.pubsub.util.C26586j;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.g.h */
/* loaded from: classes7.dex */
public class RunnableC26545h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26542f f69523a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26545h(C26542f c26542f) {
        this.f69523a = c26542f;
    }

    @Override // java.lang.Runnable
    public void run() {
        C26542f.C26543a c26543a;
        C26542f.C26543a c26543a2;
        C26542f.C26543a c26543a3;
        c26543a = this.f69523a.f69502c;
        synchronized (c26543a) {
            c26543a2 = this.f69523a.f69502c;
            if (c26543a2 == null) {
                return;
            }
            Cursor cursor = null;
            try {
                try {
                    c26543a3 = this.f69523a.f69502c;
                    SQLiteDatabase writableDatabase = c26543a3.getWritableDatabase();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    calendar.set(6, calendar.get(6) - 7);
                    boolean z = false;
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    String[] strArr = {Long.toString(calendar.getTimeInMillis())};
                    cursor = writableDatabase.query(C26542f.C26543a.f69504b, new String[]{"timestamp"}, "timestamp < ? ", strArr, null, null, "timestamp ASC");
                    if (cursor.getCount() != 0) {
                        C26586j.m41080a("MessageOTManager", "*** deleted obsolete item count=" + writableDatabase.delete(C26542f.C26543a.f69504b, "timestamp < ? ", strArr));
                    }
                    long m41250e = C26542f.m41264a().m41250e();
                    C26542f c26542f = this.f69523a;
                    if (m41250e == 0) {
                        z = true;
                    }
                    c26542f.m41257a(z);
                    C26586j.m41080a("MessageOTManager", "after delete obsolete record remains=" + m41250e);
                    cursor.close();
                } catch (Exception e) {
                    C26586j.m41066d("MessageOTManager", "remove obsolete messages failed with " + e);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
