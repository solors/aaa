package com.applovin.impl;

import com.applovin.impl.InterfaceC5099p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.applovin.impl.z1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5942z1 implements InterfaceC5099p1 {

    /* renamed from: b */
    protected InterfaceC5099p1.C5100a f12408b;

    /* renamed from: c */
    protected InterfaceC5099p1.C5100a f12409c;

    /* renamed from: d */
    private InterfaceC5099p1.C5100a f12410d;

    /* renamed from: e */
    private InterfaceC5099p1.C5100a f12411e;

    /* renamed from: f */
    private ByteBuffer f12412f;

    /* renamed from: g */
    private ByteBuffer f12413g;

    /* renamed from: h */
    private boolean f12414h;

    public AbstractC5942z1() {
        ByteBuffer byteBuffer = InterfaceC5099p1.f8972a;
        this.f12412f = byteBuffer;
        this.f12413g = byteBuffer;
        InterfaceC5099p1.C5100a c5100a = InterfaceC5099p1.C5100a.f8973e;
        this.f12410d = c5100a;
        this.f12411e = c5100a;
        this.f12408b = c5100a;
        this.f12409c = c5100a;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: a */
    public final InterfaceC5099p1.C5100a mo92597a(InterfaceC5099p1.C5100a c5100a) {
        this.f12410d = c5100a;
        this.f12411e = mo92335b(c5100a);
        return mo92594f() ? this.f12411e : InterfaceC5099p1.C5100a.f8973e;
    }

    /* renamed from: b */
    protected abstract InterfaceC5099p1.C5100a mo92335b(InterfaceC5099p1.C5100a c5100a);

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: b */
    public final void mo92596b() {
        this.f12413g = InterfaceC5099p1.f8972a;
        this.f12414h = false;
        this.f12408b = this.f12410d;
        this.f12409c = this.f12411e;
        mo92332g();
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: c */
    public boolean mo92334c() {
        if (this.f12414h && this.f12413g == InterfaceC5099p1.f8972a) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: d */
    public ByteBuffer mo92333d() {
        ByteBuffer byteBuffer = this.f12413g;
        this.f12413g = InterfaceC5099p1.f8972a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: e */
    public final void mo92595e() {
        this.f12414h = true;
        mo92331h();
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: f */
    public boolean mo92594f() {
        if (this.f12411e != InterfaceC5099p1.C5100a.f8973e) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    public final void reset() {
        mo92596b();
        this.f12412f = InterfaceC5099p1.f8972a;
        InterfaceC5099p1.C5100a c5100a = InterfaceC5099p1.C5100a.f8973e;
        this.f12410d = c5100a;
        this.f12411e = c5100a;
        this.f12408b = c5100a;
        this.f12409c = c5100a;
        mo92330i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m92599a() {
        return this.f12413g.hasRemaining();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final ByteBuffer m92598a(int i) {
        if (this.f12412f.capacity() < i) {
            this.f12412f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f12412f.clear();
        }
        ByteBuffer byteBuffer = this.f12412f;
        this.f12413g = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: g */
    protected void mo92332g() {
    }

    /* renamed from: h */
    protected void mo92331h() {
    }

    /* renamed from: i */
    protected void mo92330i() {
    }
}
