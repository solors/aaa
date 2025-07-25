package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1 */
/* loaded from: classes2.dex */
final class C2954x1aa74a04 extends Lambda implements Function1<SupportSQLiteDatabase, Boolean> {
    public static final C2954x1aa74a04 INSTANCE = new C2954x1aa74a04();

    C2954x1aa74a04() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return Boolean.valueOf(db.isWriteAheadLoggingEnabled());
    }
}
