package androidx.sqlite.p021db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.p021db.SupportSQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FrameworkSQLiteProgram.kt */
@Metadata
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteProgram */
/* loaded from: classes2.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    @NotNull
    private final SQLiteProgram delegate;

    public FrameworkSQLiteProgram(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindBlob(i, value);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        this.delegate.bindDouble(i, d);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        this.delegate.bindLong(i, j);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindNull(int i) {
        this.delegate.bindNull(i);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindString(i, value);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void clearBindings() {
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }
}
