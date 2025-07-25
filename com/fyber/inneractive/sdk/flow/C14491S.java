package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.C14328V;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC14501b;
import com.fyber.inneractive.sdk.flow.endcard.C14508i;
import com.fyber.inneractive.sdk.flow.endcard.C14509j;
import com.fyber.inneractive.sdk.player.C14745b;
import com.fyber.inneractive.sdk.player.C15176n;
import com.fyber.inneractive.sdk.player.C15182t;
import com.fyber.inneractive.sdk.player.controller.AbstractC14782q;
import com.fyber.inneractive.sdk.player.p376ui.remote.C15208h;
import com.fyber.inneractive.sdk.response.C15388g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C15509W;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.flow.S */
/* loaded from: classes4.dex */
public final class C14491S extends AbstractC14551w {

    /* renamed from: i */
    public C15182t f27431i;

    /* renamed from: j */
    public boolean f27432j;

    public C14491S(InterfaceC14327U interfaceC14327U, C14388r c14388r, C15388g c15388g, InneractiveAdRequest inneractiveAdRequest) {
        super(interfaceC14327U, c14388r);
        this.f27432j = false;
        this.f27573b = c15388g;
        this.f27572a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: a */
    public final void mo77811a() {
        C15176n c15176n;
        if (this.f27570g != null && mo77806d()) {
            C15509W c15509w = this.f27570g;
            c15509w.f30716y = true;
            c15509w.f30690D = false;
            c15509w.f30693b.f27599h.remove(c15509w);
            c15509w.f30700i = null;
            IAlog.m76529a("destroy internalStoreWebpageController", new Object[0]);
            this.f27570g = null;
        }
        C15182t c15182t = this.f27431i;
        if (c15182t != null) {
            C14745b c14745b = c15182t.f30007a;
            if (c14745b != null && (c15176n = c14745b.f27941b) != null) {
                c15176n.f29941i = true;
                IAlog.m76529a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                AbstractC14501b m77854a = c15176n.f29999t.m77854a();
                if (m77854a != null) {
                    m77854a.destroy();
                }
                AbstractC14782q abstractC14782q = c15176n.f29933a;
                if (abstractC14782q != null) {
                    abstractC14782q.mo77634a();
                    c15176n.f29933a = null;
                }
                c15176n.f29944l = null;
                C14508i c14508i = c15176n.f29999t;
                if (c14508i != null) {
                    C14509j c14509j = c14508i.f27469b;
                    Iterator it = c14509j.f27473a.iterator();
                    while (it.hasNext()) {
                        ((AbstractC14501b) it.next()).destroy();
                    }
                    c14509j.f27473a.clear();
                    c14509j.f27474b.clear();
                    c14509j.f27475c = -1;
                }
                C15208h c15208h = c15176n.f30000u;
                if (c15208h != null) {
                    c15208h.f30119a.m77077a();
                }
            }
            this.f27431i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: d */
    public final boolean mo77806d() {
        C14328V c14328v = ((C14326T) this.f27575d).f27125f;
        if (c14328v == null) {
            return false;
        }
        UnitDisplayType unitDisplayType = c14328v.f27136j;
        if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType) && !UnitDisplayType.VERTICAL.equals(unitDisplayType)) {
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: f */
    public final boolean mo77804f() {
        if (this.f27431i != null) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    public boolean isVideoAd() {
        return true;
    }
}
