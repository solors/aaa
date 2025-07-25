package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1 */
/* loaded from: classes2.dex */
final class C2946xa7295701 extends Lambda implements Function1<SupportSQLiteDatabase, Integer> {
    final /* synthetic */ String $table;
    final /* synthetic */ Object[] $whereArgs;
    final /* synthetic */ String $whereClause;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2946xa7295701(String str, String str2, Object[] objArr) {
        super(1);
        this.$table = str;
        this.$whereClause = str2;
        this.$whereArgs = objArr;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return Integer.valueOf(db.delete(this.$table, this.$whereClause, this.$whereArgs));
    }
}
