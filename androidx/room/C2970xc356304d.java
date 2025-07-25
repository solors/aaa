package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1 */
/* loaded from: classes2.dex */
final class C2970xc356304d extends Lambda implements Function1<SupportSQLiteStatement, Object> {
    public static final C2970xc356304d INSTANCE = new C2970xc356304d();

    C2970xc356304d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull SupportSQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        statement.execute();
        return null;
    }
}
