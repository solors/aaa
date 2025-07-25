package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: QueryInterceptorStatement.kt */
@Metadata
/* loaded from: classes2.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    @NotNull
    private final List<Object> bindArgsCache;
    @NotNull
    private final SupportSQLiteStatement delegate;
    @NotNull
    private final RoomDatabase.QueryCallback queryCallback;
    @NotNull
    private final Executor queryCallbackExecutor;
    @NotNull
    private final String sqlStatement;

    public QueryInterceptorStatement(@NotNull SupportSQLiteStatement delegate, @NotNull String sqlStatement, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    public static final void execute$lambda$0(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    public static final void executeInsert$lambda$2(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    public static final void executeUpdateDelete$lambda$1(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    private final void saveArgsToCache(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.bindArgsCache.size()) {
            int size = (i2 - this.bindArgsCache.size()) + 1;
            for (int i3 = 0; i3 < size; i3++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i2, obj);
    }

    public static final void simpleQueryForLong$lambda$3(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    public static final void simpleQueryForString$lambda$4(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i, value);
        this.delegate.bindBlob(i, value);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
        this.delegate.bindDouble(i, d);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
        this.delegate.bindLong(i, j);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindNull(int i) {
        Object[] array = this.bindArgsCache.toArray(new Object[0]);
        Intrinsics.m17073h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        saveArgsToCache(i, Arrays.copyOf(array, array.length));
        this.delegate.bindNull(i);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i, value);
        this.delegate.bindString(i, value);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteStatement
    public void execute() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.u
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.execute$lambda$0(QueryInterceptorStatement.this);
            }
        });
        this.delegate.execute();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteStatement
    public long executeInsert() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.v
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeInsert$lambda$2(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.t
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.x
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteStatement
    @Nullable
    public String simpleQueryForString() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.w
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForString$lambda$4(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.simpleQueryForString();
    }
}
