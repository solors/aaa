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
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1 */
/* loaded from: classes2.dex */
final class C2975xa8feac86 extends Lambda implements Function1<SupportSQLiteStatement, String> {
    public static final C2975xa8feac86 INSTANCE = new C2975xa8feac86();

    C2975xa8feac86() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull SupportSQLiteStatement obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return obj.simpleQueryForString();
    }
}
