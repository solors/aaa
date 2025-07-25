package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.r9 */
/* loaded from: classes6.dex */
public final class C20748r9 {
    @NotNull

    /* renamed from: a */
    public static final C20749a f52738a = new C20749a(null);
    @NotNull

    /* renamed from: b */
    private static final Object f52739b = new Object();

    @Metadata
    /* renamed from: com.ironsource.r9$a */
    /* loaded from: classes6.dex */
    public static final class C20749a {
        private C20749a() {
        }

        public /* synthetic */ C20749a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    /* renamed from: a */
    public final SQLiteDatabase m55533a(@NotNull SQLiteOpenHelper sqliteOpenHelper) {
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return m55532a(this, false, sqliteOpenHelper, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ SQLiteDatabase m55532a(C20748r9 c20748r9, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c20748r9.m55531a(z, sQLiteOpenHelper);
    }

    @Nullable
    /* renamed from: a */
    public final SQLiteDatabase m55531a(boolean z, @NotNull SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase writableDatabase;
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f52739b) {
            writableDatabase = z ? sqliteOpenHelper.getWritableDatabase() : sqliteOpenHelper.getReadableDatabase();
        }
        return writableDatabase;
    }
}
