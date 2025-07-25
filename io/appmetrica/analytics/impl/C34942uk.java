package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.uk */
/* loaded from: classes9.dex */
public final class C34942uk implements InterfaceC35058z6 {

    /* renamed from: a */
    public final C34368Z6 f95483a;

    public C34942uk(C34368Z6 c34368z6) {
        this.f95483a = c34368z6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35058z6
    /* renamed from: a */
    public final void mo20726a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35058z6
    @Nullable
    /* renamed from: a */
    public final SQLiteDatabase mo20727a() {
        try {
            return this.f95483a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
