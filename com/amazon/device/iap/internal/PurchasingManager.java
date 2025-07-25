package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.p047a.AppstoreSDK;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.amazon.device.iap.internal.d */
/* loaded from: classes2.dex */
public class PurchasingManager {

    /* renamed from: a */
    private static String f3317a = "d";

    /* renamed from: b */
    private static String f3318b = "sku";

    /* renamed from: c */
    private static PurchasingManager f3319c = new PurchasingManager();

    /* renamed from: d */
    private RequestHandler f3320d;

    /* renamed from: e */
    private Context f3321e;

    /* renamed from: f */
    private PurchasingListener f3322f;

    /* renamed from: g */
    private boolean f3323g = false;

    private PurchasingManager() {
    }

    /* renamed from: g */
    public static PurchasingManager m102387g() {
        return f3319c;
    }

    /* renamed from: h */
    private void m102386h() {
        if (this.f3322f != null) {
            return;
        }
        throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
    }

    /* renamed from: a */
    public PurchasingListener m102399a() {
        return this.f3322f;
    }

    /* renamed from: b */
    public Context m102392b() {
        return this.f3321e;
    }

    /* renamed from: c */
    public void m102391c() {
        this.f3323g = true;
    }

    /* renamed from: d */
    public boolean m102390d() {
        return this.f3323g;
    }

    /* renamed from: e */
    public boolean m102389e() {
        m102386h();
        return AppstoreSDK.m103238a((Application) this.f3321e.getApplicationContext());
    }

    /* renamed from: f */
    public RequestId m102388f() {
        m102386h();
        RequestId requestId = new RequestId();
        this.f3320d.mo102384a(requestId);
        return requestId;
    }

    /* renamed from: a */
    public void m102397a(Context context, PurchasingListener purchasingListener) {
        String str = f3317a;
        C3722b.m102376a(str, "PurchasingListener registered: " + purchasingListener);
        String str2 = f3317a;
        C3722b.m102376a(str2, "PurchasingListener Context: " + context);
        if (purchasingListener != null && context != null) {
            this.f3321e = context.getApplicationContext();
            RequestHandler m102443a = ImplementationFactory.m102444a().m102443a(this.f3321e);
            this.f3320d = m102443a;
            if (m102443a == null) {
                C3722b.m102376a(f3317a, "requestHandler is null");
            }
            this.f3322f = purchasingListener;
            return;
        }
        throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
    }

    /* renamed from: a */
    public RequestId m102396a(String str) {
        Validator.m102807a((Object) str, f3318b);
        m102386h();
        RequestId requestId = new RequestId();
        this.f3320d.mo102383a(requestId, str);
        return requestId;
    }

    /* renamed from: a */
    public RequestId m102394a(Set<String> set) {
        Validator.m102807a((Object) set, KiwiConstants.f2683O);
        Validator.m102804a((Collection<? extends Object>) set, KiwiConstants.f2683O);
        for (String str : set) {
            if (str.trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            m102386h();
            RequestId requestId = new RequestId();
            this.f3320d.mo102381a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    /* renamed from: a */
    public RequestId m102393a(boolean z) {
        m102386h();
        RequestId requestId = new RequestId();
        this.f3320d.mo102380a(requestId, z);
        return requestId;
    }

    /* renamed from: a */
    public void m102395a(String str, FulfillmentResult fulfillmentResult) {
        if (!Validator.m102806a(str)) {
            Validator.m102807a(fulfillmentResult, "fulfillmentResult");
            m102386h();
            this.f3320d.mo102382a(new RequestId(), str, fulfillmentResult);
            return;
        }
        throw new IllegalArgumentException("Empty receiptId is not allowed");
    }

    /* renamed from: a */
    public void m102398a(Context context, Intent intent) {
        try {
            this.f3320d.mo102385a(context, intent);
        } catch (Exception e) {
            String str = f3317a;
            C3722b.m102374b(str, "Error in onReceive: " + e);
        }
    }
}
