package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1;

/* renamed from: io.appmetrica.analytics.billingv6.impl.d */
/* loaded from: classes9.dex */
public final class C33693d implements BillingClientStateListener {

    /* renamed from: a */
    public final BillingConfig f92280a;

    /* renamed from: b */
    public final BillingClient f92281b;

    /* renamed from: c */
    public final UtilsProvider f92282c;

    /* renamed from: d */
    public final C33696g f92283d;

    public C33693d(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1$runSafety$1 billingLibraryMonitor$updateBilling$1$runSafety$1, C33696g c33696g) {
        this.f92280a = billingConfig;
        this.f92281b = billingClient;
        this.f92282c = billingLibraryMonitor$updateBilling$1$runSafety$1;
        this.f92283d = c33696g;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f92282c.getWorkerExecutor().execute(new C33690a(this, billingResult));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }
}
