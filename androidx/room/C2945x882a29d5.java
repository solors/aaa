package androidx.room;

import android.util.Pair;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 */
/* loaded from: classes2.dex */
final class C2945x882a29d5 extends Lambda implements Function1<SupportSQLiteDatabase, List<? extends Pair<String, String>>> {
    public static final C2945x882a29d5 INSTANCE = new C2945x882a29d5();

    C2945x882a29d5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final List<Pair<String, String>> invoke(@NotNull SupportSQLiteDatabase obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return obj.getAttachedDbs();
    }
}
