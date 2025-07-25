package lb;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.DatabaseOpenHelper;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import p834pb.SqlExtensions;

@Metadata
/* renamed from: lb.c */
/* loaded from: classes8.dex */
public final class StorageStatementExecutor implements SqlCompiler, Closeable {
    @NotNull

    /* renamed from: b */
    private final DatabaseOpenHelper.InterfaceC38137b f100875b;
    @NotNull

    /* renamed from: c */
    private final List<SQLiteStatement> f100876c;
    @NotNull

    /* renamed from: d */
    private final List<Cursor> f100877d;

    public StorageStatementExecutor(@NotNull DatabaseOpenHelper.InterfaceC38137b db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.f100875b = db;
        this.f100876c = new ArrayList();
        this.f100877d = new ArrayList();
    }

    /* renamed from: e */
    public static final Cursor m15576e(StorageStatementExecutor this$0, String sql, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "$selectionArgs");
        Cursor rawQuery = this$0.f100875b.rawQuery(sql, selectionArgs);
        this$0.f100877d.add(rawQuery);
        return rawQuery;
    }

    @Override // lb.SqlCompiler
    @NotNull
    /* renamed from: a */
    public ReadState mo15565a(@NotNull final String sql, @NotNull final String... selectionArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        return new ReadState(null, new Provider() { // from class: lb.b
            {
                StorageStatementExecutor.this = this;
            }

            @Override // md.Provider
            public final Object get() {
                Cursor m15576e;
                m15576e = StorageStatementExecutor.m15576e(StorageStatementExecutor.this, sql, selectionArgs);
                return m15576e;
            }
        }, 1, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (SQLiteStatement sQLiteStatement : this.f100876c) {
            SqlExtensions.m13201a(sQLiteStatement);
        }
        this.f100876c.clear();
        for (Cursor cursor : this.f100877d) {
            if (!cursor.isClosed()) {
                SqlExtensions.m13201a(cursor);
            }
        }
        this.f100877d.clear();
    }

    @Override // lb.SqlCompiler
    @NotNull
    public SQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f100875b.compileStatement(sql);
        this.f100876c.add(compileStatement);
        return compileStatement;
    }
}
