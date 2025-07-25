package com.fyber.inneractive.sdk.network;

/* renamed from: com.fyber.inneractive.sdk.network.T */
/* loaded from: classes4.dex */
public final class RunnableC14685T implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f27820a;

    /* renamed from: b */
    public final /* synthetic */ Exception f27821b;

    /* renamed from: c */
    public final /* synthetic */ boolean f27822c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC14686U f27823d;

    public RunnableC14685T(AbstractC14686U abstractC14686U, Object obj, Exception exc, boolean z) {
        this.f27823d = abstractC14686U;
        this.f27820a = obj;
        this.f27821b = exc;
        this.f27822c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27823d.f27825b.mo76358a(this.f27820a, this.f27821b, this.f27822c);
    }
}
