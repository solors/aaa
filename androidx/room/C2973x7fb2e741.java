package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1 */
/* loaded from: classes2.dex */
final class C2973x7fb2e741 extends Lambda implements Function1<SupportSQLiteStatement, Integer> {
    public static final C2973x7fb2e741 INSTANCE = new C2973x7fb2e741();

    C2973x7fb2e741() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull SupportSQLiteStatement obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Integer.valueOf(obj.executeUpdateDelete());
    }
}
