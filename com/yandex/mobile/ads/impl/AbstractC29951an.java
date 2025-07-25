package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.AbstractC29951an;
import com.yandex.mobile.ads.impl.AbstractC30511hx;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.impl.an */
/* loaded from: classes8.dex */
public abstract class AbstractC29951an implements py1 {

    /* renamed from: a */
    private final ArrayDeque<C29952a> f76847a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<ty1> f76848b;

    /* renamed from: c */
    private final PriorityQueue<C29952a> f76849c;
    @Nullable

    /* renamed from: d */
    private C29952a f76850d;

    /* renamed from: e */
    private long f76851e;

    /* renamed from: f */
    private long f76852f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.an$a */
    /* loaded from: classes8.dex */
    public static final class C29952a extends sy1 implements Comparable<C29952a> {

        /* renamed from: k */
        private long f76853k;

        /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[ORIG_RETURN, RETURN] */
        @Override // java.lang.Comparable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compareTo(com.yandex.mobile.ads.impl.AbstractC29951an.C29952a r7) {
            /*
                r6 = this;
                com.yandex.mobile.ads.impl.an$a r7 = (com.yandex.mobile.ads.impl.AbstractC29951an.C29952a) r7
                boolean r0 = r6.m34134f()
                boolean r1 = r7.m34134f()
                if (r0 == r1) goto L13
                boolean r7 = r6.m34134f()
                if (r7 == 0) goto L2f
                goto L2d
            L13:
                long r0 = r6.f79795f
                long r2 = r7.f79795f
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L29
                long r0 = r6.f76853k
                long r4 = r7.f76853k
                long r0 = r0 - r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L29
                r7 = 0
                goto L30
            L29:
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 <= 0) goto L2f
            L2d:
                r7 = 1
                goto L30
            L2f:
                r7 = -1
            L30:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC29951an.C29952a.compareTo(java.lang.Object):int");
        }

        private C29952a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.an$b */
    /* loaded from: classes8.dex */
    public static final class C29953b extends ty1 {

        /* renamed from: f */
        private AbstractC30511hx.InterfaceC30512a<C29953b> f76854f;

        public C29953b(AbstractC30511hx.InterfaceC30512a<C29953b> interfaceC30512a) {
            this.f76854f = interfaceC30512a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30511hx
        /* renamed from: h */
        public final void mo27665h() {
            this.f76854f.mo33446a(this);
        }
    }

    public AbstractC29951an() {
        for (int i = 0; i < 10; i++) {
            this.f76847a.add(new C29952a());
        }
        this.f76848b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f76848b.add(new C29953b(new AbstractC30511hx.InterfaceC30512a() { // from class: com.yandex.mobile.ads.impl.ek2
                {
                    AbstractC29951an.this = this;
                }

                @Override // com.yandex.mobile.ads.impl.AbstractC30511hx.InterfaceC30512a
                /* renamed from: a */
                public final void mo33446a(AbstractC30511hx abstractC30511hx) {
                    AbstractC29951an.this.m35821a((AbstractC29951an.C29953b) abstractC30511hx);
                }
            }));
        }
        this.f76849c = new PriorityQueue<>();
    }

    /* renamed from: b */
    protected abstract void mo26141b(sy1 sy1Var);

    /* renamed from: c */
    protected abstract oy1 mo26140c();

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    /* renamed from: c */
    public void mo25999a(sy1 sy1Var) throws qy1 {
        if (sy1Var == this.f76850d) {
            C29952a c29952a = (C29952a) sy1Var;
            if (c29952a.m34135e()) {
                c29952a.mo28933b();
                this.f76847a.add(c29952a);
            } else {
                long j = this.f76852f;
                this.f76852f = 1 + j;
                c29952a.f76853k = j;
                this.f76849c.add(c29952a);
            }
            this.f76850d = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    @Nullable
    /* renamed from: d */
    public sy1 mo25997b() throws qy1 {
        if (this.f76850d == null) {
            if (this.f76847a.isEmpty()) {
                return null;
            }
            C29952a pollFirst = this.f76847a.pollFirst();
            this.f76850d = pollFirst;
            return pollFirst;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    @Nullable
    /* renamed from: e */
    public ty1 mo26002a() throws qy1 {
        if (this.f76848b.isEmpty()) {
            return null;
        }
        while (!this.f76849c.isEmpty()) {
            int i = y32.f88010a;
            if (this.f76849c.peek().f79795f > this.f76851e) {
                break;
            }
            C29952a poll = this.f76849c.poll();
            if (poll.m34134f()) {
                ty1 pollFirst = this.f76848b.pollFirst();
                pollFirst.m34140b(4);
                poll.mo28933b();
                this.f76847a.add(poll);
                return pollFirst;
            }
            mo26141b(poll);
            if (mo26139h()) {
                oy1 mo26140c = mo26140c();
                ty1 pollFirst2 = this.f76848b.pollFirst();
                pollFirst2.m28934a(poll.f79795f, mo26140c, Long.MAX_VALUE);
                poll.mo28933b();
                this.f76847a.add(poll);
                return pollFirst2;
            }
            poll.mo28933b();
            this.f76847a.add(poll);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: f */
    public final ty1 m35818f() {
        return this.f76848b.pollFirst();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    public void flush() {
        this.f76852f = 0L;
        this.f76851e = 0L;
        while (!this.f76849c.isEmpty()) {
            C29952a poll = this.f76849c.poll();
            int i = y32.f88010a;
            poll.mo28933b();
            this.f76847a.add(poll);
        }
        C29952a c29952a = this.f76850d;
        if (c29952a != null) {
            c29952a.mo28933b();
            this.f76847a.add(c29952a);
            this.f76850d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final long m35817g() {
        return this.f76851e;
    }

    /* renamed from: h */
    protected abstract boolean mo26139h();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m35821a(ty1 ty1Var) {
        ty1Var.mo28933b();
        this.f76848b.add(ty1Var);
    }

    @Override // com.yandex.mobile.ads.impl.py1
    /* renamed from: a */
    public void mo27668a(long j) {
        this.f76851e = j;
    }
}
