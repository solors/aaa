package io.bidmachine.rendering.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.bidmachine.rendering.internal.d */
/* loaded from: classes9.dex */
public class C37025d implements InterfaceC37000c {

    /* renamed from: a */
    private final AtomicBoolean f97723a = new AtomicBoolean(false);

    /* renamed from: b */
    private final AtomicBoolean f97724b = new AtomicBoolean(false);

    /* renamed from: c */
    private final AtomicBoolean f97725c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicBoolean f97726d = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicBoolean f97727e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f97728f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AtomicBoolean f97729g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f97730h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f97731i = new AtomicBoolean(false);

    /* renamed from: j */
    private final AtomicBoolean f97732j = new AtomicBoolean(false);

    /* renamed from: k */
    private final AtomicBoolean f97733k = new AtomicBoolean(false);

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: a */
    public void mo19231a() {
        this.f97726d.set(true);
        this.f97723a.set(false);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: b */
    public boolean mo19229b() {
        return this.f97723a.get() && !m19218l();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: c */
    public boolean mo19227c() {
        return this.f97724b.compareAndSet(false, true);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: d */
    public boolean mo19226d() {
        return this.f97725c.get();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: e */
    public boolean mo19225e() {
        return this.f97730h.compareAndSet(false, true);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: f */
    public boolean mo19224f() {
        return this.f97729g.compareAndSet(false, true);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: g */
    public boolean mo19223g() {
        return this.f97731i.get();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: h */
    public boolean mo19222h() {
        return this.f97728f.compareAndSet(false, true);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: i */
    public boolean mo19221i() {
        return this.f97731i.compareAndSet(false, true);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: j */
    public boolean mo19220j() {
        return this.f97733k.compareAndSet(false, true);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: k */
    public void mo19219k() {
        this.f97725c.set(true);
    }

    /* renamed from: l */
    public boolean m19218l() {
        return this.f97726d.get();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: a */
    public boolean mo19230a(boolean z) {
        this.f97724b.set(false);
        this.f97723a.set(z);
        return this.f97727e.compareAndSet(false, true) && !m19218l();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37000c
    /* renamed from: b */
    public boolean mo19228b(boolean z) {
        return this.f97732j.compareAndSet(!z, z);
    }
}
