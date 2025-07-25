package androidx.room;

import android.content.ContentValues;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1 */
/* loaded from: classes2.dex */
final class C2950x9698888f extends Lambda implements Function1<SupportSQLiteDatabase, Long> {
    final /* synthetic */ int $conflictAlgorithm;
    final /* synthetic */ String $table;
    final /* synthetic */ ContentValues $values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950x9698888f(String str, int i, ContentValues contentValues) {
        super(1);
        this.$table = str;
        this.$conflictAlgorithm = i;
        this.$values = contentValues;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Long invoke(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return Long.valueOf(db.insert(this.$table, this.$conflictAlgorithm, this.$values));
    }
}
