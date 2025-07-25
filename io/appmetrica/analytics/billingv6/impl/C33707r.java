package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Functions;

/* renamed from: io.appmetrica.analytics.billingv6.impl.r */
/* loaded from: classes9.dex */
public final class C33707r implements PurchasesResponseListener {

    /* renamed from: a */
    public final UtilsProvider f92323a;

    /* renamed from: b */
    public final Functions f92324b;

    /* renamed from: c */
    public final List f92325c;

    /* renamed from: d */
    public final List f92326d;

    /* renamed from: e */
    public final C33696g f92327e;

    public C33707r(UtilsProvider utilsProvider, Functions functions, List list, List list2, C33696g c33696g) {
        this.f92323a = utilsProvider;
        this.f92324b = functions;
        this.f92325c = list;
        this.f92326d = list2;
        this.f92327e = c33696g;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f92323a.getWorkerExecutor().execute(new C33706q(this, billingResult, list));
    }
}
