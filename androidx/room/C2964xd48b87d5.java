package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1 */
/* loaded from: classes2.dex */
final class C2964xd48b87d5 extends Lambda implements Function1<SupportSQLiteDatabase, Long> {
    final /* synthetic */ long $numBytes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2964xd48b87d5(long j) {
        super(1);
        this.$numBytes = j;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Long invoke(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return Long.valueOf(db.setMaximumSize(this.$numBytes));
    }
}
