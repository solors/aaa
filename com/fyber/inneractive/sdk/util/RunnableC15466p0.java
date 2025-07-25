package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.p0 */
/* loaded from: classes4.dex */
public final class RunnableC15466p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f30613a;

    /* renamed from: b */
    public final /* synthetic */ C15472s0 f30614b;

    public RunnableC15466p0(C15472s0 c15472s0, String str) {
        this.f30614b = c15472s0;
        this.f30613a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30614b.f30618b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", this.f30613a).apply();
    }
}
