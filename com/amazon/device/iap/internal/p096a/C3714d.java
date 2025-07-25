package com.amazon.device.iap.internal.p096a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.internal.RequestHandler;
import com.amazon.device.iap.internal.p096a.p097a.GetProductDataRequest;
import com.amazon.device.iap.internal.p096a.p098b.GetPurchaseUpdatesRequest;
import com.amazon.device.iap.internal.p096a.p099c.GetUserDataRequest;
import com.amazon.device.iap.internal.p096a.p100d.NotifyFulfillmentRequest;
import com.amazon.device.iap.internal.p096a.p101e.PurchaseRequest;
import com.amazon.device.iap.internal.p096a.p102f.PurchaseResponseRequest;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* compiled from: KiwiRequestHandler.java */
/* renamed from: com.amazon.device.iap.internal.a.d */
/* loaded from: classes2.dex */
public final class C3714d implements RequestHandler {

    /* renamed from: a */
    private static final String f3180a = "d";

    /* renamed from: b */
    private static final String f3181b = "response_type";

    /* renamed from: c */
    private static final String f3182c = "requestId";

    /* renamed from: d */
    private static final String f3183d = "purchase_response";

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102384a(RequestId requestId) {
        C3722b.m102376a(f3180a, "sendGetUserData");
        new GetUserDataRequest(requestId).m102457e();
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102383a(RequestId requestId, String str) {
        C3722b.m102376a(f3180a, "sendPurchaseRequest");
        new PurchaseRequest(requestId, str).m102457e();
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102381a(RequestId requestId, Set<String> set) {
        C3722b.m102376a(f3180a, "sendGetProductDataRequest");
        new GetProductDataRequest(requestId, set).m102457e();
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102380a(RequestId requestId, boolean z) {
        C3722b.m102376a(f3180a, "sendGetPurchaseUpdates");
        new GetPurchaseUpdatesRequest(requestId, z).m102457e();
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102382a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        C3722b.m102376a(f3180a, "sendNotifyFulfillment");
        new NotifyFulfillmentRequest(requestId, str, fulfillmentResult).m102457e();
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102385a(Context context, Intent intent) {
        String str = f3180a;
        C3722b.m102376a(str, "handleResponse");
        String stringExtra = intent.getStringExtra("response_type");
        if (stringExtra == null) {
            C3722b.m102376a(str, "Invalid response type: null");
            return;
        }
        C3722b.m102376a(str, "Found response type: " + stringExtra);
        if (f3183d.equals(stringExtra)) {
            new PurchaseResponseRequest(RequestId.fromString(intent.getStringExtra("requestId"))).m102457e();
        }
    }
}
