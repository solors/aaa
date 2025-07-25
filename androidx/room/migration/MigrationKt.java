package androidx.room.migration;

import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Migration.kt */
@Metadata
/* loaded from: classes2.dex */
public final class MigrationKt {
    @NotNull
    public static final Migration Migration(int i, int i2, @NotNull Function1<? super SupportSQLiteDatabase, Unit> migrate) {
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        return new MigrationImpl(i, i2, migrate);
    }
}
