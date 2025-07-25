package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1 */
/* loaded from: classes2.dex */
final class C2971xe79bbce6 extends Lambda implements Function1<SupportSQLiteStatement, Long> {
    public static final C2971xe79bbce6 INSTANCE = new C2971xe79bbce6();

    C2971xe79bbce6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Long invoke(@NotNull SupportSQLiteStatement obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Long.valueOf(obj.executeInsert());
    }
}
