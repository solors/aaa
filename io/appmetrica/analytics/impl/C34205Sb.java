package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.Sb */
/* loaded from: classes9.dex */
public final class C34205Sb implements InterfaceC35058z6 {

    /* renamed from: a */
    public final Context f93485a;

    /* renamed from: b */
    public final String f93486b;

    /* renamed from: c */
    public final C34651jm f93487c;

    /* renamed from: d */
    public final C34299W9 f93488d;

    /* renamed from: e */
    public C34368Z6 f93489e;

    public C34205Sb(Context context, String str, @NonNull C34651jm c34651jm) {
        this(context, str, new C34299W9(str), c34651jm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35058z6
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public final synchronized SQLiteDatabase mo20727a() {
        C34368Z6 c34368z6;
        try {
            this.f93488d.m22133a();
            c34368z6 = new C34368Z6(this.f93485a, this.f93486b, this.f93487c, PublicLogger.getAnonymousInstance());
            this.f93489e = c34368z6;
        } catch (Throwable unused) {
            return null;
        }
        return c34368z6.getWritableDatabase();
    }

    @VisibleForTesting
    public C34205Sb(@NonNull Context context, @NonNull String str, @NonNull C34299W9 c34299w9, @NonNull C34651jm c34651jm) {
        this.f93485a = context;
        this.f93486b = str;
        this.f93488d = c34299w9;
        this.f93487c = c34651jm;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35058z6
    @WorkerThread
    /* renamed from: a */
    public final synchronized void mo20726a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC34679kn.m21473a((Closeable) this.f93489e);
        this.f93488d.m22131b();
        this.f93489e = null;
    }
}
