package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.Z6 */
/* loaded from: classes9.dex */
public final class C34368Z6 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    public final String f93867a;

    /* renamed from: b */
    public final PublicLogger f93868b;

    /* renamed from: c */
    public final C34651jm f93869c;

    public C34368Z6(Context context, String str, C34651jm c34651jm, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC33836D5.f92703b);
        this.f93869c = c34651jm;
        this.f93867a = str;
        this.f93868b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f93868b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f93867a);
            C34621ij c34621ij = AbstractC33949Hi.f92970a;
            c34621ij.getClass();
            c34621ij.m21537a(new C33973Ii("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f93868b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f93867a);
            C34621ij c34621ij = AbstractC33949Hi.f92970a;
            c34621ij.getClass();
            c34621ij.m21537a(new C33973Ii("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f93869c.f94747a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C34651jm c34651jm = this.f93869c;
        if (i > i2) {
            try {
                c34651jm.f94748b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                c34651jm.f94747a.runScript(sQLiteDatabase);
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        c34651jm.getClass();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C34651jm c34651jm = this.f93869c;
        c34651jm.getClass();
        try {
            C34678km c34678km = c34651jm.f94750d;
            if (c34678km != null && !c34678km.m21477a(sQLiteDatabase)) {
                try {
                    c34651jm.f94748b.runScript(sQLiteDatabase);
                } catch (Throwable unused) {
                }
                c34651jm.f94747a.runScript(sQLiteDatabase);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            io.appmetrica.analytics.impl.jm r0 = r4.f93869c
            r0.getClass()
            r1 = 1
            if (r7 <= r6) goto L34
            int r6 = r6 + r1
        L9:
            if (r6 > r7) goto L32
            io.appmetrica.analytics.impl.na r2 = r0.f94749c     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L34
            java.util.HashMap r2 = r2.f94995a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L34
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L2f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L34
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L34
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r3 = (io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript) r3     // Catch: java.lang.Throwable -> L34
            r3.runScript(r5)     // Catch: java.lang.Throwable -> L34
            goto L1f
        L2f:
            int r6 = r6 + 1
            goto L9
        L32:
            r6 = 0
            goto L35
        L34:
            r6 = r1
        L35:
            io.appmetrica.analytics.impl.km r7 = r0.f94750d
            boolean r7 = r7.m21477a(r5)
            r7 = r7 ^ r1
            r6 = r6 | r7
            if (r6 == 0) goto L49
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r6 = r0.f94748b
            r6.runScript(r5)     // Catch: java.lang.Throwable -> L44
        L44:
            io.appmetrica.analytics.coreapi.internal.db.DatabaseScript r6 = r0.f94747a
            r6.runScript(r5)     // Catch: java.lang.Throwable -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34368Z6.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
