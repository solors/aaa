package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bykv.vk.openvk.preload.b.d */
/* loaded from: classes3.dex */
public abstract class Interceptor<IN, OUT> {

    /* renamed from: d */
    private static AtomicLong f13898d = new AtomicLong();

    /* renamed from: a */
    Interceptor f13899a;

    /* renamed from: b */
    IN f13900b;

    /* renamed from: c */
    OUT f13901c;

    /* renamed from: e */
    private AbstractC6618a f13902e;

    /* renamed from: f */
    private Chain f13903f;

    /* renamed from: g */
    private long f13904g;

    /* renamed from: a */
    public abstract Object mo91295a(Chain<OUT> chain, IN in) throws Throwable;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91298a(Object... objArr) {
    }

    /* renamed from: b */
    public final long m91469b() {
        return this.f13904g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m91467c() {
        AbstractC6618a abstractC6618a = this.f13902e;
        if (abstractC6618a == null) {
            return;
        }
        abstractC6618a.mo91246a(this.f13903f, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m91465d() {
        AbstractC6618a abstractC6618a = this.f13902e;
        if (abstractC6618a == null) {
            return;
        }
        abstractC6618a.mo91247c(this.f13903f, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m91463e() {
        AbstractC6618a abstractC6618a = this.f13902e;
        if (abstractC6618a == null) {
            return;
        }
        abstractC6618a.mo91244b(this.f13903f, this);
    }

    /* renamed from: f */
    public final OUT m91462f() {
        return this.f13901c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m91470a(Chain chain, Interceptor interceptor, IN in, AbstractC6618a abstractC6618a, Object[] objArr) {
        this.f13903f = new Factory(chain);
        this.f13899a = interceptor;
        this.f13900b = in;
        this.f13902e = abstractC6618a;
        if (interceptor != null) {
            this.f13904g = interceptor.f13904g;
        } else {
            long andIncrement = f13898d.getAndIncrement();
            this.f13904g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        mo91298a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m91468b(Throwable th) {
        AbstractC6618a abstractC6618a = this.f13902e;
        if (abstractC6618a == null) {
            return;
        }
        abstractC6618a.mo91245a(this.f13903f, this, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m91466c(Throwable th) {
        AbstractC6618a abstractC6618a = this.f13902e;
        if (abstractC6618a == null) {
            return;
        }
        abstractC6618a.mo91248b(this.f13903f, this, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m91464d(Throwable th) {
        AbstractC6618a abstractC6618a = this.f13902e;
        if (abstractC6618a == null) {
            return;
        }
        abstractC6618a.mo91473c(this.f13903f, this, th);
    }
}
