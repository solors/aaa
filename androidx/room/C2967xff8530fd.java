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
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2 */
/* loaded from: classes2.dex */
final class C2967xff8530fd extends Lambda implements Function1<SupportSQLiteDatabase, Object> {
    final /* synthetic */ int $version;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967xff8530fd(int i) {
        super(1);
        this.$version = i;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.setVersion(this.$version);
        return null;
    }
}
