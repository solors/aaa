package com.five_corp.p372ad.internal.system;

import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: com.five_corp.ad.internal.system.a */
/* loaded from: classes4.dex */
public final class RunnableC14094a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14095b f26301a;

    public RunnableC14094a(C14095b c14095b) {
        this.f26301a = c14095b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this.f26301a);
    }
}
