package com.inmobi.media;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Q2 */
/* loaded from: classes6.dex */
public final class C19068Q2 extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final /* synthetic */ int f47629a = 0;

    public C19068Q2(Context context) {
        super(context, "com.im_10.7.8.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
    }
}
