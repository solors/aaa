package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14738u;
import com.fyber.inneractive.sdk.p374dv.AbstractC14422a;
import com.fyber.inneractive.sdk.p374dv.C14440i;
import com.fyber.inneractive.sdk.p374dv.interstitial.InterfaceC14441a;

/* renamed from: com.fyber.inneractive.sdk.a */
/* loaded from: classes4.dex */
public abstract class AbstractC14177a extends AbstractC14422a {

    /* renamed from: j */
    public InterfaceC14441a f26850j;

    public AbstractC14177a(InterfaceC14327U interfaceC14327U, C14388r c14388r, C14440i c14440i) {
        super(interfaceC14327U, c14388r, c14440i);
        this.f26850j = null;
    }

    /* renamed from: a */
    public abstract void mo77900a(InterfaceC14441a interfaceC14441a, Activity activity);

    /* renamed from: h */
    public final void m78034h() {
        try {
            new C14740w(EnumC14738u.EVENT_READY_ON_CLIENT, this.f27572a, (C14440i) this.f27573b).m77658a((String) null);
        } catch (Exception unused) {
        }
    }
}
