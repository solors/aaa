package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billingv6.impl.p */
/* loaded from: classes9.dex */
public final class C33705p implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    public final BillingConfig f92315a;

    /* renamed from: b */
    public final BillingClient f92316b;

    /* renamed from: c */
    public final UtilsProvider f92317c;

    /* renamed from: d */
    public final String f92318d;

    /* renamed from: e */
    public final C33696g f92319e;

    public C33705p(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, C33696g c33696g) {
        this.f92315a = billingConfig;
        this.f92316b = billingClient;
        this.f92317c = utilsProvider;
        this.f92318d = str;
        this.f92319e = c33696g;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f92317c.getWorkerExecutor().execute(new C33701l(this, billingResult, list));
    }
}
