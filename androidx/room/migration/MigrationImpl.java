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
final class MigrationImpl extends Migration {
    @NotNull
    private final Function1<SupportSQLiteDatabase, Unit> migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i, int i2, @NotNull Function1<? super SupportSQLiteDatabase, Unit> migrateCallback) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(migrateCallback, "migrateCallback");
        this.migrateCallback = migrateCallback;
    }

    @NotNull
    public final Function1<SupportSQLiteDatabase, Unit> getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.migrateCallback.invoke(database);
    }
}
