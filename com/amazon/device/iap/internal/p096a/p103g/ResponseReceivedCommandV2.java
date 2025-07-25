package com.amazon.device.iap.internal.p096a.p103g;

import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* renamed from: com.amazon.device.iap.internal.a.g.c */
/* loaded from: classes2.dex */
public final class ResponseReceivedCommandV2 extends ResponseReceivedCommandBase {
    public ResponseReceivedCommandV2(C3712c c3712c, boolean z) {
        super(c3712c, "2.0");
        m102923a(KiwiConstants.f2696aa, Boolean.valueOf(z));
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: l */
    public void mo102445l() {
        Object m103043a = m102918j().mo102462a().m103043a(KiwiConstants.f2708am);
        if (m103043a != null) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(m103043a)) {
                m102923a(KiwiConstants.f2697ab, bool);
                super.mo102445l();
            }
        }
        m102923a(KiwiConstants.f2697ab, Boolean.FALSE);
        super.mo102445l();
    }
}
