package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.p */
/* loaded from: classes9.dex */
public final class C34790p extends AbstractC33788B7 {

    /* renamed from: a */
    public Application f95142a;

    /* renamed from: b */
    public volatile EnumC34763o f95143b = EnumC34763o.f95071d;

    /* renamed from: c */
    public final C34747na f95144c = new C34747na(true);

    @AnyThread
    /* renamed from: a */
    public final synchronized void m21182a(@NonNull Context context) {
        if (this.f95142a == null) {
            try {
                this.f95142a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        m21180b();
    }

    /* renamed from: b */
    public final synchronized void m21180b() {
        EnumC34763o enumC34763o = this.f95143b;
        EnumC34763o enumC34763o2 = EnumC34763o.f95069b;
        if (enumC34763o != enumC34763o2 && !this.f95144c.f94995a.isEmpty()) {
            if (this.f95142a == null) {
                this.f95143b = EnumC34763o.f95070c;
                return;
            }
            this.f95143b = enumC34763o2;
            this.f95142a.registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: c */
    public final synchronized void m21178c() {
        if (this.f95143b == EnumC34763o.f95069b && this.f95144c.f94995a.isEmpty()) {
            this.f95143b = EnumC34763o.f95071d;
            Application application = this.f95142a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        m21184a(activity, EnumC34709m.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        m21184a(activity, EnumC34709m.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(@NonNull Activity activity) {
        m21184a(activity, EnumC34709m.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(@NonNull Activity activity) {
        m21184a(activity, EnumC34709m.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        m21184a(activity, EnumC34709m.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        m21184a(activity, EnumC34709m.STOPPED);
    }

    @AnyThread
    /* renamed from: a */
    public final synchronized void m21183a(@NonNull Application application) {
        if (this.f95142a == null) {
            this.f95142a = application;
        }
        m21180b();
    }

    @NonNull
    @AnyThread
    /* renamed from: a */
    public final EnumC34763o m21185a() {
        return this.f95143b;
    }

    /* renamed from: a */
    public final void m21184a(Activity activity, EnumC34709m enumC34709m) {
        Collection<InterfaceC34736n> collection;
        synchronized (this) {
            collection = (Collection) this.f95144c.f94995a.get(enumC34709m);
        }
        if (collection != null) {
            for (InterfaceC34736n interfaceC34736n : collection) {
                interfaceC34736n.mo20849a(activity, enumC34709m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
        if (r8.length == 0) goto L3;
     */
    @androidx.annotation.AnyThread
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m21179b(@androidx.annotation.NonNull io.appmetrica.analytics.impl.InterfaceC34736n r7, io.appmetrica.analytics.impl.EnumC34709m... r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L6
            int r0 = r8.length     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto La
        L6:
            io.appmetrica.analytics.impl.m[] r8 = io.appmetrica.analytics.impl.EnumC34709m.values()     // Catch: java.lang.Throwable -> L3e
        La:
            int r0 = r8.length     // Catch: java.lang.Throwable -> L3e
            r1 = 0
        Lc:
            if (r1 >= r0) goto L39
            r2 = r8[r1]     // Catch: java.lang.Throwable -> L3e
            io.appmetrica.analytics.impl.na r3 = r6.f95144c     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r4 = r3.f94995a     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L36
            boolean r5 = r4.remove(r7)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L36
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L31
            boolean r5 = r3.f94996b     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L31
            java.util.HashMap r3 = r3.f94995a     // Catch: java.lang.Throwable -> L3e
            r3.remove(r2)     // Catch: java.lang.Throwable -> L3e
        L31:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3e
        L36:
            int r1 = r1 + 1
            goto Lc
        L39:
            r6.m21178c()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return
        L3e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34790p.m21179b(io.appmetrica.analytics.impl.n, io.appmetrica.analytics.impl.m[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
        if (r6.length == 0) goto L3;
     */
    @androidx.annotation.AnyThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m21181a(@androidx.annotation.NonNull io.appmetrica.analytics.impl.InterfaceC34736n r5, @androidx.annotation.Nullable io.appmetrica.analytics.impl.EnumC34709m... r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L6
            int r0 = r6.length     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto La
        L6:
            io.appmetrica.analytics.impl.m[] r6 = io.appmetrica.analytics.impl.EnumC34709m.values()     // Catch: java.lang.Throwable -> L1d
        La:
            int r0 = r6.length     // Catch: java.lang.Throwable -> L1d
            r1 = 0
        Lc:
            if (r1 >= r0) goto L18
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L1d
            io.appmetrica.analytics.impl.na r3 = r4.f95144c     // Catch: java.lang.Throwable -> L1d
            r3.m21305a(r2, r5)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            goto Lc
        L18:
            r4.m21180b()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return
        L1d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34790p.m21181a(io.appmetrica.analytics.impl.n, io.appmetrica.analytics.impl.m[]):void");
    }
}
