package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1;
import java.util.LinkedHashSet;

/* renamed from: io.appmetrica.analytics.billingv6.impl.g */
/* loaded from: classes9.dex */
public final class C33696g {

    /* renamed from: a */
    public final BillingClient f92288a;

    /* renamed from: b */
    public final UtilsProvider f92289b;

    /* renamed from: c */
    public final LinkedHashSet f92290c = new LinkedHashSet();

    public C33696g(BillingClient billingClient, BillingLibraryMonitor$updateBilling$1$runSafety$1 billingLibraryMonitor$updateBilling$1$runSafety$1) {
        this.f92288a = billingClient;
        this.f92289b = billingLibraryMonitor$updateBilling$1$runSafety$1;
    }

    /* renamed from: a */
    public final void m22815a(Object obj) {
        this.f92290c.remove(obj);
        if (this.f92290c.size() == 0) {
            this.f92289b.getUiExecutor().execute(new C33695f(this));
        }
    }
}
