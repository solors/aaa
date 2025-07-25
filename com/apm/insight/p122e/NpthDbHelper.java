package com.apm.insight.p122e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.apm.insight.p122e.p123a.DuplicateLogDAO;

/* renamed from: com.apm.insight.e.b */
/* loaded from: classes2.dex */
public final class NpthDbHelper extends SQLiteOpenHelper {
    public NpthDbHelper(@Nullable Context context) {
        super(context, "npth_log.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        new DuplicateLogDAO().m101990a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
