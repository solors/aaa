package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC15476u0;

/* renamed from: com.fyber.inneractive.sdk.config.d */
/* loaded from: classes4.dex */
public final class C14344d implements InterfaceC15476u0 {

    /* renamed from: a */
    public final /* synthetic */ C14345e f27161a;

    public C14344d(C14345e c14345e) {
        this.f27161a = c14345e;
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15476u0
    /* renamed from: a */
    public final void mo76451a() {
        IAlog.m76529a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
        this.f27161a.f27163b = true;
    }
}
