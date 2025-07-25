package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 */
/* loaded from: classes2.dex */
final class C2953x928ac242 extends Lambda implements Function1<SupportSQLiteDatabase, Boolean> {
    public static final C2953x928ac242 INSTANCE = new C2953x928ac242();

    C2953x928ac242() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull SupportSQLiteDatabase obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Boolean.valueOf(obj.isReadOnly());
    }
}
