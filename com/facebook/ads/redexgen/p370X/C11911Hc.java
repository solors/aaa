package com.facebook.ads.redexgen.p370X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Hc */
/* loaded from: assets/audience_network.dex */
public class C11911Hc extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C12839Wl A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11911Hc(C12839Wl c12839Wl, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c12839Wl;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A04();
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
