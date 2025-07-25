package androidx.sqlite.p021db;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: SupportSQLiteStatement.kt */
@Metadata
/* renamed from: androidx.sqlite.db.SupportSQLiteStatement */
/* loaded from: classes2.dex */
public interface SupportSQLiteStatement extends SupportSQLiteProgram {
    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    @Nullable
    String simpleQueryForString();
}
