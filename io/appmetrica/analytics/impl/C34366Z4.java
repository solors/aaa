package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Z4 */
/* loaded from: classes9.dex */
public final class C34366Z4 extends DatabaseScript {

    /* renamed from: a */
    public final C34342Y4 f93862a = new C34342Y4();

    /* renamed from: b */
    public final C34318X4 f93863b = new C34318X4();

    @Override // io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.f93862a.runScript(sQLiteDatabase);
        this.f93863b.runScript(sQLiteDatabase);
    }
}
