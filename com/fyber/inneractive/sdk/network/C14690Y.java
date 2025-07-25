package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.network.Y */
/* loaded from: classes4.dex */
public final class C14690Y implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ String f27845a;

    /* renamed from: b */
    public final /* synthetic */ long f27846b;

    public C14690Y(String str, long j) {
        this.f27845a = str;
        this.f27846b = j;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m76529a("Hit Request: Hitting URL finished: %s", this.f27845a);
        if (exc == null) {
            IAlog.m76529a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m76529a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m76529a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f27846b));
    }
}
