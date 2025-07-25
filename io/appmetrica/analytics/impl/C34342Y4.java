package io.appmetrica.analytics.impl;

import android.database.Cursor;
import io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.Y4 */
/* loaded from: classes9.dex */
public final class C34342Y4 extends DatabaseScript {

    /* renamed from: a */
    public final String f93795a = "sessions";

    /* renamed from: b */
    public final int f93796b = 200;

    /* renamed from: c */
    public final String f93797c = "id";

    /* renamed from: d */
    public final String f93798d = "start_time";

    /* renamed from: e */
    public final String f93799e = "report_request_parameters";

    /* renamed from: f */
    public final String f93800f = "server_time_offset";

    /* renamed from: g */
    public final String f93801g = "type";

    /* renamed from: h */
    public final String f93802h = "obtained_before_first_sync";

    /* renamed from: i */
    public final C34955v7 f93803i = new C34955v7(null, 1, null);

    /* renamed from: a */
    public final C34929u7 m22078a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f93797c)));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(this.f93801g));
            EnumC34433bk enumC34433bk = EnumC34433bk.FOREGROUND;
            boolean z = true;
            if (i != 0) {
                enumC34433bk = EnumC34433bk.BACKGROUND;
                if (i != 1) {
                    enumC34433bk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f93799e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f93798d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f93800f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f93802h)) != 1) {
                z = false;
            }
            return new C34929u7(valueOf, enumC34433bk, string, new C34903t7(valueOf2, valueOf3, Boolean.valueOf(z)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r2 == null) goto L47;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void runScript(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r11.f93795a     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r2 = r11.f93796b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r2 = r12
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5a
        L19:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            io.appmetrica.analytics.impl.u7 r3 = r11.m22078a(r2)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L19
            java.lang.Long r4 = r3.f95454a     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L19
            io.appmetrica.analytics.impl.bk r4 = r3.f95455b     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            java.lang.String r4 = r3.f95456c     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L42
            goto L19
        L42:
            io.appmetrica.analytics.impl.t7 r4 = r3.f95457d     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r4 = r4.f95373a     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.appmetrica.analytics.impl.v7 r4 = r11.f93803i     // Catch: java.lang.Throwable -> L5b
            android.content.ContentValues r3 = r4.fromModel(r3)     // Catch: java.lang.Throwable -> L5b
            r0.add(r3)     // Catch: java.lang.Throwable -> L5b
            goto L19
        L5a:
            r2 = r1
        L5b:
            if (r2 == 0) goto L60
        L5d:
            r2.close()
        L60:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r2.<init>(r3)
            java.lang.String r3 = r11.f93795a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.execSQL(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )"
            r12.execSQL(r2)
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r0.next()
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            java.lang.String r3 = "sessions"
            r12.insertOrThrow(r3, r1, r2)     // Catch: java.lang.Throwable -> L7c
            goto L7c
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34342Y4.runScript(android.database.sqlite.SQLiteDatabase):void");
    }
}
