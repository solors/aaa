package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1 */
/* loaded from: classes2.dex */
final class C2956xfb73a9ca extends Lambda implements Function1<SupportSQLiteDatabase, Boolean> {
    final /* synthetic */ int $newVersion;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2956xfb73a9ca(int i) {
        super(1);
        this.$newVersion = i;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return Boolean.valueOf(db.needUpgrade(this.$newVersion));
    }
}
