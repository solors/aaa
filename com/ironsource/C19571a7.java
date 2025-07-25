package com.ironsource;

import com.ironsource.C19950g2;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.a7 */
/* loaded from: classes6.dex */
class C19571a7 extends C20073i2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C19571a7(C19950g2 c19950g2, @NotNull InterfaceC21228xk interfaceC21228xk) {
        super(c19950g2, interfaceC21228xk);
    }

    /* renamed from: n */
    private boolean m59465n() {
        if (m58051b().m58479b() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m59463p() {
        if (m58051b().m58477d() >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m59467l() {
        if (m59464o()) {
            IronLog.INTERNAL.verbose();
            m58043i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m59466m() {
        if (m59464o()) {
            IronLog.INTERNAL.verbose();
            m58043i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m59464o() {
        if (m58051b().m58480a() == C19950g2.EnumC19951a.MANUAL_WITH_LOAD_ON_SHOW) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m59462q() {
        if (m59464o() && m58048d()) {
            IronLog.INTERNAL.verbose();
            m58053a(m58051b().m58478c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m59461r() {
        if (!m59465n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (m59464o() && m59463p()) {
            IronLog.INTERNAL.verbose();
            m58053a(m58051b().m58477d());
        }
    }
}
