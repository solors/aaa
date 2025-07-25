package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.ads.redexgen.X.IJ */
/* loaded from: assets/audience_network.dex */
public class ThreadFactoryC11952IJ implements ThreadFactory {
    public final /* synthetic */ String A00;

    public ThreadFactoryC11952IJ(String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.A00);
    }
}
