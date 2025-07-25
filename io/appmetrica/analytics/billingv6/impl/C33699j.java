package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.j */
/* loaded from: classes9.dex */
public final class C33699j extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C33700k f92296a;

    /* renamed from: b */
    public final /* synthetic */ C33707r f92297b;

    public C33699j(C33700k c33700k, C33707r c33707r) {
        this.f92296a = c33700k;
        this.f92297b = c33707r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f92296a.f92299b.isReady()) {
            this.f92296a.f92299b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(this.f92296a.f92298a).build(), this.f92297b);
        } else {
            this.f92296a.f92300c.getWorkerExecutor().execute(new C33698i(this.f92296a, this.f92297b));
        }
    }
}
