package com.amazon.p047a.p048a.p066n.p067a.p068a;

import com.amazon.p047a.p048a.p066n.p067a.DecisionExpirationReason;

/* renamed from: com.amazon.a.a.n.a.a.e */
/* loaded from: classes2.dex */
public class DecisionExpiredException extends Exception {

    /* renamed from: a */
    private static final long f2544a = 1;

    /* renamed from: b */
    private final DecisionExpirationReason f2545b;

    public DecisionExpiredException(DecisionExpirationReason decisionExpirationReason) {
        this.f2545b = decisionExpirationReason;
    }

    /* renamed from: a */
    public DecisionExpirationReason m102984a() {
        return this.f2545b;
    }
}
