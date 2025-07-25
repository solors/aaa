package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.AbstractC14782q;
import com.fyber.inneractive.sdk.player.controller.RunnableC14775j;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a */
/* loaded from: classes4.dex */
public final class RunnableC15160a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f29955a;

    /* renamed from: b */
    public final /* synthetic */ int f29956b;

    /* renamed from: c */
    public final /* synthetic */ C15175p f29957c;

    public RunnableC15160a(C15175p c15175p, int i, int i2) {
        this.f29957c = c15175p;
        this.f29955a = i;
        this.f29956b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29957c.f29982i != null) {
            Locale locale = Locale.ENGLISH;
            String str = "Player Error: " + this.f29955a + ", " + this.f29956b;
            InterfaceC15173n interfaceC15173n = this.f29957c.f29982i;
            C15174o c15174o = new C15174o(str);
            AbstractC14782q abstractC14782q = (AbstractC14782q) interfaceC15173n;
            abstractC14782q.m77628a(EnumC14795b.Error);
            IAlog.m76529a("%sonPlayerError called with: %s for onPlayerError", IAlog.m76531a(abstractC14782q), c15174o);
            abstractC14782q.f28038i.post(new RunnableC14775j(abstractC14782q, c15174o));
            abstractC14782q.m77613k();
        }
    }
}
