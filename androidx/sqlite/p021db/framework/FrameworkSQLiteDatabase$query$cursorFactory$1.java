package androidx.sqlite.p021db.framework;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: FrameworkSQLiteDatabase.kt */
@Metadata
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1 */
/* loaded from: classes2.dex */
final class FrameworkSQLiteDatabase$query$cursorFactory$1 extends Lambda implements InterfaceC45269o<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {
    final /* synthetic */ SupportSQLiteQuery $query;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteDatabase$query$cursorFactory$1(SupportSQLiteQuery supportSQLiteQuery) {
        super(4);
        this.$query = supportSQLiteQuery;
    }

    @Override // p1076zd.InterfaceC45269o
    @NotNull
    public final SQLiteCursor invoke(@Nullable SQLiteDatabase sQLiteDatabase, @Nullable SQLiteCursorDriver sQLiteCursorDriver, @Nullable String str, @Nullable SQLiteQuery sQLiteQuery) {
        SupportSQLiteQuery supportSQLiteQuery = this.$query;
        Intrinsics.m17074g(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
