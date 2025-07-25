package com.applovin.impl;

import java.util.List;

/* renamed from: com.applovin.impl.sl */
/* loaded from: classes2.dex */
public abstract class AbstractC5519sl extends AbstractC5915yg implements InterfaceC5019nl {

    /* renamed from: d */
    private InterfaceC5019nl f10753d;

    /* renamed from: f */
    private long f10754f;

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public long mo94601a(int i) {
        return ((InterfaceC5019nl) AbstractC4100b1.m100583a(this.f10753d)).mo94601a(i) + this.f10754f;
    }

    @Override // com.applovin.impl.AbstractC4746l2
    /* renamed from: b */
    public void mo94598b() {
        super.mo94598b();
        this.f10753d = null;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94602a() {
        return ((InterfaceC5019nl) AbstractC4100b1.m100583a(this.f10753d)).mo94602a();
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94600a(long j) {
        return ((InterfaceC5019nl) AbstractC4100b1.m100583a(this.f10753d)).mo94600a(j - this.f10754f);
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: b */
    public List mo94597b(long j) {
        return ((InterfaceC5019nl) AbstractC4100b1.m100583a(this.f10753d)).mo94597b(j - this.f10754f);
    }

    /* renamed from: a */
    public void m94599a(long j, InterfaceC5019nl interfaceC5019nl, long j2) {
        this.f12342b = j;
        this.f10753d = interfaceC5019nl;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f10754f = j;
    }
}
