package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.e4 */
/* loaded from: classes9.dex */
public final class C34498e4 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("preferences", "key = ?", new String[]{"NEXT_STARTUP_TIME"});
    }
}
