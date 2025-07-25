package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.c2 */
/* loaded from: classes9.dex */
public final class C34442c2 implements AppSetIdProvider {

    /* renamed from: a */
    public final Context f94051a;

    /* renamed from: b */
    public final IAppSetIdRetriever f94052b;

    /* renamed from: c */
    public volatile AppSetId f94053c;

    /* renamed from: d */
    public CountDownLatch f94054d;

    /* renamed from: e */
    public final long f94055e;

    /* renamed from: f */
    public final C34415b2 f94056f;

    @VisibleForTesting
    public C34442c2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.f94051a = context;
        this.f94052b = iAppSetIdRetriever;
        this.f94054d = new CountDownLatch(1);
        this.f94055e = 20L;
        this.f94056f = new C34415b2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @WorkerThread
    @NotNull
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f94053c == null) {
            try {
                this.f94054d = new CountDownLatch(1);
                this.f94052b.retrieveAppSetId(this.f94051a, this.f94056f);
                this.f94054d.await(this.f94055e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f94053c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f94053c = appSetId;
        }
        return appSetId;
    }

    public C34442c2(@NotNull Context context) {
        this(context, AbstractC34469d2.m21848a());
    }
}
