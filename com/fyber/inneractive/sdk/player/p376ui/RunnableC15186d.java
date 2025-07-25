package com.fyber.inneractive.sdk.player.p376ui;

/* renamed from: com.fyber.inneractive.sdk.player.ui.d */
/* loaded from: classes4.dex */
public final class RunnableC15186d implements Runnable {

    /* renamed from: a */
    public final boolean f30041a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC15187e f30042b;

    public RunnableC15186d(AbstractC15187e abstractC15187e, boolean z) {
        this.f30042b = abstractC15187e;
        this.f30041a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30041a == this.f30042b.hasWindowFocus()) {
            this.f30042b.m77090d();
        }
    }
}
