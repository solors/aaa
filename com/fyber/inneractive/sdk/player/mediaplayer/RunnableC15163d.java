package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.AbstractC14782q;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.d */
/* loaded from: classes4.dex */
public final class RunnableC15163d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EnumC14795b f29960a;

    /* renamed from: b */
    public final /* synthetic */ C15175p f29961b;

    public RunnableC15163d(C15175p c15175p, EnumC14795b enumC14795b) {
        this.f29961b = c15175p;
        this.f29960a = enumC14795b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC15173n interfaceC15173n = this.f29961b.f29982i;
        if (interfaceC15173n != null) {
            ((AbstractC14782q) interfaceC15173n).m77628a(this.f29960a);
        }
    }
}
