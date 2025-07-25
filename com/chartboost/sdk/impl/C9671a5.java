package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.a5 */
/* loaded from: classes3.dex */
public final class C9671a5 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9671a5(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, name, cursorFactory, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public /* synthetic */ C9671a5(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? "chartboost_exoplayer.db" : str, (i2 & 4) != 0 ? null : cursorFactory, (i2 & 8) != 0 ? 1 : i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
