package androidx.sqlite.p021db;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SupportSQLiteQuery.kt */
@Metadata
/* renamed from: androidx.sqlite.db.SupportSQLiteQuery */
/* loaded from: classes2.dex */
public interface SupportSQLiteQuery {
    void bindTo(@NotNull SupportSQLiteProgram supportSQLiteProgram);

    int getArgCount();

    @NotNull
    String getSql();
}
