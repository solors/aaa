package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.p047a.p048a.p059h.Metric;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.learnings.abcenter.util.AbCenterConstant;
import io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.X4 */
/* loaded from: classes9.dex */
public final class C34318X4 extends DatabaseScript {

    /* renamed from: a */
    public final int f93684a = 2000;

    /* renamed from: b */
    public final String f93685b = AbCenterConstant.VALUE_TYPE_NUMBER;

    /* renamed from: c */
    public final String f93686c = "global_number";

    /* renamed from: d */
    public final String f93687d = "number_of_type";

    /* renamed from: e */
    public final String f93688e = "name";

    /* renamed from: f */
    public final String f93689f = "value";

    /* renamed from: g */
    public final String f93690g = "type";

    /* renamed from: h */
    public final String f93691h = Metric.f2405b;

    /* renamed from: i */
    public final String f93692i = SDKAnalyticsEvents.PARAMETER_SESSION_ID;

    /* renamed from: j */
    public final String f93693j = "error_environment";

    /* renamed from: k */
    public final String f93694k = "session_type";

    /* renamed from: l */
    public final String f93695l = "app_environment";

    /* renamed from: m */
    public final String f93696m = "app_environment_revision";

    /* renamed from: n */
    public final String f93697n = "truncated";

    /* renamed from: o */
    public final String f93698o = "custom_type";

    /* renamed from: p */
    public final String f93699p = "encrypting_mode";

    /* renamed from: q */
    public final String f93700q = "profile_id";

    /* renamed from: r */
    public final String f93701r = "first_occurrence_status";

    /* renamed from: s */
    public final String f93702s = "source";

    /* renamed from: t */
    public final String f93703t = "attribution_id_changed";

    /* renamed from: u */
    public final String f93704u = "open_id";

    /* renamed from: v */
    public final String f93705v = "extras";

    /* renamed from: w */
    public final String f93706w = "reports";

    /* renamed from: x */
    public final C34582h7 f93707x = new C34582h7(null, 1, null);

    /* renamed from: a */
    public static boolean m22116a(C34555g7 c34555g7) {
        Long l;
        EnumC34324Xa enumC34324Xa;
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        Long l5 = c34555g7.f94432a;
        return (l5 == null || l5.longValue() < 10000000000L || c34555g7.f94433b == null || (l = c34555g7.f94434c) == null || l.longValue() < 0 || (enumC34324Xa = c34555g7.f94435d) == null || enumC34324Xa == EnumC34324Xa.EVENT_TYPE_UNDEFINED || (l2 = c34555g7.f94436e) == null || l2.longValue() < 0 || (l3 = c34555g7.f94437f) == null || l3.longValue() < 0 || ((l4 = c34555g7.f94438g.f94322d) != null && l4.longValue() < 0) || ((num = c34555g7.f94438g.f94327i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query(this.f93706w, null, null, null, null, null, null, String.valueOf(this.f93684a));
            while (cursor.moveToNext()) {
                try {
                    C34555g7 m22117a = m22117a(cursor);
                    if (m22117a != null && m22116a(m22117a)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f93707x.fromModel(m22117a));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor = cursor2;
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f93706w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f93706w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
        if (r3.intValue() == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0133, code lost:
        if (r2.intValue() == 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0162, code lost:
        if (r2.intValue() == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0164, code lost:
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
        if (r2.intValue() == 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0184, code lost:
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f93703t)) != 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r3.intValue() != 0) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed A[Catch: all -> 0x01bb, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:88:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f A[Catch: all -> 0x0147, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:88:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d A[Catch: all -> 0x0147, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:88:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x0176, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:88:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:88:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7 A[Catch: all -> 0x01bb, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:88:0x0004 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C34555g7 m22117a(android.database.Cursor r32) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34318X4.m22117a(android.database.Cursor):io.appmetrica.analytics.impl.g7");
    }
}
