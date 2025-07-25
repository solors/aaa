package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.enums.EnumC14795b;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.player.controller.m */
/* loaded from: classes4.dex */
public final class RunnableC14778m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EnumC14795b f28027a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC14782q f28028b;

    public RunnableC14778m(AbstractC14782q abstractC14782q, EnumC14795b enumC14795b) {
        this.f28028b = abstractC14782q;
        this.f28027a = enumC14795b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC14782q abstractC14782q;
        EnumC14795b enumC14795b;
        try {
            try {
                Iterator it = this.f28028b.f28031b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC14781p) it.next()).mo77098a(this.f28027a);
                }
                enumC14795b = this.f28027a;
            } catch (Exception e) {
                if (IAlog.f30554a <= 3) {
                    AbstractC14782q abstractC14782q2 = this.f28028b;
                    abstractC14782q2.getClass();
                    IAlog.m76530a("%sonPlayerStateChanged callback threw an exception!", e, IAlog.m76531a(abstractC14782q2));
                }
                EnumC14795b enumC14795b2 = this.f28027a;
                if (enumC14795b2 == EnumC14795b.Idle || enumC14795b2 == EnumC14795b.Error) {
                    AbstractC15471s.m76465a(this.f28028b.f28039j);
                    abstractC14782q = this.f28028b;
                    abstractC14782q.f28039j = null;
                } else {
                    return;
                }
            }
            if (enumC14795b == EnumC14795b.Idle || enumC14795b == EnumC14795b.Error) {
                AbstractC15471s.m76465a(this.f28028b.f28039j);
                abstractC14782q = this.f28028b;
                abstractC14782q.f28039j = null;
                abstractC14782q.f28040k = null;
            }
        } catch (Throwable th) {
            EnumC14795b enumC14795b3 = this.f28027a;
            if (enumC14795b3 == EnumC14795b.Idle || enumC14795b3 == EnumC14795b.Error) {
                AbstractC15471s.m76465a(this.f28028b.f28039j);
                AbstractC14782q abstractC14782q3 = this.f28028b;
                abstractC14782q3.f28039j = null;
                abstractC14782q3.f28040k = null;
            }
            throw th;
        }
    }
}
