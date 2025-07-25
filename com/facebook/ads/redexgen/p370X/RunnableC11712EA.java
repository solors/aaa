package com.facebook.ads.redexgen.p370X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.EA */
/* loaded from: assets/audience_network.dex */
public class RunnableC11712EA implements Runnable {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C11721EL A01;

    public RunnableC11712EA(C11721EL c11721el, ConditionVariable conditionVariable) {
        this.A01 = c11721el;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
