package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.AbstractC15424O;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.O */
/* loaded from: classes4.dex */
public final class RunnableC15502O implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f30678a;

    /* renamed from: b */
    public final /* synthetic */ C15509W f30679b;

    public RunnableC15502O(C15509W c15509w, String str) {
        this.f30679b = c15509w;
        this.f30678a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m76529a("injecting JS: %s", this.f30678a);
        try {
            String str = this.f30678a;
            if (str != null) {
                AbstractC15424O.m76518a(this.f30679b.f30692a, str);
            }
        } catch (Exception unused) {
            IAlog.m76529a("Failed to inject JS", new Object[0]);
        }
    }
}
