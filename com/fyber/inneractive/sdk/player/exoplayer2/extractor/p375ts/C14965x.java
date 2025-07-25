package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14844g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15108a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.x */
/* loaded from: classes4.dex */
public final class C14965x {

    /* renamed from: a */
    public final List f29264a;

    /* renamed from: b */
    public final InterfaceC14935r[] f29265b;

    public C14965x(List list) {
        this.f29264a = list;
        this.f29265b = new InterfaceC14935r[list.size()];
    }

    /* renamed from: a */
    public final void m77398a(InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        boolean z;
        for (int i = 0; i < this.f29265b.length; i++) {
            c14940e.m77417a();
            c14940e.m77416b();
            C14844g mo77301a = interfaceC14874j.mo77301a(c14940e.f29055d, 3);
            C15014o c15014o = (C15014o) this.f29264a.get(i);
            String str = c15014o.f29456f;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            AbstractC15108a.m77225a(z, "Invalid closed caption mime type provided: " + str);
            String str2 = c15014o.f29451a;
            if (str2 == null) {
                c14940e.m77416b();
                str2 = c14940e.f29056e;
            }
            mo77301a.mo77419a(C15014o.m77307a(str2, str, c15014o.f29474x, c15014o.f29475y, c15014o.f29476z, null, Long.MAX_VALUE, Collections.emptyList()));
            this.f29265b[i] = mo77301a;
        }
    }
}
