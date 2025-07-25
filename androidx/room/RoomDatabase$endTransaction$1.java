package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RoomDatabase.kt */
@Metadata
/* loaded from: classes2.dex */
public final class RoomDatabase$endTransaction$1 extends Lambda implements Function1<SupportSQLiteDatabase, Object> {
    final /* synthetic */ RoomDatabase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$endTransaction$1(RoomDatabase roomDatabase) {
        super(1);
        this.this$0 = roomDatabase;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull SupportSQLiteDatabase it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.internalEndTransaction();
        return null;
    }
}
