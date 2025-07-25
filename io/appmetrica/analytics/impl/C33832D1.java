package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.D1 */
/* loaded from: classes9.dex */
public final class C33832D1 implements InterfaceC34871s1 {

    /* renamed from: a */
    public final ICommonExecutor f92685a;

    /* renamed from: b */
    public final InterfaceC34871s1 f92686b;

    /* renamed from: c */
    public boolean f92687c;

    public C33832D1(@NonNull InterfaceC34871s1 interfaceC34871s1) {
        this(C34693la.m21444h().m21431u().m20772b(), interfaceC34871s1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    /* renamed from: a */
    public final void mo20990a(Intent intent, int i) {
        this.f92685a.execute(new C34949v1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    /* renamed from: b */
    public final void mo20987b(Intent intent) {
        this.f92685a.execute(new C35053z1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    /* renamed from: c */
    public final void mo20986c(Intent intent) {
        this.f92685a.execute(new C35027y1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        this.f92685a.execute(new C34897t1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    public final synchronized void onCreate() {
        this.f92687c = true;
        this.f92685a.execute(new C34923u1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    public final void onDestroy() {
        this.f92685a.removeAll();
        synchronized (this) {
            this.f92687c = false;
        }
        this.f92686b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        this.f92685a.execute(new C33807C1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    public final void reportData(int i, Bundle bundle) {
        this.f92685a.execute(new C33757A1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        this.f92685a.execute(new C33782B1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    /* renamed from: a */
    public final void mo20989a(Intent intent, int i, int i2) {
        this.f92685a.execute(new C34975w1(this, intent, i, i2));
    }

    public C33832D1(IHandlerExecutor iHandlerExecutor, InterfaceC34871s1 interfaceC34871s1) {
        this.f92687c = false;
        this.f92685a = iHandlerExecutor;
        this.f92686b = interfaceC34871s1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    /* renamed from: a */
    public final void mo20991a(Intent intent) {
        this.f92685a.execute(new C35001x1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34871s1
    /* renamed from: a */
    public final void mo20988a(@NonNull InterfaceC34845r1 interfaceC34845r1) {
        this.f92686b.mo20988a(interfaceC34845r1);
    }
}
