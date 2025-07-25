package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 */
/* loaded from: classes2.dex */
final class C2959x4ec8cd3b extends Lambda implements Function1<SupportSQLiteDatabase, String> {
    public static final C2959x4ec8cd3b INSTANCE = new C2959x4ec8cd3b();

    C2959x4ec8cd3b() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull SupportSQLiteDatabase obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return obj.getPath();
    }
}
