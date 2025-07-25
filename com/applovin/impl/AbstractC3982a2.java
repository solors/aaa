package com.applovin.impl;

import java.util.ArrayList;

/* renamed from: com.applovin.impl.a2 */
/* loaded from: classes2.dex */
public abstract class AbstractC3982a2 implements InterfaceC4509h5 {

    /* renamed from: a */
    private final boolean f4466a;

    /* renamed from: b */
    private final ArrayList f4467b = new ArrayList(1);

    /* renamed from: c */
    private int f4468c;

    /* renamed from: d */
    private C4698k5 f4469d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3982a2(boolean z) {
        this.f4466a = z;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public final void mo94272a(InterfaceC5862xo interfaceC5862xo) {
        AbstractC4100b1.m100583a(interfaceC5862xo);
        if (!this.f4467b.contains(interfaceC5862xo)) {
            this.f4467b.add(interfaceC5862xo);
            this.f4468c++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m101076b(C4698k5 c4698k5) {
        for (int i = 0; i < this.f4468c; i++) {
            ((InterfaceC5862xo) this.f4467b.get(i)).mo93045b(this, c4698k5, this.f4466a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m101075c(C4698k5 c4698k5) {
        this.f4469d = c4698k5;
        for (int i = 0; i < this.f4468c; i++) {
            ((InterfaceC5862xo) this.f4467b.get(i)).mo93047a(this, c4698k5, this.f4466a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m101074d(int i) {
        C4698k5 c4698k5 = (C4698k5) AbstractC5863xp.m93017a(this.f4469d);
        for (int i2 = 0; i2 < this.f4468c; i2++) {
            ((InterfaceC5862xo) this.f4467b.get(i2)).mo93046a(this, c4698k5, this.f4466a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m101073g() {
        C4698k5 c4698k5 = (C4698k5) AbstractC5863xp.m93017a(this.f4469d);
        for (int i = 0; i < this.f4468c; i++) {
            ((InterfaceC5862xo) this.f4467b.get(i)).mo93044c(this, c4698k5, this.f4466a);
        }
        this.f4469d = null;
    }
}
