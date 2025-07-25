package com.applovin.impl;

import com.applovin.impl.AbstractC5915yg;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: com.applovin.impl.h8 */
/* loaded from: classes2.dex */
public final class C4513h8 implements InterfaceC5075ol {

    /* renamed from: a */
    private final C4106b5 f6574a = new C4106b5();

    /* renamed from: b */
    private final C5278rl f6575b = new C5278rl();

    /* renamed from: c */
    private final Deque f6576c = new ArrayDeque();

    /* renamed from: d */
    private int f6577d;

    /* renamed from: e */
    private boolean f6578e;

    /* renamed from: com.applovin.impl.h8$a */
    /* loaded from: classes2.dex */
    public static final class C4514a implements InterfaceC5019nl {

        /* renamed from: a */
        private final long f6579a;

        /* renamed from: b */
        private final AbstractC4247db f6580b;

        public C4514a(long j, AbstractC4247db abstractC4247db) {
            this.f6579a = j;
            this.f6580b = abstractC4247db;
        }

        @Override // com.applovin.impl.InterfaceC5019nl
        /* renamed from: a */
        public int mo94602a() {
            return 1;
        }

        @Override // com.applovin.impl.InterfaceC5019nl
        /* renamed from: b */
        public List mo94597b(long j) {
            if (j >= this.f6579a) {
                return this.f6580b;
            }
            return AbstractC4247db.m99829h();
        }

        @Override // com.applovin.impl.InterfaceC5019nl
        /* renamed from: a */
        public long mo94601a(int i) {
            AbstractC4100b1.m100580a(i == 0);
            return this.f6579a;
        }

        @Override // com.applovin.impl.InterfaceC5019nl
        /* renamed from: a */
        public int mo94600a(long j) {
            return this.f6579a > j ? 0 : -1;
        }
    }

    public C4513h8() {
        for (int i = 0; i < 2; i++) {
            this.f6576c.addFirst(new C4399fk(new AbstractC5915yg.InterfaceC5916a() { // from class: com.applovin.impl.sx
                {
                    C4513h8.this = this;
                }

                @Override // com.applovin.impl.AbstractC5915yg.InterfaceC5916a
                /* renamed from: a */
                public final void mo92743a(AbstractC5915yg abstractC5915yg) {
                    C4513h8.this.m98770a((AbstractC5519sl) abstractC5915yg);
                }
            }));
        }
        this.f6577d = 0;
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: b */
    public void mo92589b() {
        AbstractC4100b1.m100577b(!this.f6578e);
        this.f6575b.mo94598b();
        this.f6577d = 0;
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: e */
    public C5278rl mo97860d() {
        AbstractC4100b1.m100577b(!this.f6578e);
        if (this.f6577d != 0) {
            return null;
        }
        this.f6577d = 1;
        return this.f6575b;
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: f */
    public AbstractC5519sl mo92869c() {
        AbstractC4100b1.m100577b(!this.f6578e);
        if (this.f6577d == 2 && !this.f6576c.isEmpty()) {
            AbstractC5519sl abstractC5519sl = (AbstractC5519sl) this.f6576c.removeFirst();
            if (this.f6575b.m97866e()) {
                abstractC5519sl.m97871b(4);
            } else {
                C5278rl c5278rl = this.f6575b;
                abstractC5519sl.m94599a(this.f6575b.f8727f, new C4514a(c5278rl.f8727f, this.f6574a.m100568a(((ByteBuffer) AbstractC4100b1.m100583a(c5278rl.f8725c)).array())), 0L);
            }
            this.f6575b.mo94598b();
            this.f6577d = 0;
            return abstractC5519sl;
        }
        return null;
    }

    @Override // com.applovin.impl.InterfaceC5075ol
    /* renamed from: a */
    public void mo92591a(long j) {
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: a */
    public void mo97861a(C5278rl c5278rl) {
        AbstractC4100b1.m100577b(!this.f6578e);
        AbstractC4100b1.m100577b(this.f6577d == 1);
        AbstractC4100b1.m100580a(this.f6575b == c5278rl);
        this.f6577d = 2;
    }

    @Override // com.applovin.impl.InterfaceC4749l5
    /* renamed from: a */
    public void mo92593a() {
        this.f6578e = true;
    }

    /* renamed from: a */
    public void m98770a(AbstractC5519sl abstractC5519sl) {
        AbstractC4100b1.m100577b(this.f6576c.size() < 2);
        AbstractC4100b1.m100580a(!this.f6576c.contains(abstractC5519sl));
        abstractC5519sl.mo94598b();
        this.f6576c.addFirst(abstractC5519sl);
    }
}
