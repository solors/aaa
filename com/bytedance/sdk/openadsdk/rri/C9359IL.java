package com.bytedance.sdk.openadsdk.rri;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.bytedance.sdk.openadsdk.rri.IL */
/* loaded from: classes3.dex */
public class C9359IL {
    /* renamed from: bg */
    public static String m82954bg() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0, ad_id TEXT , url_type INTEGER default 0, error_code TEXT ,error_msg TEXT )").toString();
    }

    /* renamed from: bg */
    public static void m82953bg(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN ad_id TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_code TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_msg TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN url_type INTEGER default 0");
    }
}
