package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.InterfaceC14671E;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.ignite.f */
/* loaded from: classes4.dex */
public final class C14561f implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ String f27588a;

    public C14561f(String str) {
        this.f27588a = str;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m76529a("Hit Request: Hitting URL finished: %s", this.f27588a);
        if (exc == null) {
            IAlog.m76529a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m76529a("Hit Request: Hitting URL failed: %s", exc);
        }
    }
}
