package sg.bigo.ads.common.p914g.p915a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.p914g.p915a.C43670c;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.common.utils.C43840t;

/* renamed from: sg.bigo.ads.common.g.a.a */
/* loaded from: classes10.dex */
public final class C43666a {

    /* renamed from: a */
    static C43670c f114296a;

    /* renamed from: b */
    static AtomicBoolean f114297b = new AtomicBoolean(false);
    @Nullable

    /* renamed from: c */
    static SQLiteDatabase f114298c;

    /* renamed from: sg.bigo.ads.common.g.a.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43668a {
        /* renamed from: a */
        void mo4188a();

        /* renamed from: a */
        void mo4187a(String str);
    }

    /* renamed from: a */
    public static int m5242a(String str, ContentValues contentValues, String str2, String[] strArr) {
        m5239b();
        SQLiteDatabase sQLiteDatabase = f114298c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } catch (SQLException unused) {
            C43782a.m5009a(0, "DbHelper", "Failed: ".concat(String.valueOf(contentValues)));
            return 0;
        }
    }

    /* renamed from: b */
    public static int m5237b(String str, String str2, String[] strArr) {
        m5239b();
        SQLiteDatabase sQLiteDatabase = f114298c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static long m5243a(String str, ContentValues contentValues) {
        m5239b();
        if (f114298c != null && !C43906a.m4616p()) {
            try {
                return f114298c.insert(str, null, contentValues);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* renamed from: b */
    public static long m5238b(String str, ContentValues contentValues) {
        m5239b();
        if (f114298c != null && !C43906a.m4616p()) {
            try {
                return f114298c.insertWithOnConflict(str, null, contentValues, 5);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* renamed from: a */
    public static Cursor m5241a(String str, String str2, String[] strArr) {
        m5239b();
        SQLiteDatabase sQLiteDatabase = f114298c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m5239b() {
        Runnable poll;
        C43670c c43670c = f114296a;
        if (c43670c == null || f114297b.get()) {
            return;
        }
        while (true) {
            synchronized (c43670c.f114304b) {
                poll = c43670c.f114303a.poll();
            }
            if (poll == null) {
                return;
            }
            poll.run();
        }
    }

    /* renamed from: a */
    public static Cursor m5240a(String str, String str2, String[] strArr, String str3, int i) {
        m5239b();
        SQLiteDatabase sQLiteDatabase = f114298c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, str3, Integer.toString(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m5247a() {
        C43840t.m4813a();
    }

    /* renamed from: a */
    public static void m5246a(@NonNull Context context) {
        f114297b.set(false);
        f114296a = null;
        m5244a(context, (InterfaceC43668a) null);
    }

    /* renamed from: a */
    public static void m5245a(@NonNull Context context, @Nullable String str) {
        File databasePath = context.getDatabasePath("bigo_ads_sdk.db");
        C43782a.m5009a(0, "DbHelper", String.format("exception path:%s exists:%s isfile:%s read:%s write:%s exec:%s hidden:%s errormsg:%s", databasePath.getPath(), Boolean.valueOf(databasePath.exists()), Boolean.valueOf(databasePath.isFile()), Boolean.valueOf(databasePath.canRead()), Boolean.valueOf(databasePath.canWrite()), Boolean.valueOf(databasePath.canExecute()), Boolean.valueOf(databasePath.isHidden()), str));
        C43782a.m5010a(0, 3, "DbHelper", "deleteDatabase start");
        context.deleteDatabase("bigo_ads_sdk.db");
        C43669b.m5236a();
        C43782a.m5010a(0, 3, "DbHelper", "deleteDatabase end");
    }

    /* renamed from: a */
    public static void m5244a(@NonNull final Context context, final InterfaceC43668a interfaceC43668a) {
        final C43670c c43670c = new C43670c();
        f114296a = c43670c;
        final C43670c.RunnableC43672a runnableC43672a = new C43670c.RunnableC43672a(new Runnable() { // from class: sg.bigo.ads.common.g.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                C43782a.m5010a(0, 3, "DbHelper", "init start");
                try {
                    C43666a.f114298c = C43669b.m5235a(context).getWritableDatabase();
                } catch (Throwable th) {
                    C43666a.m5245a(context, Log.getStackTraceString(th));
                    try {
                        C43666a.f114298c = C43669b.m5235a(context).getWritableDatabase();
                    } catch (Throwable th2) {
                        C43782a.m5009a(0, "DbHelper", "can't get db final," + th2.getMessage());
                        C43666a.f114298c = null;
                    }
                }
                C43666a.f114297b.set(true);
                C43666a.f114296a = null;
                InterfaceC43668a interfaceC43668a2 = interfaceC43668a;
                if (interfaceC43668a2 != null) {
                    if (C43666a.f114298c != null) {
                        interfaceC43668a2.mo4188a();
                    } else {
                        interfaceC43668a2.mo4187a("");
                    }
                }
                C43782a.m5010a(0, 3, "DbHelper", "init end");
            }
        });
        final Runnable runnable = runnableC43672a.f114310b;
        synchronized (c43670c.f114304b) {
            c43670c.f114303a.add(runnable);
        }
        c43670c.f114305c.execute(new Runnable() { // from class: sg.bigo.ads.common.g.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                runnableC43672a.run();
                runnable.run();
                synchronized (c43670c.f114304b) {
                    c43670c.f114303a.remove(runnable);
                }
            }
        });
    }
}
