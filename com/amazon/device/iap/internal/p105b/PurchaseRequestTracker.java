package com.amazon.device.iap.internal.p105b;

import com.amazon.p047a.p048a.p071o.Validator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.amazon.device.iap.internal.b.e */
/* loaded from: classes2.dex */
public class PurchaseRequestTracker {

    /* renamed from: b */
    private static final PurchaseRequestTracker f3233b = new PurchaseRequestTracker();

    /* renamed from: a */
    private final Set<String> f3234a = new ConcurrentSkipListSet();

    /* renamed from: a */
    public boolean m102421a(String str) {
        if (Validator.m102806a(str)) {
            return false;
        }
        return this.f3234a.remove(str);
    }

    /* renamed from: b */
    public void m102420b(String str) {
        if (!Validator.m102806a(str)) {
            this.f3234a.add(str);
        }
    }

    /* renamed from: a */
    public static PurchaseRequestTracker m102422a() {
        return f3233b;
    }
}
