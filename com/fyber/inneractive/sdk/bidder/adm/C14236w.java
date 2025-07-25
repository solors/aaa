package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.metrics.C14602d;
import com.fyber.inneractive.sdk.metrics.C14606h;
import com.fyber.inneractive.sdk.metrics.C14607i;
import com.fyber.inneractive.sdk.network.InterfaceC14682P;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.w */
/* loaded from: classes4.dex */
public final class C14236w implements InterfaceC14682P {

    /* renamed from: a */
    public final /* synthetic */ C14238y f26907a;

    public C14236w(C14238y c14238y) {
        this.f26907a = c14238y;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14682P
    /* renamed from: a */
    public final void mo77674a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1392135285:
                if (str.equals("sdkInitNetworkRequest")) {
                    c = 0;
                    break;
                }
                break;
            case 740780854:
                if (str.equals("sdkGotServerResponse")) {
                    c = 1;
                    break;
                }
                break;
            case 1745989196:
                if (str.equals("sdkParsedResponse")) {
                    c = 2;
                    break;
                }
                break;
            case 1903994790:
                if (str.equals("sdkRequestEndedButWillBeRetried")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C14602d c14602d = C14602d.f27666d;
                c14602d.m77771a(this.f26907a.f26912d).mo77764f();
                c14602d.m77770b(this.f26907a.f26912d).f27682c = System.currentTimeMillis();
                return;
            case 1:
                C14602d.f27666d.m77771a(this.f26907a.f26912d).mo77762h();
                return;
            case 2:
                C14602d.f27666d.m77771a(this.f26907a.f26912d).mo77766d();
                return;
            case 3:
                C14607i m77770b = C14602d.f27666d.m77770b(this.f26907a.f26912d);
                m77770b.f27680a.put(new C14606h("retrying"), Long.valueOf(System.currentTimeMillis() - m77770b.f27682c));
                return;
            default:
                return;
        }
    }
}
