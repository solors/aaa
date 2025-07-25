package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Functions;

/* renamed from: io.appmetrica.analytics.billingv6.impl.k */
/* loaded from: classes9.dex */
public final class C33700k implements ProductDetailsResponseListener {

    /* renamed from: a */
    public final String f92298a;

    /* renamed from: b */
    public final BillingClient f92299b;

    /* renamed from: c */
    public final UtilsProvider f92300c;

    /* renamed from: d */
    public final Functions f92301d;

    /* renamed from: e */
    public final List f92302e;

    /* renamed from: f */
    public final C33696g f92303f;

    public C33700k(String str, BillingClient billingClient, UtilsProvider utilsProvider, C33702m c33702m, List list, C33696g c33696g) {
        this.f92298a = str;
        this.f92299b = billingClient;
        this.f92300c = utilsProvider;
        this.f92301d = c33702m;
        this.f92302e = list;
        this.f92303f = c33696g;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f92300c.getWorkerExecutor().execute(new C33697h(this, billingResult, list));
    }
}
