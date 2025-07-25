package io.bidmachine.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.C20517nb;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p1046xd.Closeable;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: io.bidmachine.analytics.internal.c */
/* loaded from: classes9.dex */
public final class C35589c extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final C35590a f96413a = new C35590a(null);

    /* renamed from: io.bidmachine.analytics.internal.c$a */
    /* loaded from: classes9.dex */
    public static final class C35590a {
        private C35590a() {
        }

        public /* synthetic */ C35590a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C35589c(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* renamed from: a */
    private final Object m20261a(SQLiteDatabase sQLiteDatabase) {
        try {
            Result.C38506a c38506a = Result.f101870c;
            Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ?", new String[]{C20517nb.f52170Q}, null, null, null);
            while (query.moveToNext()) {
                Result.C38506a c38506a2 = Result.f101870c;
                String string = query.getString(0);
                if (!Intrinsics.m17075f(string, "android_metadata") && !Intrinsics.m17075f(string, "sqlite_master")) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string);
                }
                Result.m14549b(Unit.f99208a);
            }
            Unit unit = Unit.f99208a;
            Closeable.m1220a(query, null);
            return Result.m14549b(unit);
        } catch (Throwable th) {
            Result.C38506a c38506a3 = Result.f101870c;
            return Result.m14549b(C38508r.m14540a(th));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE monitor_record (id TEXT,name TEXT,timestamp INTEGER,session_id TEXT,data BLOB,error BLOB,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE reader_record (id TEXT,name TEXT,timestamp INTEGER,data_hash TEXT,rule TEXT,error BLOB,is_dirty INTEGER,is_reserved INTEGER DEFAULT 0)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m20261a(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS monitor_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reader_record");
        onCreate(sQLiteDatabase);
    }
}
