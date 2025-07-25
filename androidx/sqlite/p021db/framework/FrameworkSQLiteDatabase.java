package androidx.sqlite.p021db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p021db.SimpleSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteCompat;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: FrameworkSQLiteDatabase.kt */
@Metadata
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase */
/* loaded from: classes2.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    @NotNull
    private final SQLiteDatabase delegate;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    @NotNull
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @RequiresApi(30)
    @Metadata
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Api30Impl */
    /* loaded from: classes2.dex */
    public static final class Api30Impl {
        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final void execPerConnectionSQL(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FrameworkSQLiteDatabase(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public static final Cursor query$lambda$0(InterfaceC45269o tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor query$lambda$1(SupportSQLiteQuery query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.m17074g(sQLiteQuery);
        query.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public int delete(@NotNull String table, @Nullable String str, @Nullable Object[] objArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(table, "table");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(table);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement compileStatement = compileStatement(sb3);
        SimpleSQLiteQuery.Companion.bind(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        SupportSQLiteCompat.Api16Impl.disableWriteAheadLogging(this.delegate);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@NotNull String sql, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void execSQL(@NotNull String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @Nullable
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @Nullable
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public long insert(@NotNull String table, int i, @NotNull ContentValues values) throws SQLException {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, i);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.m17075f(this.delegate, sqLiteDatabase);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return SupportSQLiteCompat.Api16Impl.isWriteAheadLoggingEnabled(this.delegate);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean needUpgrade(int i) {
        return this.delegate.needUpgrade(i);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        SupportSQLiteCompat.Api16Impl.setForeignKeyConstraintsEnabled(this.delegate, z);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void setLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i) {
        this.delegate.setMaxSqlCacheSize(i);
    }

    /* renamed from: setMaximumSize */
    public void m109993setMaximumSize(long j) {
        this.delegate.setMaximumSize(j);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public int update(@NotNull String table, int i, @NotNull ContentValues values, @Nullable String str, @Nullable Object[] objArr) {
        boolean z;
        int length;
        String str2;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        int i2 = 0;
        if (values.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = values.size();
            if (objArr == null) {
                length = size;
            } else {
                length = objArr.length + size;
            }
            Object[] objArr2 = new Object[length];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE ");
            sb2.append(CONFLICT_VALUES[i]);
            sb2.append(table);
            sb2.append(" SET ");
            for (String str3 : values.keySet()) {
                if (i2 > 0) {
                    str2 = ",";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(str3);
                objArr2[i2] = values.get(str3);
                sb2.append("=?");
                i2++;
            }
            if (objArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr2[i3] = objArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append(" WHERE ");
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            SupportSQLiteStatement compileStatement = compileStatement(sb3);
            SimpleSQLiteQuery.Companion.bind(compileStatement, objArr2);
            return compileStatement.executeUpdateDelete();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public void execSQL(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String query, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        return query(new SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public long setMaximumSize(long j) {
        this.delegate.setMaximumSize(j);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j) {
        return this.delegate.yieldIfContendedSafely(j);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final FrameworkSQLiteDatabase$query$cursorFactory$1 frameworkSQLiteDatabase$query$cursorFactory$1 = new FrameworkSQLiteDatabase$query$cursorFactory$1(query);
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$0;
                query$lambda$0 = FrameworkSQLiteDatabase.query$lambda$0(frameworkSQLiteDatabase$query$cursorFactory$1, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$0;
            }
        }, query.getSql(), EMPTY_STRING_ARRAY, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteDatabase
    @RequiresApi(16)
    @NotNull
    public Cursor query(@NotNull final SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String sql = query.getSql();
        String[] strArr = EMPTY_STRING_ARRAY;
        Intrinsics.m17074g(cancellationSignal);
        return SupportSQLiteCompat.Api16Impl.rawQueryWithFactory(sQLiteDatabase, sql, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$1;
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
            }
        });
    }
}
