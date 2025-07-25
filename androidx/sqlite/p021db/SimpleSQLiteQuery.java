package androidx.sqlite.p021db;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SimpleSQLiteQuery.kt */
@Metadata
/* renamed from: androidx.sqlite.db.SimpleSQLiteQuery */
/* loaded from: classes2.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final Object[] bindArgs;
    @NotNull
    private final String query;

    public SimpleSQLiteQuery(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @SuppressLint({"SyntheticAccessor"})
    public static final void bind(@NotNull SupportSQLiteProgram supportSQLiteProgram, @Nullable Object[] objArr) {
        Companion.bind(supportSQLiteProgram, objArr);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public void bindTo(@NotNull SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Companion.bind(statement, this.bindArgs);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public int getArgCount() {
        Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    @NotNull
    public String getSql() {
        return this.query;
    }

    /* compiled from: SimpleSQLiteQuery.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.SimpleSQLiteQuery$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void bind(@NotNull SupportSQLiteProgram statement, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                bind(statement, i, obj);
            }
        }

        private final void bind(SupportSQLiteProgram supportSQLiteProgram, int i, Object obj) {
            if (obj == null) {
                supportSQLiteProgram.bindNull(i);
            } else if (obj instanceof byte[]) {
                supportSQLiteProgram.bindBlob(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                supportSQLiteProgram.bindDouble(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                supportSQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                supportSQLiteProgram.bindLong(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                supportSQLiteProgram.bindString(i, (String) obj);
            } else if (obj instanceof Boolean) {
                supportSQLiteProgram.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(@NotNull String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
