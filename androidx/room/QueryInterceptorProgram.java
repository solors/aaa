package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: QueryInterceptorProgram.kt */
@Metadata
/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    @NotNull
    private final List<Object> bindArgsCache = new ArrayList();

    private final void saveArgsToCache(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i2) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i2) {
                    break;
                }
                size++;
            }
        }
        this.bindArgsCache.set(i2, obj);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i, value);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindNull(int i) {
        saveArgsToCache(i, null);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i, value);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    @NotNull
    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
