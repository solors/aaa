package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.Partner;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.b9 */
/* loaded from: classes6.dex */
public final class C19218b9 extends AbstractC19204a9 {

    /* renamed from: b */
    public Partner f48109b;

    public C19218b9() {
        String m16628I;
        StringBuilder sb2 = new StringBuilder("a");
        m16628I = StringsJVM.m16628I("10.7.8", ".", "", false, 4, null);
        sb2.append(m16628I);
        this.f48109b = Partner.createPartner("Inmobi", sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r10 != null) goto L3;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60434a(com.inmobi.commons.core.configs.AdConfig r10) {
        /*
            r9 = this;
            if (r10 == 0) goto Le
            com.inmobi.commons.core.configs.AdConfig$ViewabilityConfig r10 = r10.getViewability()     // Catch: java.lang.Exception -> L3c
            if (r10 == 0) goto Le
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r10 = r10.getOmidConfig()     // Catch: java.lang.Exception -> L3c
            if (r10 != 0) goto L13
        Le:
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r10 = new com.inmobi.commons.core.configs.AdConfig$OmidConfig     // Catch: java.lang.Exception -> L3c
            r10.<init>()     // Catch: java.lang.Exception -> L3c
        L13:
            java.lang.String r0 = r10.getPartnerKey()     // Catch: java.lang.Exception -> L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = "a"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = "10.7.8"
            java.lang.String r4 = "."
            java.lang.String r5 = ""
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r2 = kotlin.text.C37686h.m16718I(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L3c
            r1.append(r2)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3c
            com.iab.omid.library.inmobi.adsession.Partner r0 = com.iab.omid.library.inmobi.adsession.Partner.createPartner(r0, r1)     // Catch: java.lang.Exception -> L3c
            r9.f48109b = r0     // Catch: java.lang.Exception -> L3c
            com.inmobi.media.AbstractC19138V8.m60631a(r10)     // Catch: java.lang.Exception -> L3c
            goto L4a
        L3c:
            r10 = move-exception
            com.inmobi.media.Q4 r0 = com.inmobi.media.C19070Q4.f47635a
            java.lang.String r0 = "event"
            com.inmobi.media.J1 r10 = com.inmobi.media.AbstractC19521x4.m59587a(r10, r0)
            com.inmobi.media.y5 r0 = com.inmobi.media.C19070Q4.f47637c
            r0.m59556a(r10)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19218b9.m60434a(com.inmobi.commons.core.configs.AdConfig):void");
    }
}
