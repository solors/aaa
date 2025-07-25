package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.X2 */
/* loaded from: classes9.dex */
public final class C34316X2 implements InterfaceC35045yj {

    /* renamed from: a */
    public final ArrayList f93680a;

    /* renamed from: b */
    public Intent f93681b;

    /* renamed from: c */
    public final Context f93682c;

    /* renamed from: d */
    public final C34032L5 f93683d;

    public C34316X2(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    @Nullable
    /* renamed from: a */
    public final synchronized Intent m22120a(@NonNull Consumer<Intent> consumer) {
        this.f93680a.add(consumer);
        return this.f93681b;
    }

    /* renamed from: b */
    public final void m22119b() {
        this.f93681b = null;
        C34032L5 c34032l5 = this.f93683d;
        Context context = this.f93682c;
        synchronized (c34032l5) {
            if (c34032l5.f93165b) {
                try {
                    context.unregisterReceiver(c34032l5.f93164a);
                    c34032l5.f93165b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final synchronized void onCreate() {
        Intent m22121a = m22121a();
        this.f93681b = m22121a;
        Iterator it = this.f93680a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(m22121a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final synchronized void onDestroy() {
        this.f93681b = null;
        m22119b();
        Iterator it = this.f93680a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C34316X2(Context context, ICommonExecutor iCommonExecutor, int i) {
        this.f93680a = new ArrayList();
        this.f93681b = null;
        this.f93682c = context;
        this.f93683d = AbstractC34008K5.m22497a(new C33783B2(new C34292W2(this), iCommonExecutor));
    }

    /* renamed from: a */
    public final Intent m22121a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        C34032L5 c34032l5 = this.f93683d;
        Context context = this.f93682c;
        synchronized (c34032l5) {
            try {
                intent = context.registerReceiver(c34032l5.f93164a, intentFilter);
                try {
                    c34032l5.f93165b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intent = null;
            }
        }
        return intent;
    }
}
