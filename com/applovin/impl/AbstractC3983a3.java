package com.applovin.impl;

import com.applovin.impl.AbstractC3983a3;
import com.applovin.impl.AbstractC5915yg;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.a3 */
/* loaded from: classes2.dex */
public abstract class AbstractC3983a3 implements InterfaceC5075ol {

    /* renamed from: a */
    private final ArrayDeque f4472a = new ArrayDeque();

    /* renamed from: b */
    private final ArrayDeque f4473b;

    /* renamed from: c */
    private final PriorityQueue f4474c;

    /* renamed from: d */
    private C3985b f4475d;

    /* renamed from: e */
    private long f4476e;

    /* renamed from: f */
    private long f4477f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.a3$b */
    /* loaded from: classes2.dex */
    public static final class C3985b extends C5278rl implements Comparable {

        /* renamed from: k */
        private long f4478k;

        private C3985b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C3985b c3985b) {
            if (m97866e() != c3985b.m97866e()) {
                return m97866e() ? 1 : -1;
            }
            long j = this.f8727f - c3985b.f8727f;
            if (j == 0) {
                j = this.f4478k - c3985b.f4478k;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.a3$c */
    /* loaded from: classes2.dex */
    public static final class C3986c extends AbstractC5519sl {

        /* renamed from: g */
        private AbstractC5915yg.InterfaceC5916a f4479g;

        public C3986c(AbstractC5915yg.InterfaceC5916a interfaceC5916a) {
            this.f4479g = interfaceC5916a;
        }

        @Override // com.applovin.impl.AbstractC5915yg
        /* renamed from: g */
        public final void mo92744g() {
            this.f4479g.mo92743a(this);
        }
    }

    public AbstractC3983a3() {
        for (int i = 0; i < 10; i++) {
            this.f4472a.add(new C3985b());
        }
        this.f4473b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f4473b.add(new C3986c(new AbstractC5915yg.InterfaceC5916a() { // from class: com.applovin.impl.is
                {
                    AbstractC3983a3.this = this;
                }

                @Override // com.applovin.impl.AbstractC5915yg.InterfaceC5916a
                /* renamed from: a */
                public final void mo92743a(AbstractC5915yg abstractC5915yg) {
                    AbstractC3983a3.this.m101071a((AbstractC5519sl) ((AbstractC3983a3.C3986c) abstractC5915yg));
                }
            }));
        }
        this.f4474c = new PriorityQueue();
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: a */
    public void mo92593a() {
    }

    /* renamed from: a */
    protected abstract void mo92590a(C5278rl c5278rl);

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: b */
    public void mo92589b() {
        this.f4477f = 0L;
        this.f4476e = 0L;
        while (!this.f4474c.isEmpty()) {
            m101072a((C3985b) AbstractC5863xp.m93017a((C3985b) this.f4474c.poll()));
        }
        C3985b c3985b = this.f4475d;
        if (c3985b != null) {
            m101072a(c3985b);
            this.f4475d = null;
        }
    }

    /* renamed from: e */
    protected abstract InterfaceC5019nl mo92584e();

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: f */
    public C5278rl mo97860d() {
        boolean z;
        if (this.f4475d == null) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        if (this.f4472a.isEmpty()) {
            return null;
        }
        C3985b c3985b = (C3985b) this.f4472a.pollFirst();
        this.f4475d = c3985b;
        return c3985b;
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: g */
    public AbstractC5519sl mo92869c() {
        if (this.f4473b.isEmpty()) {
            return null;
        }
        while (!this.f4474c.isEmpty() && ((C3985b) AbstractC5863xp.m93017a((C3985b) this.f4474c.peek())).f8727f <= this.f4476e) {
            C3985b c3985b = (C3985b) AbstractC5863xp.m93017a((C3985b) this.f4474c.poll());
            if (c3985b.m97866e()) {
                AbstractC5519sl abstractC5519sl = (AbstractC5519sl) AbstractC5863xp.m93017a((AbstractC5519sl) this.f4473b.pollFirst());
                abstractC5519sl.m97871b(4);
                m101072a(c3985b);
                return abstractC5519sl;
            }
            mo92590a((C5278rl) c3985b);
            if (mo92576j()) {
                InterfaceC5019nl mo92584e = mo92584e();
                AbstractC5519sl abstractC5519sl2 = (AbstractC5519sl) AbstractC5863xp.m93017a((AbstractC5519sl) this.f4473b.pollFirst());
                abstractC5519sl2.m94599a(c3985b.f8727f, mo92584e, Long.MAX_VALUE);
                m101072a(c3985b);
                return abstractC5519sl2;
            }
            m101072a(c3985b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final AbstractC5519sl m101070h() {
        return (AbstractC5519sl) this.f4473b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final long m101069i() {
        return this.f4476e;
    }

    /* renamed from: j */
    protected abstract boolean mo92576j();

    /* renamed from: a */
    private void m101072a(C3985b c3985b) {
        c3985b.mo94598b();
        this.f4472a.add(c3985b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m101071a(AbstractC5519sl abstractC5519sl) {
        abstractC5519sl.mo94598b();
        this.f4473b.add(abstractC5519sl);
    }

    @Override // com.applovin.impl.InterfaceC5075ol
    /* renamed from: a */
    public void mo92591a(long j) {
        this.f4476e = j;
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: b */
    public void mo97861a(C5278rl c5278rl) {
        AbstractC4100b1.m100580a(c5278rl == this.f4475d);
        C3985b c3985b = (C3985b) c5278rl;
        if (c3985b.m97868d()) {
            m101072a(c3985b);
        } else {
            long j = this.f4477f;
            this.f4477f = 1 + j;
            c3985b.f4478k = j;
            this.f4474c.add(c3985b);
        }
        this.f4475d = null;
    }
}
