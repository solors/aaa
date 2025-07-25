package com.facebook.ads.redexgen.p370X;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.B1 */
/* loaded from: assets/audience_network.dex */
public class C11527B1 extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C12978Z3 A01;

    public C11527B1(C12978Z3 c12978z3, AudioTrack audioTrack) {
        this.A01 = c12978z3;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
