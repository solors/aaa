package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ox1 implements gs0 {

    /* renamed from: b */
    private final InterfaceC30182do f83647b;

    /* renamed from: c */
    private boolean f83648c;

    /* renamed from: d */
    private long f83649d;

    /* renamed from: e */
    private long f83650e;

    /* renamed from: f */
    private ae1 f83651f = ae1.f76770e;

    public ox1(zy1 zy1Var) {
        this.f83647b = zy1Var;
    }

    /* renamed from: a */
    public final void m30867a(long j) {
        this.f83649d = j;
        if (this.f83648c) {
            this.f83650e = this.f83647b.mo25948b();
        }
    }

    /* renamed from: b */
    public final void m30866b() {
        if (this.f83648c) {
            m30867a(mo30560o());
            this.f83648c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.gs0
    public final ae1 getPlaybackParameters() {
        return this.f83651f;
    }

    @Override // com.yandex.mobile.ads.impl.gs0
    /* renamed from: o */
    public final long mo30560o() {
        long m35911a;
        long j = this.f83649d;
        if (this.f83648c) {
            long mo25948b = this.f83647b.mo25948b() - this.f83650e;
            ae1 ae1Var = this.f83651f;
            if (ae1Var.f76771b == 1.0f) {
                m35911a = y32.m27089a(mo25948b);
            } else {
                m35911a = ae1Var.m35911a(mo25948b);
            }
            return j + m35911a;
        }
        return j;
    }

    @Override // com.yandex.mobile.ads.impl.gs0
    /* renamed from: a */
    public final void mo30565a(ae1 ae1Var) {
        if (this.f83648c) {
            m30867a(mo30560o());
        }
        this.f83651f = ae1Var;
    }

    /* renamed from: a */
    public final void m30868a() {
        if (this.f83648c) {
            return;
        }
        this.f83650e = this.f83647b.mo25948b();
        this.f83648c = true;
    }
}
