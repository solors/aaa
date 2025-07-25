package com.applovin.impl;

import com.applovin.impl.AbstractC4406fo;
import com.applovin.impl.InterfaceC5193qh;

/* renamed from: com.applovin.impl.d2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4223d2 implements InterfaceC5193qh {

    /* renamed from: a */
    protected final AbstractC4406fo.C4410d f5443a = new AbstractC4406fo.C4410d();

    /* renamed from: J */
    private int m100036J() {
        int mo96339m = mo96339m();
        if (mo96339m == 1) {
            return 0;
        }
        return mo96339m;
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    /* renamed from: B */
    public final void mo96368B() {
        m100027b(-mo96364F());
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    /* renamed from: D */
    public final void mo96366D() {
        if (!mo96338n().m99123c() && !mo96348d()) {
            boolean m100034L = m100034L();
            if (m100032N() && !mo96327y()) {
                if (m100034L) {
                    m100029Q();
                }
            } else if (m100034L && getCurrentPosition() <= mo96335q()) {
                m100029Q();
            } else {
                mo96360a(0L);
            }
        }
    }

    /* renamed from: G */
    public final long m100039G() {
        AbstractC4406fo mo96338n = mo96338n();
        if (mo96338n.m99123c()) {
            return -9223372036854775807L;
        }
        return mo96338n.m99131a(mo96332t(), this.f5443a).m99092d();
    }

    /* renamed from: H */
    public final int m100038H() {
        AbstractC4406fo mo96338n = mo96338n();
        if (mo96338n.m99123c()) {
            return -1;
        }
        return mo96338n.mo98767a(mo96332t(), m100036J(), mo96334r());
    }

    /* renamed from: I */
    public final int m100037I() {
        AbstractC4406fo mo96338n = mo96338n();
        if (mo96338n.m99123c()) {
            return -1;
        }
        return mo96338n.mo98765b(mo96332t(), m100036J(), mo96334r());
    }

    /* renamed from: K */
    public final boolean m100035K() {
        if (m100038H() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m100034L() {
        if (m100037I() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m100033M() {
        AbstractC4406fo mo96338n = mo96338n();
        if (!mo96338n.m99123c() && mo96338n.m99131a(mo96332t(), this.f5443a).f6180j) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean m100032N() {
        AbstractC4406fo mo96338n = mo96338n();
        if (!mo96338n.m99123c() && mo96338n.m99131a(mo96332t(), this.f5443a).m99091e()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final void m100031O() {
        m100026c(mo96332t());
    }

    /* renamed from: P */
    public final void m100030P() {
        int m100038H = m100038H();
        if (m100038H != -1) {
            m100026c(m100038H);
        }
    }

    /* renamed from: Q */
    public final void m100029Q() {
        int m100037I = m100037I();
        if (m100037I != -1) {
            m100026c(m100037I);
        }
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    /* renamed from: a */
    public final void mo96360a(long j) {
        mo96361a(mo96332t(), j);
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    /* renamed from: b */
    public final boolean mo96354b(int i) {
        return mo96343i().m96325a(i);
    }

    /* renamed from: c */
    public final void m100026c(int i) {
        mo96361a(i, -9223372036854775807L);
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    public final boolean isPlaying() {
        if (mo96337o() == 3 && mo96340l() && mo96342j() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    /* renamed from: u */
    public final void mo96331u() {
        if (!mo96338n().m99123c() && !mo96348d()) {
            if (m100035K()) {
                m100030P();
            } else if (m100032N() && m100033M()) {
                m100031O();
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    /* renamed from: w */
    public final void mo96329w() {
        m100027b(mo96347e());
    }

    @Override // com.applovin.impl.InterfaceC5193qh
    /* renamed from: y */
    public final boolean mo96327y() {
        AbstractC4406fo mo96338n = mo96338n();
        if (!mo96338n.m99123c() && mo96338n.m99131a(mo96332t(), this.f5443a).f6179i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m100027b(long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo96360a(Math.max(currentPosition, 0L));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public InterfaceC5193qh.C5195b m100028a(InterfaceC5193qh.C5195b c5195b) {
        boolean z = true;
        InterfaceC5193qh.C5195b.C5196a m96318a = new InterfaceC5193qh.C5195b.C5196a().m96317a(c5195b).m96318a(3, !mo96348d()).m96318a(4, mo96327y() && !mo96348d()).m96318a(5, m100034L() && !mo96348d()).m96318a(6, !mo96338n().m99123c() && (m100034L() || !m100032N() || mo96327y()) && !mo96348d()).m96318a(7, m100035K() && !mo96348d()).m96318a(8, !mo96338n().m99123c() && (m100035K() || (m100032N() && m100033M())) && !mo96348d()).m96318a(9, !mo96348d()).m96318a(10, mo96327y() && !mo96348d());
        if (!mo96327y() || mo96348d()) {
            z = false;
        }
        return m96318a.m96318a(11, z).m96320a();
    }
}
