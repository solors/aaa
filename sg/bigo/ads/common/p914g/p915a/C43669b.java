package sg.bigo.ads.common.p914g.p915a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.g.a.b */
/* loaded from: classes10.dex */
public final class C43669b extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C43669b f114301a;

    /* renamed from: b */
    private static WeakReference<Context> f114302b;

    private C43669b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        f114302b = new WeakReference<>(context);
        C43782a.m5010a(0, 3, "DBHelper", "DbOpenHelper newInstance");
    }

    /* renamed from: a */
    public static synchronized C43669b m5235a(@NonNull Context context) {
        C43669b c43669b;
        synchronized (C43669b.class) {
            if (f114301a == null) {
                f114301a = new C43669b(context, "bigo_ads_sdk.db");
            }
            c43669b = f114301a;
        }
        return c43669b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C43782a.m5010a(0, 3, "DBHelper", "onCreate start");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_event (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_action TEXT NOT NULL,event_info TEXT NOT NULL,states INTEGER DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_tracker (_id INTEGER PRIMARY KEY AUTOINCREMENT,ad_data TEXT NOT NULL,tracker_imp TEXT,tracker_cli TEXT,tracker_nurl TEXT,tracker_lurl TEXT,tracker_type INTEGER DEFAULT 0 NOT NULL,last_retry_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_stat (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_id TEXT NOT NULL,event_info TEXT NOT NULL,expired_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        C43782a.m5010a(0, 3, "DBHelper", "onCreate end");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Context context;
        String str = "onDowngrade oldVersion=" + i + ",newVersion=" + i2;
        C43782a.m5010a(0, 3, "DBHelper", str);
        super.onDowngrade(sQLiteDatabase, i, i2);
        WeakReference<Context> weakReference = f114302b;
        if (weakReference != null && (context = weakReference.get()) != null) {
            C43666a.m5245a(context, str);
            C43666a.m5246a(context);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C43782a.m5010a(1, 4, "DBHelper", "Upgrading database from version " + i + " to " + i2);
        if (i < 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_nurl TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_lurl TEXT");
        }
    }

    /* renamed from: a */
    public static void m5236a() {
        f114301a = null;
    }
}
