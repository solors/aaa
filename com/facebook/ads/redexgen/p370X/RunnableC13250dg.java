package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dg */
/* loaded from: assets/audience_network.dex */
public class RunnableC13250dg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C13249df A01;
    public final /* synthetic */ Exception A02;

    public RunnableC13250dg(C13249df c13249df, int i, Exception exc) {
        this.A01 = c13249df;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC12608T0 interfaceC12608T0;
        Handler handler;
        Runnable runnable;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            try {
                z = this.A01.A01;
                if (z) {
                    C13249df c13249df = this.A01;
                    interfaceC12608T0 = this.A01.A05;
                    c13249df.A04(interfaceC12608T0.AAy());
                    handler = this.A01.A04;
                    runnable = this.A01.A0A;
                    handler.postDelayed(runnable, this.A00);
                }
            } catch (Exception e) {
                StackTraceElement[] innerTrace = e.getStackTrace();
                StackTraceElement[] result = this.A02.getStackTrace();
                StackTraceElement[] callerTrace = (StackTraceElement[]) Arrays.copyOf(innerTrace, innerTrace.length + result.length);
                System.arraycopy(result, 0, callerTrace, innerTrace.length, result.length);
                e.setStackTrace(callerTrace);
                throw e;
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
