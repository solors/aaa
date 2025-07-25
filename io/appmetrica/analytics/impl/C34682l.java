package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.l */
/* loaded from: classes9.dex */
public final class C34682l implements InterfaceC34736n {

    /* renamed from: a */
    public final HashSet f94806a = new HashSet();

    public C34682l(@NonNull C34790p c34790p) {
        c34790p.m21181a(this, new EnumC34709m[0]);
    }

    /* renamed from: a */
    public final synchronized void m21466a(@NonNull InterfaceC34655k interfaceC34655k) {
        this.f94806a.add(interfaceC34655k);
    }

    /* renamed from: a */
    public final void m21467a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f94806a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C34914ti) ((InterfaceC34655k) it.next())).m20943a(activity);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34736n
    @MainThread
    /* renamed from: a */
    public final void mo20849a(@NonNull Activity activity, @NonNull EnumC34709m enumC34709m) {
        C34848r4.m21050i().f95251c.m21639a().execute(new RunnableC34628j(this, activity));
    }
}
