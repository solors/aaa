package androidx.sqlite.p021db;

import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SupportSQLiteProgram.kt */
@Metadata
/* renamed from: androidx.sqlite.db.SupportSQLiteProgram */
/* loaded from: classes2.dex */
public interface SupportSQLiteProgram extends Closeable {
    void bindBlob(int i, @NotNull byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, @NotNull String str);

    void clearBindings();
}
