package androidx.core.database.sqlite;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.database.sqlite.SQLiteDatabaseKt */
/* loaded from: classes.dex */
public final class SQLiteDatabase {
    public static final <T> T transaction(@NotNull android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z, @NotNull Function1<? super android.database.sqlite.SQLiteDatabase, ? extends T> body) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            InlineMarker.m17017b(1);
            sQLiteDatabase.endTransaction();
            InlineMarker.m17018a(1);
        }
    }

    public static /* synthetic */ Object transaction$default(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            InlineMarker.m17017b(1);
            sQLiteDatabase.endTransaction();
            InlineMarker.m17018a(1);
        }
    }
}
