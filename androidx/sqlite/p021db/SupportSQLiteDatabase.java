package androidx.sqlite.p021db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SupportSQLiteDatabase.kt */
@Metadata
/* renamed from: androidx.sqlite.db.SupportSQLiteDatabase */
/* loaded from: classes2.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(@NotNull SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener sQLiteTransactionListener);

    @NotNull
    SupportSQLiteStatement compileStatement(@NotNull String str);

    int delete(@NotNull String str, @Nullable String str2, @Nullable Object[] objArr);

    @RequiresApi(api = 16)
    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    default void execPerConnectionSQL(@NotNull String sql, @SuppressLint({"ArrayReturn"}) @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(@NotNull String str) throws SQLException;

    void execSQL(@NotNull String str, @NotNull Object[] objArr) throws SQLException;

    @Nullable
    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    @Nullable
    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(@NotNull String str, int i, @NotNull ContentValues contentValues) throws SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    @RequiresApi(api = 16)
    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i);

    @NotNull
    Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery);

    @RequiresApi(api = 16)
    @NotNull
    Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery, @Nullable CancellationSignal cancellationSignal);

    @NotNull
    Cursor query(@NotNull String str);

    @NotNull
    Cursor query(@NotNull String str, @NotNull Object[] objArr);

    @RequiresApi(api = 16)
    void setForeignKeyConstraintsEnabled(boolean z);

    void setLocale(@NotNull Locale locale);

    void setMaxSqlCacheSize(int i);

    long setMaximumSize(long j);

    void setPageSize(long j);

    void setTransactionSuccessful();

    void setVersion(int i);

    int update(@NotNull String str, int i, @NotNull ContentValues contentValues, @Nullable String str2, @Nullable Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j);
}
